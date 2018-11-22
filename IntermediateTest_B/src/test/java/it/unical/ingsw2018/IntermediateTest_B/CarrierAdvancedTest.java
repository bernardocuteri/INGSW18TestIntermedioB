package it.unical.ingsw2018.IntermediateTest_B;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrierAdvancedTest {
	
	private static Student studente;

	@BeforeClass
	public static void inizializzazione() {
		System.out.println("before class");
		studente = new Student("Paolo");
	}
	
	@Test
	public void mediaPesata() {
		final Exam Asd = new Exam("Asd",28,9);
		final Exam Poo = new Exam("Poo",25,6);
		final Exam Fond = new Exam("Fond",23,12);
		studente.registerExam(Asd);
		studente.registerExam(Poo);
		studente.registerExam(Fond);
		Assert.assertEquals(8.92, studente.getCreditSum());
	}
 
}
