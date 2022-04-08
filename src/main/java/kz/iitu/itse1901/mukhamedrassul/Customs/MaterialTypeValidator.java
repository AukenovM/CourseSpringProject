package kz.iitu.itse1901.mukhamedrassul.Customs;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.Formatter;
import java.text.ParseException;
import java.util.Locale;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.AssertTrue;


public class MaterialTypeValidator implements ConstraintValidator<ConstraintAnnotation,String> {

    @Override
    public void initialize(ConstraintAnnotation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return false;
        }
        return true;
    }
}
