package group.bootcamp.technicaltest.feature.carbrand.model;

import group.bootcamp.technicaltest.entities.Constant;
import group.bootcamp.technicaltest.feature.carbrand.dto.CarBrandDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedNativeQuery;

import java.time.LocalDateTime;

@Entity
@Table(name = "car_brand")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@NamedNativeQuery(
        name = Constant.NativeQuery.GET_BRAND_CD_DESC,
        query = "SELECT id as cd_brand, name as desc_brand FROM car_brand WHERE " +
                "id like CONCAT('%', :keyword, '%') " +
                "OR name like CONCAT('%', :keyword, '%') " +
                "OR description like CONCAT('%', :keyword, '%') ",
        resultClass = CarBrandDto.class
)
public class CarBrand {
    @Id
    private String id;
    private String name;
    private String description;
    private String countryOfOrigin;
    private LocalDateTime yearOfEstablishment;
    private Integer countModel;
}


//    ID Merek: Sebuah identifikasi unik untuk merek mobil.
//        Nama Merek: Nama merek atau merek mobil.
//        Negara Asal: Negara asal merek mobil.
//        Tahun Pendirian: Tahun pendirian merek mobil.
//        Logo: Logo merek mobil (gambar).
//        Deskripsi: Deskripsi singkat tentang merek mobil.
//        Tanggal Pembaruan Terakhir: Tanggal terakhir merek mobil diperbarui di sistem.
//        Pencipta: Nama pabrikan atau perusahaan yang menciptakan merek mobil.
//        Situs Web: Situs web resmi merek mobil.
//        Jumlah Model: Jumlah model mobil yang dimiliki merek.