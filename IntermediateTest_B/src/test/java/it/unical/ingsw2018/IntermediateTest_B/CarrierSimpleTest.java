package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CarrierSimpleTest {
private static Student s;
Exam e1= new Exam("esame1", 18, 12);
Exam e2= new Exam("esame2", 25, 9);
Exam e3 =new Exam("esame3", 28, 3);






@Before 
public void clean()
{
	s=null;
	s= new Student("Student1");
	
}


@Test
public void testSomma() throws Exception 
{
	s.registerExam(e1);
	s.registerExam(e2);
	s.registerExam(e3);
	assertEquals("Somma Crediti Sbagliata",61, s.getCreditSum());
}



}
