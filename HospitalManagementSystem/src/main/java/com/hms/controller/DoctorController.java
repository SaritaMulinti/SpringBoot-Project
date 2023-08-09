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

import com.hms.DTO.DoctorDTO;
import com.hms.Entity.Doctor;
import com.hms.Service.DoctorService;
import com.hms.Util.DoctorConverter;

@RestController
	@RequestMapping("/Doctors")
	public class DoctorController{
	    @Autowired
	    DoctorService doctorService;
		
		@Autowired
		DoctorConverter doctorConverter;

	    @PostMapping("/addDoctors")
	    ResponseEntity<DoctorDTO> addDoctor(@RequestBody DoctorDTO doctorDTO)
	    {
	    		Doctor doctor=doctorConverter.convertToDoctorEntity(doctorDTO);
	    		return new ResponseEntity<DoctorDTO>(doctorService.addDoctor(doctor),HttpStatus.CREATED);
	    	
	    }
	    @GetMapping("/getDoctorById/{id}")
        ResponseEntity<DoctorDTO> getAllDoctors(int id)
	    {
	    	return new ResponseEntity<DoctorDTO>(doctorService.getDoctorById(id),HttpStatus.FOUND);
		}
	    
	    @GetMapping("/getAllDoctor")
	    ResponseEntity<List<DoctorDTO>> getDoctors()
		{
			return new ResponseEntity<List<DoctorDTO>>(doctorService.getAllDoctors(),HttpStatus.FOUND);
		}
	    
	    
	
	    
	    
	}
	