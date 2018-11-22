package it.unical.ingsw2018.IntermediateTest_B;
import it.unical.ingsw2018.IntermediateTest_B.Student;
import junit.framework.Assert;

import org.junit.Test;
public class CarrierSimpleTest {
	private Student student=new Student(" ");
//un metodo che verifica che registerExam sollevi 
	//un’eccezione nel caso in cui un esame venga inserito due volte
	@Test(expected=RuntimeException.class)
		public void dueEsamiUguali(){
			student.registerExam(new Exam("Esame 1",20,10));
			student.registerExam(new Exam("Esame 1",20,10));
		}
	
	@Test
	public void calcoloCrediti(){
		student.registerExam(new Exam("Esame 1",20,10));
		student.registerExam(new Exam("Esame 2",20,10));
		student.registerExam(new Exam("Esame 3",20,10));
		
		Assert.assertEquals(30, student.getCreditSum());
	}
	
}
