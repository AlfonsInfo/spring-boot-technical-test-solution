package group.bootcamp.technicaltest.feature.carbrand.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class CarBrandDto {
    @Id
    private String cdBrand;
    private String descBrand;
}
