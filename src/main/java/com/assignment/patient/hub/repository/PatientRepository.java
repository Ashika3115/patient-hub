package com.assignment.patient.hub.repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.patient.hub.entity.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
