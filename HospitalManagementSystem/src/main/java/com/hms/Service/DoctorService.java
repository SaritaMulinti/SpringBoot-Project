package com.hms.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.hms.DTO.DoctorDTO;
import com.hms.Entity.Doctor;

@Service
public interface DoctorService {
	DoctorDTO addDoctor(Doctor doctor);
	List<DoctorDTO> getAllDoctors();
	DoctorDTO getDoctorById(int id);
	DoctorDTO updateDoctor(int id,Doctor doctor);
	String deleteDoctor(int id);
	
}


   