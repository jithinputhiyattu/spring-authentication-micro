package spring.authentication.micro.jpa.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;
import spring.authentication.micro.pojo.NewUser;

@Entity
@Table(name = "USER_DETAILS")

@Getter
@Setter
public class User {

	public User() {
		super();
	}

	public User(NewUser newUser) {
		this.userName = newUser.getUsername();
		this.password = newUser.getPassword();
		this.roles = "USER";
		this.active = true;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;
	private String userName;
	private String password;
	private String roles;
	private boolean active;

}
