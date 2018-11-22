package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierSimpleTest {


	
	@Test(expected=RuntimeException.class)
	public void addSameExamTest() {
		Student st=new Student("VITO");
		st.registerExam(new Exam("IGPE", 30, 9));
		st.registerExam(new Exam("IGPE", 20, 9));
	}
	
	@Test
	public void cfuNumberTest() {
		Student st=new Student("VITO");
		st.registerExam(new Exam("IGPE", 30, 9));
		st.registerExam(new Exam("BD", 30, 12));
		st.registerExam(new Exam("ASD", 26, 6));
		assertEquals(27, st.getCreditSum());	
	}
	
}
