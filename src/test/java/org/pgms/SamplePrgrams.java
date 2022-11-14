package org.pgms;

import java.util.LinkedHashMap;
import java.util.Map;

public class SamplePrgrams {

	public static void main(String[] args) {

		// Sum of digits from 1 to 100
		// int b=0;
		// for (int i = 1; i < 100; i++) {
		// b=b+i;
		// }
		// System.out.println(b);

		// Given Number is odd or even
		// int a= 73832;
		// if (a%2==0) {
		// System.out.println("Even Number");
		// }else {
		// System.out.println("Oddnumber");
		// }

		// Sum of two given Numbers
		// int a=140,b=60;
		// int sum = a+b;
		// System.out.println("Addition of two numbers is :"+sum);

		// Product of two given numbers
		// int a=70,b=12;
		// int c =a*b;
		// System.out.println("Product of two given number is :"+c);

		// Find odd an even numbers from 1 to 100
		// for (int i = 1; i <=100; i++) {
		// if (i%2==0) {
		// System.out.println("Even Number"+i);
		// }else {
		// System.out.println("Odd Number"+i);
		// }
		// }

		// Find the count of odd and evenumbers from 1 to 100
		// int even = 0;
		// int odd = 0;
		// for (int i = 1; i <=100; i++) {
		// if (i%2==0) {
		// even++;
		// }else {
		// odd++;
		// }
		// }
		// System.out.println(even);
		// System.out.println(odd);

		// Swap of two numbers with 3rd variable
		// int a= 10,b=20;
		// int c=a;
		// a=b;
		// b=c;
		// System.out.println("a value:"+a);
		// System.out.println("b value:"+b);

		// Swap of two numbers without 3rd variable
		// int a=20,b=40;
		// a=a+b;
		// b=a-b;
		// a=a-b;
		// System.out.println("a="+a);
		// System.out.println("b="+b);

		// Fibonacci series from 1 to 10
		// int a=0,b=1;
		// for (int i = 0; i <=10; i++) {
		// int c = a+b;
		// System.out.println(c);
		// a=b;
		// b=c;
		// }

		// Factorial of a number
		// int a =1;
		// for (int i = 1; i <=6; i++) {
		// a=a*i;
		// }
		// System.out.println(a);

		// Reversing of number
		// int a=623632;
		// int rev = 0;
		// while (a>0) {
		// int b =a%10;
		// int c =a/10;
		// rev =b+(rev*10);
		// a=c;
		// }
		// System.out.println(rev);

		// Sum of given digits
		// int a=53436;
		// int sum = 0;
		// while (a>0) {
		// int c = a%10;
		// int b = a/10;
		// sum = sum +c;
		// a=b;
		// }
		// System.out.println("Sum of digits : "+sum);

		// Given number is Palindrome or not
		// int a =12321;
		// int temp = a;
		// int rev = 0;
		// while (a>0) {
		// int b=a/10;
		// int c=a%10;
		// rev = c+(rev*10);
		// a=b;
		// }
		// if (temp==rev) {
		// System.out.println("Palindrome number");
		// }else {
		// System.out.println("Not an palindrome number");
		// }

		// Count of digits
		// int a=3668736;
		// int count =0;
		// while (a>0) {
		// int b = a/10;
		// a = b;
		// count++;
		// }
		// System.out.println(count);

		// String s= "Welcome";
		// Map<Character,Integer> m = new LinkedHashMap<>();
		// for (int i = 0; i <s.length(); i++) {
		// char charAt = s.charAt(i);
		// if (m.containsKey(charAt)) {
		// Integer integer = m.get(charAt);
		// m.put(charAt, integer+1);
		// } else {
		// m.put(charAt, 1);
		// }
		// }
		// System.out.println(m);

//		String s = "Welcome Java";
//		String[] split = s.split(" ");
//		String output = " ";
//		for (String s1 : split) {
//			for (int i = s1.length() - 1; i >= 0; i--) {
//				char c = s1.charAt(i);
//				output = output + c;
//			}
//			output = output + " ";
//		}
//		System.out.println(output);
		int count =0;
		for (int i = 1; i < 10; i++) {
			if (i%2==0) {
				count=count+i;		
			}
			
		}
		System.out.println(count);
		
		

	}

}
