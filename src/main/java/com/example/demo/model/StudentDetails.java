package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students_Information")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stuId;
	private String stuName;
	private String email;
	private String mobile;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "stuID_addrId")
	private List<AddressDetails> address;

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<AddressDetails> getAddress() {
		return address;
	}

	public void setAddress(List<AddressDetails> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDetails [stuId=" + stuId + ", stuName=" + stuName + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}


}
