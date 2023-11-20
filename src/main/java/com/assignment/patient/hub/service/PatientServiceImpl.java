package com.assignment.patient.hub.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.patient.hub.entity.Patient;
import com.assignment.patient.hub.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired 
	private PatientRepository patientRepository;

	@Override
	public Patient savePatientId(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> fetchPatientIdList() {
		
		return (List<Patient>) patientRepository.findAll();
	}

	@Override
	public Patient updatePatient(Patient patient, Long patientId) {
		Patient patient1 = patientRepository.findById(patientId).get();
		
		if(Objects.nonNull(patient.getAddress()) && !"".equalsIgnoreCase(patient.getAddress()))
		{
			patient1.setAddress(patient.getAddress());
		}
		
		if(Objects.nonNull(patient.getGender()) && !"".equalsIgnoreCase(patient.getGender()))
		{
			patient1.setGender(patient.getGender());
		}
		
		if(Objects.nonNull(patient.getMobile()) && !"".equalsIgnoreCase(patient.getMobile()))
		{
			patient1.setMobile(patient.getMobile());
		}
		
		if(Objects.nonNull(patient.getName()) && !"".equalsIgnoreCase(patient.getName()))
		{
			patient1.setName(patient.getName());
		}
		
		if(Objects.nonNull(patient.getRecommendedBy()) && !"".equalsIgnoreCase(patient.getRecommendedBy()))
		{
			patient1.setRecommendedBy(patient.getRecommendedBy());
		}
	
		return patientRepository.save(patient1);
	}

	@Override
	public void deletePatientById(Long patientId) {
		
		patientRepository.deleteById(patientId);
		
	}

	@Override
	public Patient getPatientById(Long patientId) {
		
		return patientRepository.findById(patientId).get();
	}

}
