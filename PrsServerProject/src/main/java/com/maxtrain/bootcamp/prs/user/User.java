package com.maxtrain.bootcamp.prs.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(name = "UIDX_username", columnNames = { "username" }))
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 20, nullable = false)
	private String username;
	@Column(length = 10, nullable = false)
	private String password;
	@Column(length = 20, nullable = false)
	private String firstname;
	@Column(length = 20, nullable = false)
	private String lastname;
	@Column(length = 12, nullable = false)
	private String phone;
	@Column(length = 75, nullable = false)
	private String email;
	private boolean isReviewer;
	private boolean isActive;

	public int getId() {
		return id;
	}

	public User() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isReviewer() {
		return isReviewer;
	}

	public void setReviewer(boolean isReviewer) {
		this.isReviewer = isReviewer;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		this.isActive = active;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", phone=" + phone + ", email=" + email + ", isReviewer=" + isReviewer
				+ ", isActive=" + isActive + "]";
	}

}
