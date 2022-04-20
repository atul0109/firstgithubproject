package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T {

	@Test
	public void test1() {
		System.out.println("From test 1");
		
	}
	@Test
	public void test2() {
		System.out.println("From test 2");
		
		
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
		
	}
	@AfterMethod
	public void aftermthod() {
		System.out.println("After method");
		
	}
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Before class");
		
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After Class");
		
	}
}
