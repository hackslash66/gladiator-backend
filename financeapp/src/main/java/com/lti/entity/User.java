package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "uname")
	public String uname;
	@Column(name = "uemail")
	public String uemail;
	@Column(name = "upwd")
	public String upwd;
	@Column(name = "ucontact")
	public String ucontact;
	@Column(name = "Name")
	public String Name;
	@Column(name = "ubankacct")
	public String ubankacct;
	@Column(name = "uifsc")
	public String uifsc;
	@Column(name = "uaddress")
	public String uaddress;
	@Column(name = "ucardtype")
	public String ucardtype;
	@Column(name = "status")
	public String approvalstatus;
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
}
