package com.hms.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class DoctorDTO {
	
	@NotNull(message="User Id should not be null")
    private int id;
    
	@NotNull(message="User name should not be null")
	@Size(min=4,max=30)
    private String name;
    
	@NotNull(message="User specialization should not be null")
    private String specialization;
	
	@NotNull(message="User phoneNumber should not be null")
    @Min(value = 1000000000, message = "Phone number must be at least 10 digits")
    @Max(value = 9999999999L, message = "Phone number can have at most 10 digits")

    private Long phoneNumber;
}
	
	