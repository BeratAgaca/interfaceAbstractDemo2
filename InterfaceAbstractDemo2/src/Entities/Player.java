package Entities;

import Abstract.IEntity;

public class Player implements IEntity{
	private int Id;
	private String FirstName;
	private String LastName;
	private String NationalityId;
	private int BirthYear;
	
	 
	public Player(int id, String firstName, String lastName, String nationalityId, int birthYear) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalityId = nationalityId;
		BirthYear = birthYear;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	public int getBirthYear() {
		return BirthYear;
	}
	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}
	

}
