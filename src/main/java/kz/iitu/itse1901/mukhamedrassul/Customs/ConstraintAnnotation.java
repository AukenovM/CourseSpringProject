package kz.iitu.itse1901.mukhamedrassul.Customs;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.AssertTrue;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER,
        ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MaterialTypeValidator.class)
public @interface ConstraintAnnotation {
    String message() default "must be a valid material type name," +
            " found: ${validatedValue}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
