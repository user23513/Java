package com.yedam.java.ch11_01;

import java.awt.image.DataBufferByte;
import java.util.Date;

import javax.print.attribute.SetOfIntegerSyntax;

public class ToStringExample {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		System.out.println(obj1);
		
		Date obj2 = new Date();
		System.out.println(obj2.toString());
		System.out.println(obj2.toGMTString());
		
		
	}
}
