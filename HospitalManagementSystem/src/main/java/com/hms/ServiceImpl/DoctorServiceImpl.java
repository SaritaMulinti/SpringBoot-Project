package com.hms.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.DTO.DoctorDTO;
import com.hms.Entity.Doctor;
import com.hms.Repository.DoctorRepository;
import com.hms.Service.DoctorService;
import com.hms.Util.DoctorConverter;
import java.util.ArrayList;
@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	DoctorConverter doctorConverter;
	@Override
	public DoctorDTO addDoctor(Doctor doctor) {
		Doctor doc=doctorRepository.save(doctor);
		return doctorConverter.convertToDoctorDTO(doc);
		
	}

	@Override
	public List<DoctorDTO> getAllDoctors() {
List<Doctor> Doctors=doctorRepository.findAll();

		List<DoctorDTO> dtoList=new ArrayList<>();
		for(Doctor d :Doctors)
		{
			dtoList.add(doctorConverter.convertToDoctorDTO(d));
		}
		return dtoList;
		}

	@Override
	public DoctorDTO getDoctorById(int id) {
		Doctor doctor=doctorRepository.findById(id).get();
		return doctorConverter.convertToDoctorDTO(doctor);
		
	}

	@Override
	public DoctorDTO updateDoctor(int id, Doctor doctor) {
		Doctor d=doctorRepository.findById(id).get();
		d.setName(doctor.getName());
		d.setSpecialization(doctor.getSpecialization());
		d.setPhoneNumber(doctor.getPhoneNumber());
		Doctor doc=doctorRepository.save(d);
		return doctorConverter.convertToDoctorDTO(doc);
	}

	@Override
	public String deleteDoctor(int id) {
         doctorRepository.deleteById(id);
		
		return "Doctor details got deleted successfuly"; 
	}

	
	}

	
	
  



