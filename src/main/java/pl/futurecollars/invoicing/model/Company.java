package pl.futurecollars.invoicing.model;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company implements WithId {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID - automatically generated by the application", required = true, example = "1")
  private Integer id;

  @ApiModelProperty(value = "Tax identyfication number", required = true, example = "555-444-33-22")
  private String taxIdentification;

  @ApiModelProperty(value = "Company address", required = true, example = "30-010 Krakow, Wroclawska 7")
  private String address;

  @ApiModelProperty(value = "Company name", required = true, example = "Best Code S.A.")
  private String name;

  @Builder.Default
  @ApiModelProperty(value = "Pension insurance expenses", required = true, example = "873.43")
  private BigDecimal pensionInsurance = BigDecimal.ZERO;

  @Builder.Default
  @ApiModelProperty(value = "Health insurance expenses", required = true, example = "420.88")
  private BigDecimal healthInsurance = BigDecimal.ZERO;

  @Override
  public void setId(Integer id) {
    this.id = id;
  }
}
