package it.unical.ingsw2018.IntermediateTest_B;

import org.junit.Test;

public class CarrierSimpleTest {

	//private static Exam c;
	private static Student f;
	@Test(expected = IllegalArgumentException.class)
	
	public void registerExamTest() {
		Exam q= new Exam("mat", 0, 0);
		
	 f.registerExam(q);
	 f.registerExam(q);
	 
		}
		
	
}
