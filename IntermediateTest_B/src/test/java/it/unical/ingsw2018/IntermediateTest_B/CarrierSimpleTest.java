package it.unical.ingsw2018.IntermediateTest_B;

import org.junit.Test;

import junit.framework.Assert;

public class CarrierSimpleTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void testRegisterExam()
	{
		Student s = new Student("marica");
		s.registerExam(new Exam("ingsw",12,12));
		s.registerExam(new Exam("ingsw",12,5));
	}
	
	@Test
	public void testgetCreditSum()
	{
		Student s = new Student("marica");
		s.getCarrier().add(new Exam("a",1,12));
		s.getCarrier().add(new Exam("b",2,12));
		s.getCarrier().add(new Exam("c",3,12));
		Assert.assertEquals(36,s.getCreditSum());
	}

	
	
}
