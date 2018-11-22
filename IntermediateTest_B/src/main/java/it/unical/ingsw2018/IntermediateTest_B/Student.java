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
		int totale = 0;
		for (int i = 0;i<carrier.size();i++) {
			totale += carrier.get(i).getCfu();
		}
		return totale;
	}
	
	public double getWeightedSum() {
		int sommavoti = 0;
		int sommacfu = 0;
		double back = 0;
		for(int i=0;i<carrier.size();i++) {
			sommavoti += carrier.get(i).getCfu()*carrier.get(i).getGrade();
			sommacfu += carrier.get(i).getCfu();
		}
		back = sommavoti/sommacfu;
		return back;
	}
}
