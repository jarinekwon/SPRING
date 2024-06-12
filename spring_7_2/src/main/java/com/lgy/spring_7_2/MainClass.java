package com.lgy.spring_7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		ctx.close();
	}
}
//ctx.refresh();
//@# afterPropertiesSet()
//@# destroy()

//<context:annotation-config></context:annotation-config> 추가
//@# afterPropertiesSet()
//@# initMethod
//@# destroyMethod
//@# destroy()