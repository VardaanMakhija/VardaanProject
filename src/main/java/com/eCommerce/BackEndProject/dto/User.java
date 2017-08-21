package com.eCommerce.BackEndProject.dto;

import java.io.Serializable;

import javax.persistence.*;

public class User implements Serializable {

	private static final long serialVerionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.Auto)
	private long user_id;

	private String name;

	@Column(unique = true)
	private String email;

	private String passwrd;
	private String address;

	private String contact;
	private String role = "CUSTOMER";
	private boolean enabled = true;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswrd() {
		return passwrd;
	}

	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public static long getSerialverionuid() {
		return serialVerionUID;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", passwrd=" + passwrd
				+ ", address=" + address + ", contact=" + contact + ", role=" + role + ", enabled=" + enabled + "]";
	}

}
