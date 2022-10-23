package com.example.springjpaapi.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "chuyenbay")
@Entity
public class ChuyenBay {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String gaDi;
	private String gaDen;
}
