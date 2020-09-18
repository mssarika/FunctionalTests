package Tests;

import org.junit.Assert;
import org.junit.Test;

import OperationClass.PublicOperation;

public class OperationsStringTest {
	
	PublicOperation obj = new PublicOperation();
	
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
