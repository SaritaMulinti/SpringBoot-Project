package com.hms.Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.hms.DTO.PatientDTO;
import com.hms.Entity.Patient;

@Component
	public class PatientConverter {
	//converting DTO to entity
		
		public Patient convertToPatientEntity(PatientDTO patientDTO)
		{
			Patient patient=new Patient();
			if(patientDTO!=null)
			{
				BeanUtils.copyProperties(patientDTO, patient);
			}
			return patient;
			
		}
		//converting  entity to DTO
		public PatientDTO convertToPatientDTO(Patient patient)
		{
			PatientDTO patientDTO=new PatientDTO();
			if(patient!=null)
			{
				BeanUtils.copyProperties(patient, patientDTO);
			}
			return patientDTO;
			
		}

	}


