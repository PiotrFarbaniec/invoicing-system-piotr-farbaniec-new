package pl.futurecollars.invoicing.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {

  @ApiModelProperty(value = "Car registration number", required = true, example = "KR 45777")
  private String registrationNumber;
  @ApiModelProperty(value = "Information is the vehicle also used privately", required = true, example = "true/false")
  private boolean isUsedPrivately;
  /* @ApiModelProperty(value = "Expenses related with car usage while selling products/services", required = true, example = "182.27")
  private BigDecimal expenses; */
}
