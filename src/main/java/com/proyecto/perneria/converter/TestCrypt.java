package com.proyecto.perneria.converter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCrypt {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder ps= new BCryptPasswordEncoder();
		System.out.println(ps.encode("user"));
		

	}

}
