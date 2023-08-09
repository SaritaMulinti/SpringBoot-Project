package com.hms.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.DTO.PatientDTO;
import com.hms.Entity.Patient;
import com.hms.Repository.PatientRepository;
import com.hms.Service.PatientService;
import com.hms.Util.PatientConverter;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	PatientConverter patientConverter;
	@Override
	public PatientDTO addPatient(Patient patient) {
		Patient p=patientRepository.save(patient);
		return patientConverter.convertToPatientDTO(p);
		
	}

	@Override
	public List<PatientDTO> getAllPatients() {
List<Patient> Patients=patientRepository.findAll();

		List<PatientDTO> dtoList=new ArrayList<>();
		for(Patient p :Patients)
		{
			dtoList.add(patientConverter.convertToPatientDTO(p));
		}
		return dtoList;
		}

	@Override
	public PatientDTO getPatientById(int id) {
		Patient patient=patientRepository.findById(id).get();
		return patientConverter.convertToPatientDTO(patient);
		
	}

	@Override
	public PatientDTO updatePatient(int id, Patient patient) {
		Patient p=patientRepository.findById(id).get();
		p.setName(patient.getName());
		p.setAddress(patient.getAddress());
		Patient P=patientRepository.save(p);
		return patientConverter.convertToPatientDTO(p);
	}

	@Override
	public String deletePatient(int id) {
         patientRepository.deleteById(id);
		
		return "Patient details got deleted successfuly"; 
	}

	@Override
	public Patient addPatient(@Valid PatientDTO patientDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
  
}




	
	
  




		

	
   

   


