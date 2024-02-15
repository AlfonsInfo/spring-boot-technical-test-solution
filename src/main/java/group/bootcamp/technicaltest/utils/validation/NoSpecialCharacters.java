package group.bootcamp.technicaltest.utils.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NoSpecialCharactersValidator.class)
@Documented
public @interface NoSpecialCharacters {
    String message() default "Input tidak boleh mengandung karakter khusus";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
