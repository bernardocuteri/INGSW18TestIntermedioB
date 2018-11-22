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

	
	public void registerExam(Exam exam) throws Exception
	{
		for (Exam currentExam : carrier) {
			if (carrier.isEmpty())
			{
				carrier.add(exam); 
				return ; 
			}
			if (currentExam.equals(exam))
			{
				throw new Exception() ;
			}
			this.carrier.add(exam); 
		}
	}
	
	public int getCreditSum() {
		int sum = 0 ; 
		for (Exam exam : carrier) {
			sum += exam.getGrade() ; 
		}
		return sum  ;
	}
	
	public double getWeightedSum() {
		int value = 0 ; 
		for (Exam exam : carrier) {
			value += (exam.getCfu()*exam.getGrade()) ;
		}
		value /= 174  ;
		value /=3 ; 
		return value*= 11 ; 
		
	}
	
	
	public static void main(String[] args) throws Exception {
		Student s = new  Student("studente") ; 
		Exam e1 = new  Exam("nome", 30, 2) ;
		Exam e2 = new  Exam("nome", 30, 2) ;
		
		s.registerExam(e1);
		
		System.out.println(s.getCarrier().get (0));
	}
	
	


}
