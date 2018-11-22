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
	
	public void registerExam(Exam exam) throws Exception {
		if( carrier.contains(exam)) throw new Exception("Exam already in list");
		else carrier.add(exam);
		}
	
	public int getCreditSum() {
		int sum=0;
		for(Exam exam: carrier) {
			sum += exam.getCfu();
		}
		return sum;
	}
	
	public double getWeigthedSum() {
		int num=0;
		int sum=0;
		for(Exam exam: carrier) {
			sum += exam.getCfu();
			num++;
		}
		return sum/num;
	}
	
	
	
	
	
	

}
