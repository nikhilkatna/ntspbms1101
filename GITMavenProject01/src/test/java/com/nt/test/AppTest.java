package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class AppTest 
{
	   @Test
	   public void testWithPositives()
	   {
		  Arithmetic ar=new Arithmetic();
		  int expected=60;
	      int actual=ar.sum(40,20);
	      assertEquals(expected,actual);
	   }
	   
	   @Test
	   public void testWithNegatives()
	   {
		  Arithmetic ar=new Arithmetic();
		  int expected=-40;
	      int actual=ar.sum(-20,-20);
	      assertEquals(expected,actual);
	   }
	   
	   @Test
	   public void testWithZeros()
	   {
		  Arithmetic ar=new Arithmetic();
		  int expected=0;
	      int actual=ar.sum(0,0);
	      assertEquals(expected,actual);
	   }
}
