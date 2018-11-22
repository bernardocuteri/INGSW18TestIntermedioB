package it.unical.ingsw2018.IntermediateTest_B;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class CarrierSimpleTest {
	
	
	private static Student student;
	
	@BeforeClass
	public static void init(){
		student = new Student("Davide");
	}
	
	@Test(expected = RuntimeException.class)
	public void isException(){
		Exam e = new Exam("Matematica",18,12);
		student.registerExam(e);
		student.registerExam(e);
	}
	
	@Test
	public void correctSum() {
		student.clear();
		student.registerExam(new Exam("Matematica",18,12));
		student.registerExam(new Exam("Biologia",18,6));
		student.registerExam(new Exam("informatica",18,6));
		
		Assert.assertEquals(24,student.getCreditSum());
	}
	
}
