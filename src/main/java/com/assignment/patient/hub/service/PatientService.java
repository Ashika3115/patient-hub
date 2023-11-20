package com.assignment.patient.hub.service;

import java.util.List;

import com.assignment.patient.hub.entity.Patient;

public interface PatientService {
	
	// Save operation
    Patient savePatientId(Patient patient);
 
    // Read operation
    List<Patient> fetchPatientIdList();
 
    // Update operation
    Patient updatePatient(Patient patient,
                                Long patientId);
 
    // Delete operation
    void deletePatientById(Long patientId);
    
    //Get By Id
    Patient getPatientById(Long patientId);

}
