package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrierSimpleTest {
private static Student studente;

@BeforeClass
public static void init() {
	studente = new Student("Fabio");
}

@Test(expected=RuntimeException.class)
public void testInserimentoRipetuto() {
	studente.registerExam(new Exam("INGSW",0,12));
	studente.registerExam(new Exam("INGSW",0,12));
}

@Before
public void clearCarrier() {
	studente.getCarrier().clear();
}

@Test
public void testSommaDopoTreInserimenti() {
	studente.registerExam(new Exam("INGSW",0,12));
	studente.registerExam(new Exam("OGGETTI",0,6));
	studente.registerExam(new Exam("Fondamenti",0,12));
	assertEquals(30, studente.getCreditSum());
}


	
}
