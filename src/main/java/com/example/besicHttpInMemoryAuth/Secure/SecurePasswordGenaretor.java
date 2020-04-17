package com.example.besicHttpInMemoryAuth.Secure;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurePasswordGenaretor {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String yourRowPassword = "abboammo@gmail.com.bd";
        String anikaRowPassword = "anika@gmail.com.bd";
        String yourencodePassword = bCryptPasswordEncoder.encode(yourRowPassword);//for you
        String anikaencodePassword = bCryptPasswordEncoder.encode(anikaRowPassword);//for anika
        System.out.println("This is your password = "+ yourencodePassword);
        System.out.println("This is your password = "+ anikaencodePassword);


    }
}
