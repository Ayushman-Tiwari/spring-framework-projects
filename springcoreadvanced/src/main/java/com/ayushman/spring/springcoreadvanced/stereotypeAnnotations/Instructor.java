package com.ayushman.spring.springcoreadvanced.stereotypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

//	@Value("#{10+20}")
//	@Value("#{T(java.lang.Math).abs(-99)}")
//  @Value("#{new Integer(101)}")

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id = 15;

//	@Value("Ayushman")
//	@Value("#{new java.lang.String('Ayushman')}")

	@Value("#{'Ayushman'.toUpperCase()}")
	private String name = "Arvind";

	@Value("#{2+4>8?true:false}")
	private boolean active;

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", active=" + active + ", topics=" + topics + ", profile="
				+ profile + "]";
	}

}
