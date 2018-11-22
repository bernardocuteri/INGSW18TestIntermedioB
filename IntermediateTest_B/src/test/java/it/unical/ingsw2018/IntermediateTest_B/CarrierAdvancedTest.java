package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CarrierAdvancedTest {
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
@SuppressWarnings("deprecation")
@Test
public void testSomma() throws Exception 
{
	s.registerExam(e1);
	s.registerExam(e2);
	s.registerExam(e3);
	assertEquals("Media pesata sbagliata",20, s.getWeightedSum());
}
 
}
