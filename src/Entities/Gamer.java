package Entities;

import java.time.LocalDate;

import Abstracts.GamerService;

public class Gamer implements GamerService {
private int id;
private String nationalityId;
private String firstName;
private String lastName;
private LocalDate dateOfBirth;
private String userName;
private String eMail;


public Gamer(int id,String firstname,String lastName,LocalDate  dateOfBirth,String nationalityId,String userName,String eMail){
	super();
	this.id=id;
	this.nationalityId=nationalityId;
	this.firstName=firstName;
	this.lastName=lastName;
	this.dateOfBirth=dateOfBirth;
	this.userName=userName;
	this.eMail=eMail;

}

public int getID() {
	return id;
}
public void SetId(int id) {
	this.id=id;
}
public String getNationalityId() {
	return nationalityId;
}
public void setNationalityId(String nationalityId) {
	this.nationalityId=nationalityId;
}
public String getfirstName(){
return firstName;
}
public void setFirstName(String firstName) {
	this.firstName=firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName=lastName;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth=dateOfBirth;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName=userName;
}
public String getEMail()
{
	return eMail;
	}
public void setEMail(String eMail) {
	this.eMail=eMail;
}
@Override
public void save(Gamer gamer) {
	// TODO Auto-generated method stub
	
}
@Override
public void update(Gamer gamer) {
	// TODO Auto-generated method stub
	
}
@Override
public void delete(Gamer gamer) {
	// TODO Auto-generated method stub
	
}
}