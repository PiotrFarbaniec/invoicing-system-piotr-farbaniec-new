package pl.futurecollars.invoicing.model;

import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Invoice {

  @ApiModelProperty(value = "Invoice ID - automatically generated by the app", required = true)
  private int id;
  @ApiModelProperty(value = "Date of issue of the invoice", required = true)
  private LocalDate date;
  @ApiModelProperty(value = "Company purchasing the product/service", required = true)
  private Company buyer;
  @ApiModelProperty(value = "Company selling the product/service", required = true)
  private Company seller;
  @ApiModelProperty(value = "All invoiced products/services", required = true)
  private InvoiceEntry[] entries; // ZMIANA NA TABLICĘ INVOICE_ENTRY

  public Invoice() {
  }

  public Invoice(int id, LocalDate date, Company buyer, Company seller, InvoiceEntry... entries) {
    this.id = id; // ZMIANA NA TABLICĘ
    this.date = date;
    this.buyer = buyer;
    this.seller = seller;
    this.entries = entries;
  }
}
