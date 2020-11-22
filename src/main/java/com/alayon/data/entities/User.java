package com.alayon.data.entities;

import java.util.Date;

import lombok.Data;

@Data
public class User {

	private Long userId;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String emailAddress;
	private Date lastUpdateDate;
	private Date lastUpdateBy;
	private Date createdDate;
	private String createdBy;

}
