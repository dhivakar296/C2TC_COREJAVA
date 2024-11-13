package com.tns.ifet.dayone;

import java.util.Scanner;

public class calci{
     public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the operator +,-,*,/");
    	 char op = sc.next().trim().charAt(0);
    	 
    	 if(op == '+'|| op == '-' || op == '*' || op == '/') {
    		 int n1 = sc.nextInt();
    		 int n2 = sc.nextInt();
    		 int ans =0;
    		 if(op == '+') {
    			 ans = n1+n2;
    			 System.out.println(ans);
    		 }
    		 else if(op=='-') {
    			 ans=n1-n2;
    			 System.out.println(ans);
    		 }
    		 else if(op=='*') {
    			 ans=n1*n2;
    			 System.out.println(ans);
    		 }
    		 else if(op=='/') {
    			 ans=n1/n2;
    			 System.out.println(ans);
    		 }


    	 }
    	 else
    	 {
    		 System.out.println("Invalid Expresion");
    	 }

}
}