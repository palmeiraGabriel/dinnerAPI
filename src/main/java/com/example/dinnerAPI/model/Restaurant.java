package com.example.dinnerAPI.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.OptionalDouble;

@Entity
@Table(name="RESTAURANTS")
public class Restaurant {

	public Restaurant(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@OneToOne(mappedBy = "idRestaurant")
	private Long id;

	@Column(name="NAME")
    private String name;
	@Column(name="ADDRESS")
    private String address;

    private ArrayList<Integer> peanutScores;
    private ArrayList<Integer> eggScores;
    private ArrayList<Integer> dairyScores;

    private ArrayList<Double> averages;

	@Column(name="PEANUT_AVERAGE")
    private Double peanutAverage;
	@Column(name="EGG_AVERAGE")
    private Double eggAverage;
	@Column(name="DAIRY_AVERAGE")
    private Double dairyAverage;

	@Column(name="TOTAL_AVERAGE")
	private Double totalScore;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Integer> getPeanutScores() {
		return peanutScores;
	}

	public ArrayList<Integer> getEggScores() {
		return eggScores;
	}

	public ArrayList<Integer> getDairyScores() {
		return dairyScores;
	}

	public void addEggScore(Integer s){
		this.eggScores.add(s);
	}

	public void addDairyScore(Integer s){
		this.dairyScores.add(s);
	}
	public void addPeanutScore(Integer s){
		this.peanutScores.add(s);
	}

	public OptionalDouble getPeanutAverage() {
		if( peanutScores == null){
			return null;
		}
		Double average = peanutScores.stream().mapToDouble(n -> n).average().orElse(0.0);
		averages.add(0, average );
		this.peanutAverage = average;

		return  peanutScores.stream().mapToDouble(n -> n). average();
	}

	public OptionalDouble getEggAverage() {
		if( eggScores == null){
			return null;
		}
		Double average = eggScores.stream().mapToDouble(n -> n).average().orElse(0.0);
		averages.add(1, average );
		this.eggAverage = average;

		return  eggScores.stream().mapToDouble(n -> n).average();
	}

	public OptionalDouble getDairyAverage() {
		if( dairyScores == null){
			return null;
		}

		Double average = dairyScores.stream().mapToDouble(n -> n).average().orElse(0.0);
		averages.add(2, average );
		this.peanutAverage = average;

		return  dairyScores.stream().mapToDouble(n -> n). average();
	}

	public OptionalDouble getTotalScore() {
			getPeanutAverage();
			getEggAverage();
			getDairyAverage();

		 return (averages.isEmpty()) ? null
				 : averages.stream().mapToDouble(n -> n).average();

	}

    
    
}
