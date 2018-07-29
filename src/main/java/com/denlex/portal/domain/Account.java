package com.denlex.portal.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "email", unique = true)
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide an e-mail")
	private String email;

	@Column(name = "login", nullable = false, unique = true)
	@NotEmpty(message = "Please provide your login")
	private String login;

	@Column(name = "password")
	@Transient
	private String password;

	public Account() {
	}

	public Account(@Email(message = "Please provide a valid e-mail") @NotEmpty(message = "Please provide an e-mail") String email, @NotEmpty(message = "Please provide your login") String login, String password) {
		this.email = email;
		this.login = login;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
