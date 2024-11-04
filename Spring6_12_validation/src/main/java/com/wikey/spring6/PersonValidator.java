package com.wikey.spring6;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @ Author：Wikey Cao
 * @ Date：04-11-2024
 * @ Description：
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty", "name is null not allowed");

        Person person = (Person) target;
        if (person.getAge() < 0) {
            errors.rejectValue("age", "age.min", "age is not allowed less than 0");
        } else if (person.getAge() > 120) {
            errors.rejectValue("age", "age.max", "age is not allowed greater than 120");
        }
    }
}