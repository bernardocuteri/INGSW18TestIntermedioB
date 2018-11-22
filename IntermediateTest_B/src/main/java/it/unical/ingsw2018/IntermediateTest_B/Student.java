package it.unical.ingsw2018.IntermediateTest_B;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

public class Student extends Exception{

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
		boolean presente= false;
		for(Exam e : carrier)
			if(e.getName()== exam.getName())
			{
				presente=true;
				
			}
		
		if(presente)
			throw new IllegalArgumentException("esame già presente");
		else
		carrier.add(exam);
			
			
	}
	
	public int getCreditSum()
	{
		int sum=0;
		for(Exam e : carrier)
			sum+= e.getCfu();
		
		return sum;
		
	}
	
	public double getWeightedSum() 
	{
		int sum=0;
		double sum2=0.0;
		for(Exam e : carrier)
		{
			sum2+= e.getGrade()*e.getCfu();
			
			sum+= e.getCfu();
		}
			
		return (double) sum2/sum;
		
		
	}
	
	public void reset()
	{
		carrier.clear();
	}

	
	
	
	
	
	

}
