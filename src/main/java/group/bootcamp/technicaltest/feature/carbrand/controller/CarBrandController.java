package group.bootcamp.technicaltest.feature.carbrand.controller;

import group.bootcamp.technicaltest.feature.carbrand.dto.CarBrandDto;
import group.bootcamp.technicaltest.feature.carbrand.dto.RequestGetFilteredUnitBrand;
import group.bootcamp.technicaltest.feature.carbrand.service.CarBrandService;
import group.bootcamp.technicaltest.entities.Constant;
import group.bootcamp.technicaltest.entities.schema.BaseResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping(Constant.Endpoint.CAR_BRAND)
@RestController
public class CarBrandController {

    private final CarBrandService carBrandService;

    @Autowired
    public CarBrandController(CarBrandService carBrandService) {
        this.carBrandService = carBrandService;
    }

    @PostMapping

    @Tag(name = "Brand API")
    @Parameter(
            name = Constant.PARAMS_KEY.API_KEY,
            allowEmptyValue = true,
            description = "a key for gain permission access",
            in = ParameterIn.HEADER
    )
    public BaseResponse<List<CarBrandDto>> getListFilteredUnitBrand(
            @RequestBody RequestGetFilteredUnitBrand requestGetListFilteredUnitBrand
    ){
        return carBrandService.getListFilteredUnitBrand(requestGetListFilteredUnitBrand);
    }
}
