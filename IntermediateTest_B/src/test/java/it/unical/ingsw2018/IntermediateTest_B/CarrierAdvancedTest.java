package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {
 
	
	@Test
	public void WeightedSumTest(){
		Student st=new Student("VITO");
		st.registerExam(new Exam("IGPE", 30, 9));
		st.registerExam(new Exam("BD", 30, 12));
		st.registerExam(new Exam("ASD", 25, 6));
		
		//System.out.println(st.getWeightedSum());
		//28.8888
		assertEquals(28.88, st.getWeightedSum(),0.01);
	}
	
}
