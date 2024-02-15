package group.bootcamp.technicaltest.feature.carbrand.repository;

import group.bootcamp.technicaltest.entities.Constant;
import group.bootcamp.technicaltest.feature.carbrand.dto.CarBrandDto;
import group.bootcamp.technicaltest.feature.carbrand.model.CarBrand;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarBrandRepository extends JpaRepository<CarBrand, String> {

    List<CarBrand> findByIdOrDescription(String value1, String value2);


    @Query(nativeQuery = true,name = Constant.NativeQuery.GET_BRAND_CD_DESC)
    List<CarBrandDto> findByKeyword(@Param("keyword") String keyword );

    //todo : map to CarBrandDto directly (issue mapping) (agar tidak query all column & mapping)

}
