package com.hms.Service;

import java.util.List;

import javax.validation.Valid;

import com.hms.DTO.PatientDTO;
import com.hms.Entity.Patient;

	public interface PatientService {
			PatientDTO addPatient(Patient patient);
			List<PatientDTO> getAllPatients();
			PatientDTO getPatientById(int id);
			PatientDTO updatePatient(int id,Patient patient);
			String deletePatient(int id);

		Patient addPatient(@Valid PatientDTO patientDTO);
	}
	

		
		
		
	
  

