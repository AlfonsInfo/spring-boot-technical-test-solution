package group.bootcamp.technicaltest.entities.schema;

import group.bootcamp.technicaltest.entities.Constant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse <T> {
    private String outStat;
    private String outMess;
    private T outData;

    public BaseResponse<T> successResponse(T data, String message){
        if(Objects.isNull(message)){
            message = Constant.ResponseMessaging.DEFAULT_SUCCESS_RESPONSE;
        }

        this.setOutStat(Constant.ResponseMessaging.SUCCESS_FLAG);
        this.setOutMess(message);
        this.setOutData(data);
        return this;
    }


    public BaseResponse<T> failedResponse(T data, String message){
        if(Objects.isNull(message)){
            message = Constant.ResponseMessaging.DEFAULT_BAD_RESPONSE;
        }

        this.setOutStat(Constant.ResponseMessaging.FAILED_FLAG);
        this.setOutMess(message);
        this.setOutData(data);
        return this;
    }
}
