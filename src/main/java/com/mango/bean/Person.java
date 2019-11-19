package com.mango.bean;

import java.util.Date;

public class Person {
    private Integer id;

    private String pName;

    private String pGender;

    private Integer pAge;

    private Date pBirthday;
    
    
    

    public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	public Person(String pName, String pGender, Integer pAge, Date pBirthday) {
		super();
		this.pName = pName;
		this.pGender = pGender;
		this.pAge = pAge;
		this.pBirthday = pBirthday;
	}



	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpGender() {
        return pGender;
    }

    public void setpGender(String pGender) {
        this.pGender = pGender == null ? null : pGender.trim();
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    public Date getpBirthday() {
        return pBirthday;
    }

    public void setpBirthday(Date pBirthday) {
        this.pBirthday = pBirthday;
    }



	@Override
	public String toString() {
		return "Person [id=" + id + ", pName=" + pName + ", pGender=" + pGender + ", pAge=" + pAge + ", pBirthday="
				+ pBirthday + "]";
	}
    
    
    
}