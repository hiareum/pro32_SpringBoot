package com.myboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//
//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Inherited
//@SpringBootConfiguration
//@EnableAutoConfiguration

//@ComponentScan이란? 기본적으로 main()메서드가 포함된 Myboot01Application클래스가 속해있는 패키지(com.myboot01)를 베이스 패키지로 하여 빈 등록을 처리한다
//즉 루트 패키지 (com.myboot01)가 아닌 다른 패키지에 클래스를 작성하면 스프링컨테이너는 해당 클래스를 빈으로 등록하지 않게 된다.
//@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })


@SpringBootApplication//이 클래스가 스프링 부트로 만든 애플리케이션의 시작 클래스임
@ComponentScan(basePackages = {"com.ruby","com.myboot01"}) //다른 패키지에 있는 클래스까지 등록하기 위한 어노테이션
public class Myboot01Application { //스프링부트로 만든 애플리케이션을 실행하기 위해서 메인클래스를 작성 
									//스프링 부트로 만들 애플리케이션은 일반 자바 애플리케이션으로 실행할 수도 있고 웹 애플리케이션으로 실행할 수도 있음

	public static void main(String[] args) {
		SpringApplication.run(Myboot01Application.class, args);
	}

}
