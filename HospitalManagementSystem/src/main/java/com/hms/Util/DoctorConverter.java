package com.hms.Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.hms.DTO.DoctorDTO;
import com.hms.Entity.Doctor;

@Component
	public class DoctorConverter {
	//converting DTO to entity
		
		public Doctor convertToDoctorEntity(DoctorDTO doctorDTO)
		{
			Doctor doctor=new Doctor();
			if(doctorDTO!=null)
			{
				BeanUtils.copyProperties(doctorDTO,doctor );
			}
			return doctor;
		}
			
			//converting  entity to DTO
			public DoctorDTO convertToDoctorDTO(Doctor doctor)
			{
				DoctorDTO doctorDTO=new DoctorDTO();
				if(doctor!=null)
				{
					BeanUtils.copyProperties(doctor,doctorDTO );
				}
				return doctorDTO;
				
			}
			
			

			
		}
	
		
		


