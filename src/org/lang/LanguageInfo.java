package org.lang;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class LanguageInfo {

     
      private void m1(int a) {
	  System.out.println("bala"+a);
      }
      
      
	  private void m2(int a, int b) {
		  System.out.println(a+" "+b);
	}
	  private void m3(ArrayList am) {
		  
		  System.out.println(am);
 
	  }
	 private void m4(Set<Integer>k) {

}
     public static void main(String[] args) {
		LanguageInfo l=new LanguageInfo();
		l.m1(20);
		l.m2(30, 40);
	
	
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(100);
		al.add("bala");
		l.m3(al);
		
		
	 
       Set<Integer> k=new LinkedHashSet<Integer>();
       k.add(50);
       k.add(30);
       
     } 
		
		


}       



    
    








