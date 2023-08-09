package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.DTO.PatientDTO;
import com.hms.Entity.Patient;
import com.hms.Service.PatientService;
import com.hms.Util.PatientConverter;

@RestController
	@RequestMapping("/Patients")
	public class PatientController{
	    @Autowired
	    PatientService patientService;
		
		@Autowired
		PatientConverter patientConverter;

	    @PostMapping("/addPatients")
	    ResponseEntity<PatientDTO> addPatient(@RequestBody  PatientDTO patientDTO)
	    {
	    		Patient patient=patientConverter.convertToPatientEntity(patientDTO);
	    		return new ResponseEntity<PatientDTO>(patientService.addPatient(patient),HttpStatus.CREATED);
	    	
	    }
	    @GetMapping("/getPatientById/{id}")
        ResponseEntity<PatientDTO> getAllPatients(int id)
	    {
	    	return new ResponseEntity<PatientDTO>(patientService.getPatientById(id),HttpStatus.FOUND);
		}
	    
	    @GetMapping("/getAllPatient")
	    ResponseEntity<List<PatientDTO>> getPatients()
		{
			return new ResponseEntity<List<PatientDTO>>(patientService.getAllPatients(),HttpStatus.FOUND);
		}
}
	    
	    
	