package com.devi.Demo_Hib;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class devi {
	@Id
	private int d_id;
	private String d_name;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
}
