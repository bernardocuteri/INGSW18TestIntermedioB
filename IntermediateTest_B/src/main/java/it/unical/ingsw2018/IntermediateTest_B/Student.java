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
	
	public void registerExam(Exam exam) {
		  boolean exists = false;
		  for (Exam e : carrier) {
		   if (e.getName().equals(exam.getName())) 
		    exists = true;
		  }
		  
		  if(exists)
		   throw new IllegalArgumentException();
		  else
		   carrier.add(exam);
		 }
	
	public int getCreditSum() {
		int totaleCrediti = 0;
		
		for(int i =0;i<carrier.size();i++) 
			totaleCrediti += carrier.get(i).getCfu();
		
		
		return totaleCrediti;
	}
	
	public double getWeightedSum() {
	    int sommaVoti = 0;
	    int sommaCfu = 0;
	    double back = 0;
	    
	    for(int i=0;i<carrier.size();i++) {
	      sommaVoti += carrier.get(i).getCfu()*carrier.get(i).getGrade();
	      sommaCfu += carrier.get(i).getCfu();
	    }
	    
	    back = sommaVoti/sommaCfu;
	    return back;
	    
	  }
	
	

	
	
	
	
	
	

}
