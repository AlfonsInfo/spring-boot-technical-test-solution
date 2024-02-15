package group.bootcamp.technicaltest.feature.carbrand.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import group.bootcamp.technicaltest.utils.validation.NoSpecialCharacters;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestGetFilteredUnitBrand {

    @JsonProperty("getListFilterUnitBrand")
    @Valid
    private View getListFilterUnitBrand;
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    //@JsonNaming(ScreamingSnakeCaseStrategy.class) pSearch -> PSEARCH
    public static class View{

        @JsonProperty("P_SEARCH")
        @NoSpecialCharacters
        @NotNull
        private String pSearch;
    }
}
