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

	public void registerExam(Exam exam){
		carrier.add(exam);
		for(int i=0;i<carrier.size();i++){
			if(carrier.get(i).getName().equals(exam.getName())){
				throw new RuntimeException("esame già caricato");
			}
		}
	}
	
	public int getCreditSum(){
		//ritorno somma dei crediti
		int somma=0;
		for(int i=0;i<carrier.size();i++){
			somma+=carrier.get(i).getCfu();
		}
		return somma;
	}

	public double getWeightedSum() {
	//Restituisce la media pesata degli esami in carriera
		double creditTot=0;
		double votiPerCrediti=0;
		
			for(int i=0;i<carrier.size();i++){
				votiPerCrediti+=(carrier.get(i).getGrade())*(carrier.get(i).getCfu());
				creditTot+=carrier.get(i).getCfu();
			}
			return (votiPerCrediti/creditTot);
	}
	
	
	
	

}
