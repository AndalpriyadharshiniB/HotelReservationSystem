package com.example.demo.entity;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Column(name="name")
private String name;
	@Column(name="phnno")
private int phnno;
@Id
@Column(name="proof_idno")
private int proof_idno;
@Column(name="address")
private String address;
@Column(name="no_of_persons")
private int no_of_persons;
@Column(name="type_of_room")
private String type_of_room;
@Column(name="type_of_bed")
private String type_of_bed;
public Hotel() {}
public Hotel(String name,int phnno,int proof_idno,String address,int no_of_persons,String type_of_room,String type_of_bed) {
	this.name=name;
	this.phnno=phnno;
	this.proof_idno=proof_idno;
	this.address=address;
	this.no_of_persons=no_of_persons;
	this.type_of_room=type_of_room;
	this.type_of_bed=type_of_bed;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhnno() {
	return phnno;
}
public void setPhnno(int phnno) {
	this.phnno = phnno;
}
public int getProof_idno() {
	return proof_idno;
}
public void setProof_idno(int proof_idno) {
	this.proof_idno = proof_idno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getNo_of_persons() {
	return no_of_persons;
}
public void setNo_of_persons(int no_of_persons) {
	this.no_of_persons = no_of_persons;
}
public String getType_of_room() {
	return type_of_room;
}
public void setType_of_room(String type_of_room) {
	this.type_of_room = type_of_room;
}
public String getType_of_bed() {
	return type_of_bed;
}
public void setType_of_bed(String type_of_bed) {
	this.type_of_bed = type_of_bed;
}
 
}



	


