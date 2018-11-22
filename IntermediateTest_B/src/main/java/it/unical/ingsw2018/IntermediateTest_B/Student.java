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
		for (Exam e:carrier)
		{
			if (exam.getName()==e.getName())
			{
				throw new Exception("Esame già registrato");
			}
			carrier.add(exam);
		}
	
	}
	public int getCreditSum() {

		int total=0;
		for (Exam e:carrier)
		{
			total+=e.getCfu();
		}
		return total;
	}
	public double getWeightedSum() {
		int total=0;
		for (Exam e:carrier)
		{
			total+=e.getGrade(); 
		}
		return total/carrier.size();
	}
	
//	
	
	

}
