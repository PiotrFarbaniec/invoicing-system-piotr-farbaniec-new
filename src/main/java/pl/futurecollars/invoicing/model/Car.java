package pl.futurecollars.invoicing.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
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
public class Car {

  @Id
  @JsonIgnore
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "ID - automatically generated by the application", required = true, example = "1")
  private Integer id;

  @ApiModelProperty(value = "Car registration number", required = true, example = "KR 45777")
  private String registrationNumber;

  @ApiModelProperty(value = "Information is the vehicle also used privately", required = true, example = "true/false")
  private boolean isUsedPrivately;
}
