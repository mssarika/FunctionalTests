package Tests;

import org.junit.Assert;
import org.junit.Test;

import OperationClass.PublicOperation;


public class OperationsTest {
	
	PublicOperation obj = new PublicOperation();
	
	@Test
	public void test1()
	{
		Assert.assertEquals("Test 1 failed", "12", obj.addValues("4", "8"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("Test 2 failed", "22", obj.addValues("10", "12"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("Test 3 failed", "testing", obj.addValues("test","ing"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals("Test 4 failed", "ApplicatION", obj.addValues("Applic","atION"));
	}
}
