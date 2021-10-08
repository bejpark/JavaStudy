package com.example.login.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="loginUser")
@Data
public class UserDto implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userno;
	private String id;
	private String pwd;

}
