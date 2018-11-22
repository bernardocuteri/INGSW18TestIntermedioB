package it.unical.ingsw2018.IntermediateTest_B;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrierAdvancedTest {
	
	private static Student student;
	
	@BeforeClass
	public static void init(){
		student = new Student("Davide");
	}
	
	@Test
	public void mediaPesata() {
		student.registerExam(new Exam("Matematica",18,12));
		student.registerExam(new Exam("Biologia",26,6));
		student.registerExam(new Exam("informatica",30,6));
		
		Assert.assertEquals(23,student.getWeightedSum(),0.01);
	}
}
