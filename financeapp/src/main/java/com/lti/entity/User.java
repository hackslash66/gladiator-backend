package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "uname")
	private String uname;
	@Column(name = "uemail")
	private String uemail;
	@Column(name = "upwd")
	private String upwd;
	@Column(name = "ucontact")
	private String ucontact;
	@Column(name = "name")
	private String Name;
	@Column(name = "ubankacct")
	private String ubankacct;
	@Column(name = "uifsc")
	private String uifsc;
	@Column(name = "uaddress")
	private String uaddress;
	@Column(name = "ubank")
	private String bank;
	@Column(name = "ucardtype")
	private String ucardtype;
	@Column(name = "status")
	private String approvalstatus;
	
	
	@OneToMany(mappedBy = "user",cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	//@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Product> products=new ArrayList<Product>();
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUcontact() {
		return ucontact;
	}
	public void setUcontact(String ucontact) {
		this.ucontact = ucontact;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUbankacct() {
		return ubankacct;
	}
	public void setUbankacct(String ubankacct) {
		this.ubankacct = ubankacct;
	}
	public String getUifsc() {
		return uifsc;
	}
	public void setUifsc(String uifsc) {
		this.uifsc = uifsc;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUcardtype() {
		return ucardtype;
	}
	public void setUcardtype(String ucardtype) {
		this.ucardtype = ucardtype;
	}
	public String getApprovalstatus() {
		return approvalstatus;
	}
	public void setApprovalstatus(String approvalstatus) {
		this.approvalstatus = approvalstatus;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
}
