package com.assignment.patient.hub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.patient.hub.entity.Patient;
import com.assignment.patient.hub.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/patients")
	public Patient savePatient(@Validated @RequestBody Patient patient)
	{
		return patientService.savePatientId(patient);
	}
	
	@GetMapping("/patients")
	public List<Patient> getAllPatients()
	{
		return patientService.fetchPatientIdList();
	}
	
	@PutMapping("/patients/{id}")
	public Patient updatePatient(@RequestBody Patient patient, 
			@PathVariable("id") Long patientId )
	{
		return patientService.updatePatient(patient, patientId);
	}
	@DeleteMapping("/patients/{id}")
	public String deleteDepartMentById(@PathVariable("id") Long patientId)
	{
		patientService.deletePatientById(patientId);
		return "Deleted Successfully";
	}
	@GetMapping("/patients/{id}")
	public Patient getPatientById(@PathVariable("id") Long patientId)
	{
		return patientService.getPatientById(patientId);
		
	}
}
