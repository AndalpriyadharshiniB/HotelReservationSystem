package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotelreq {
	

	private String name;
	private String phnno;
	@Id
	private String proof_idno;
	private String address;
	private String no_of_persons;
	private String type_of_room;
	private String type_of_bed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	public String getProof_idno() {
		return proof_idno;
	}
	public void setProof_idno(String proof_idno) {
		this.proof_idno = proof_idno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNo_of_persons() {
		return no_of_persons;
	}
	public void setNo_of_persons(String no_of_persons) {
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