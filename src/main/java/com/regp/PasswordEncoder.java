package com.regp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String rawPassword = "rohan@1998";
        String encodePassword = encoder.encode(rawPassword);
        
        System.out.println(encodePassword);

	}

}
