package com.cognizant;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Users {
	private int userId;
	@NonNull
	private String name;
	private LocalDate dob;
}
