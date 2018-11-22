package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {
	
	public static Exam uno = new Exam("Uno", 6, 6);
	public static Exam dos = new Exam("Dos", 9, 6);
	public static Exam tres = new Exam("Tres", 9, 6);
	
	public static Student estudiante = new Student("estudiante");
	
	@Test
	public void calcMedia() {
		estudiante.registerExam(uno);
		estudiante.registerExam(dos);
		estudiante.registerExam(tres);
		
		assertEquals(8, estudiante.getWeigthedSum());
	}
}
