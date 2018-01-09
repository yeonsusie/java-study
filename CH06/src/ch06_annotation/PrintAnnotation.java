package ch06_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//어노테이션 정의

@Target({ElementType.METHOD}) //메소드에만 어노테이션 붙일 수 있음
@Retention(RetentionPolicy.RUNTIME) //런타임시에 어노테이션 사용
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
	
}
