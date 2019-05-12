package com.jbk;

import org.apache.commons.lang3.StringUtils;

public class NumericNumberChecking {
public static void main(String[] args) {
	
String text1="7262A";
String text2="6666A";

boolean result1=StringUtils.isNumeric(text1);
boolean result2=StringUtils.isNumeric(text2);

System.out.println("text1 result"+text1);
System.out.println("text1 result"+text2);
}
}

