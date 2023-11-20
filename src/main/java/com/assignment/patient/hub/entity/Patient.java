package com.assignment.patient.hub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long patientId;
	
	private String name;
	
	private int age;
	
	private String Address;
	
	private String recommendedBy;
	
	private String mobile;
	
	private String gender;
	
}
