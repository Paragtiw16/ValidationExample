package com.sathya.spring.mvc;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Register 
{
 @Size(min=4,max=8)
 private String uname;
 
 public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public Date getBirthDay() {
	return birthDay;
}

public void setBirthDay(Date birthDay) {
	this.birthDay = birthDay;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

@NotEmpty @Email
 private String email;
 
 @NotNull @Min(18) @Max(25)
 private Integer age;
 
 @NotNull
 private Gender gender;
 
 @NotNull @Past
 private Date birthDay;
 
 @NotEmpty
 private String country;
 
 public enum Gender{
	 MALE,FEMALE}

}
