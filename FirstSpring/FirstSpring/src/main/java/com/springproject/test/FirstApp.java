package com.springproject.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springproject.test.methods.MethodData;
import com.springproject.test.methods.MethodInfo;

public class FirstApp {

	public static void main(String[] args) 
	{
		ApplicationContext appContext=new FileSystemXmlApplicationContext("src/main/java/bean.xml");
		MethodData mData=(MethodData) appContext.getBean("FirstSpringData");
		MethodInfo mInfo=(MethodInfo) appContext.getBean("SecondMethodInfo");
		System.out.println(mData);
		System.out.println(mInfo);
	
	}
}
