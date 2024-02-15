package group.bootcamp.technicaltest.configuration.caseconfig;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

//implement BasePropertyNamingStrategy / extend PropertyNamingStrategy
public class ScreamingSnakeCaseStrategy extends PropertyNamingStrategy.SnakeCaseStrategy {

    @Override
    public String translate(String input) {
        String lowerSnakeCase = super.translate(input);
        return lowerSnakeCase.toUpperCase();
    }


}
