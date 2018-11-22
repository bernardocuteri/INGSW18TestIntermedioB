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
	
	public void registerExam(Exam exam) throws IllegalArgumentException
	{
		boolean trovato = false;
		for(Exam e: this.carrier)
		{
			if(e.getName() == exam.getName())
			{
				trovato = true;
				break;
			}
		}
		
		if(!trovato)
			this.carrier.add(exam);
		else
			throw new IllegalArgumentException("Invalid exam "+exam.getName());
		
		
	}
	
	public int getCreditSum()
	{
		int sum = 0;
		for(Exam e: this.carrier)
			sum += e.getCfu();
		return sum;
	}
	
	public int getWeightedSum()
	{
		int media = 0;
		for(Exam e: this.carrier)
			media += (e.getCfu()*e.getGrade());
		return media;
	}


	
	

	
	
	
	
	
	

}
