package com.Hibernate.learnHibernate;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int add_id;
    private String city;
    private String street;
    private String dist;
    @Column(name = "isopen")
    private boolean b;
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    
    @Lob
    private byte[] img;

	public int getAdd_id() {
		return add_id;
	}

	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] b2) {
		this.img = b2;
	}

	public Address(int add_id, String city, String street, String dist, boolean b, Date addedDate, byte[] img) {
		super();
		this.add_id = add_id;
		this.city = city;
		this.street = street;
		this.dist = dist;
		this.b = b;
		this.addedDate = addedDate;
		this.img = img;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}