package it.unical.ingsw2018.IntermediateTest_B;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String nome;
	
	private List<Exam> carrier;

	public Student(String nome) {
		this.nome = nome;
		carrier = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Exam> getCarrier() {
		return carrier;
	}
	private static Exam c;
  
	public  void registerExam(Exam exam) {
	   carrier.add(exam);
	   if(exam==c) {
		   throw new IllegalArgumentException();
   }
	}
	   public int getCreditSum() {
		   int sum=0;
		   for(int i=0;i<carrier.size();i++) {
			   sum=sum+((Exam) carrier).getCfu();	   
		   }
		   return sum;
	   }

	   public double getWeightedSum() {
		   int m=0;
		   int media=0;
		   for(int i=0;i<carrier.size();i++) {
			  m=((Exam) carrier).getGrade() *((Exam) carrier).getCfu();	
			  media=media+m;
			  m=0;
		   }
		   
		   return media/getCreditSum();
	   }
	

}
