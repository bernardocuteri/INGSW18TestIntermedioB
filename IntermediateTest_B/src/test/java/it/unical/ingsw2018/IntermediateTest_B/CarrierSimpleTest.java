package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CarrierSimpleTest {

	//un metodo che verifica che registerExam sollevi un’eccezione
	//nel caso in cui un esame venga inserito due volte
	
	private static Student s = new Student("Alessandro");
	
	@Before
	public void reset()
	{
		s.reset();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test1()
	{
		System.out.println("illegalArgumentTest");
		Exam e = new Exam("fondamenti",26,12);
		Exam e1 = new Exam("fondamenti",18,12);
		
		s.registerExam(e);
		s.registerExam(e1);
		
	}
	
	//un metodo che verifichi il calcolo della somma 
	//dei crediti dopo aver inserito 3 esami in carriera
	
	@Test
	public void test2()
	{
		System.out.println("sum Test");
		Exam e= new Exam("fondamenti", 18,12);
		Exam e1 = new Exam("oggetti", 25, 12);
		Exam e2= new Exam("economia",19,6);
		
		s.registerExam(e);
		s.registerExam(e1);
		s.registerExam(e2);
		
		int somma= s.getCreditSum();
		
		assertEquals(30,somma);
	}
	


	
}
