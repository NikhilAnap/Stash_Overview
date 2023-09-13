package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	private int userId;
	private String username;
	private String useraddr;

}
