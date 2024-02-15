package group.bootcamp.technicaltest.utils.security;

import group.bootcamp.technicaltest.entities.Constant;
import group.bootcamp.technicaltest.utils.exception.CustomAuthException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class SimpleApiKeyInterceptor implements HandlerInterceptor {
    // todo implement proper way to generate key
    private static final String EXPECTED_API_KEY_VALUE = "7def4ec4deab712ec5911ee718db181c8bf077582e9cc397af95c76fb0d459f0";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String apiKey = request.getHeader(Constant.PARAMS_KEY.API_KEY);
        if (apiKey != null && apiKey.equals(EXPECTED_API_KEY_VALUE)) {
            return true; // Lanjutkan eksekusi permintaan API jika API key valid
        }

        //todo : do check other header
        throw new CustomAuthException(Constant.ResponseMessaging.UNAUTHORIZED_BASE_RESPONSE);
    }
}
