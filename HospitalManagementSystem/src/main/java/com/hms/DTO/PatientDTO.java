package com.hms.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PatientDTO {
	@NotBlank(message="user Id should not be blank")
	@NotNull(message="User Id should not be null")
	 private int id;
	
	@NotBlank(message="patient Name should not be blank")
	@NotNull(message="patient Name should not be null")
	    private String name;
	
	@NotBlank(message="patient address should not be blank")
	@NotNull(message="patient address should not be null")
	    private String address;
		
		

}
