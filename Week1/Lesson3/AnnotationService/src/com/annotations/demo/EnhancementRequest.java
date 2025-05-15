package com.annotations.demo;

import java.time.LocalDate;
import java.util.Date;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EnhancementRequest {
	  int id();
	  String synopsis();
	  String engineer() default "unassigned" ;
	  String date() default "unknown" ;
}