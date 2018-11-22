package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.ingsw2018.IntermediateTest_B.Exam;
import it.unical.ingsw2018.IntermediateTest_B.Student;
public class CarrierSimpleTest {

	public static Exam uno = new Exam("Uno", 6, 6);
	public static Exam unoo = new Exam("Uno", 7, 6);
	public static Exam dos = new Exam("Dos", 8, 6);
	public static Exam tres = new Exam("Tres", 9, 6);
	public static Exam cuatro = new Exam("Cuatro", 5, 12);
	
	public static Student estudiante = new Student("estudiante");
	
	@Test(expected=Exception.class)
	public void examTwice() {
		estudiante.registerExam(uno);
		estudiante.registerExam(unoo);
	}
	
	@Test
	public void sumCredit() {
		estudiante.registerExam(uno);
		estudiante.registerExam(dos);
		estudiante.registerExam(tres);
		
		assertEquals(18, estudiante.getCreditSum());
		
	}
	
}
