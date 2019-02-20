package ahmadMaree;

import static org.junit.Assert.*;

import org.junit.Test;

import hwClasses.sho;



public class ahmadtest {

	sho s =new sho();
	@Test
	public void test() {	
	 assertTrue(s.count==0);
	}
    
	@Test
	public void test2() {
	 int price1=127; 
	 s.addbook(price1);
	 assertSame(s.price,127);
	 assertSame(s.count,1);
	 
	}
	
	@Test
	public void test3() {
	 int price1=100; 
	 s.addbook(price1);
	 
	 assertTrue(s.count==2 && s.price==227);
	}
}
	
