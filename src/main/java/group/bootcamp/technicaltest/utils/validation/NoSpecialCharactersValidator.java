package group.bootcamp.technicaltest.utils.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NoSpecialCharactersValidator implements ConstraintValidator<NoSpecialCharacters, String> {
    private static final String SPECIAL_CHARACTERS_REGEX = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value == null || !value.matches(SPECIAL_CHARACTERS_REGEX);
    }
}
