package com.hms.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String specialization;
    private Long phoneNumber;
    
   /* @OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Patient_id")
	private List<Patient> patientList;
	public Doctor(int id, String name, String specialization, Long phoneNumber, List<Patient> patientList) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.phoneNumber = phoneNumber;
		this.patientList = patientList;
	}*/

    
	
}