package it.unical.ingsw2018.IntermediateTest_B;

import org.junit.Test;

import junit.framework.Assert;

public class CarrierAdvancedTest {
 
	@Test
	public void testgetCreditSum()
	{
		Student s = new Student("marica");
		s.getCarrier().add(new Exam("a",1,2));
		s.getCarrier().add(new Exam("b",1,3));
		s.getCarrier().add(new Exam("c",1,4));
		Assert.assertEquals(9,s.getWeightedSum());
	}
	
}
