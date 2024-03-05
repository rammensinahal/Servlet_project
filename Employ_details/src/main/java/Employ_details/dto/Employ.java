package Employ_details.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employ {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int eid;
String ename;
String email;
String password;
int eage;
long phoneno;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getEage() {
	return eage;
}
public void setEage(int eage) {
	this.eage = eage;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}

@Override
public String toString() {
	return "Employ [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password + ", eage=" + eage
			+ ", phoneno=" + phoneno + "]";
}




}
