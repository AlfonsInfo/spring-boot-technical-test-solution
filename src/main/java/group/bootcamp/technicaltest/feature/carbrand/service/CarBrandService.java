package group.bootcamp.technicaltest.feature.carbrand.service;

import group.bootcamp.technicaltest.entities.schema.BaseResponse;
import group.bootcamp.technicaltest.feature.carbrand.dto.CarBrandDto;
import group.bootcamp.technicaltest.feature.carbrand.dto.RequestGetFilteredUnitBrand;
import group.bootcamp.technicaltest.feature.carbrand.repository.CarBrandRepository;
import group.bootcamp.technicaltest.utils.validation.ValidationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CarBrandService {

    private final ValidationService validationService;

    private final CarBrandRepository carBrandRepository;

    @Autowired
    public CarBrandService(ValidationService validationService, CarBrandRepository carBrandRepository) {
        this.validationService = validationService;
        this.carBrandRepository = carBrandRepository;
    }

    public BaseResponse<List<CarBrandDto>> getListFilteredUnitBrand(
            RequestGetFilteredUnitBrand requestGetListFilteredUnitBrand
    ){
        validationService.validate(requestGetListFilteredUnitBrand);
        String searchKey = requestGetListFilteredUnitBrand.getGetListFilterUnitBrand().getPSearch();
        List<CarBrandDto> carBrands = carBrandRepository.findByKeyword(searchKey);
        BaseResponse<List<CarBrandDto>> response = new BaseResponse<>();
        return response.successResponse(carBrands,null);
    }
}
