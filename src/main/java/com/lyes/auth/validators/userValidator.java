package com.lyes.auth.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.lyes.auth.model.User;

public class userValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
	}

}
