package group.bootcamp.technicaltest.entities;

public class Constant {

    private Constant() {
    }

    public static class NativeQuery{
        private NativeQuery() {
        }

        public static final String GET_BRAND_CD_DESC = "get_brand_cd_desc";
    }
    public static class Endpoint{
        private Endpoint() {
        }
        public static final String V1 = "api/v1";
        public static final String CAR_BRAND = V1 + "/car-brand";
    }

    public static class PARAMS_KEY {
        private PARAMS_KEY() {
        }

        public static final String API_KEY = "APIKey";

    }

    public static class ResponseMessaging{
        private ResponseMessaging(){}

        //Code
        public static final String SUCCESS_FLAG = "T";
        public static final String FAILED_FLAG = "F";

        //Message
        public static final String DEFAULT_SUCCESS_RESPONSE = "Success";
        public static final String DEFAULT_BAD_RESPONSE = "Invalid Input";
        public static final String UNAUTHORIZED_BASE_RESPONSE = "You do not have permissions to access the API!";

    }


}
