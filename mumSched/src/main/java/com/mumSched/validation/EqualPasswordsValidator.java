/*package com.mumSched.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.mumSched.model.UserProfile;

public class EqualPasswordsValidator implements ConstraintValidator<EqualPasswords, UserProfile> {
   
    PasswordEncoder  passwordEncoder;
    @Override
    public void initialize(EqualPasswords constraint) {
    }
    
    @Override
    public boolean isValid(UserProfile user, ConstraintValidatorContext context) {
      System.out.println("password : "+user.getPassword());
      System.out.println("confirm password : "+user.getPassword());
      return user.getPassword().equals(user.getPassword());
         //return   passwordEncoder.matches(user.getConfirmpassword(), user.getPassword());
    }

	
 
}*/