//package com.example.sec.config;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.stereotype.Service;
//
//@Service
//class CustomInMemoryUserDetailsManager extends InMemoryUserDetailsManager {
//
//    public CustomInMemoryUserDetailsManager() {
//        User.UserBuilder userBuilder = User.builder();
//        // admin - hard
//        String passwordBCrypt ="{bcrypt}" + new BCryptPasswordEncoder().encode("hard");
//        System.out.println(passwordBCrypt);
//        UserDetails admin = userBuilder.username("admin").password(passwordBCrypt).roles("ADMIN").build();
//
//        // john - john
//        String passwordzMD5 = "{MD5}" + new MessageDigestPasswordEncoder("MD5").encode("john");
//        System.out.println(passwordzMD5);
//        UserDetails user1 = userBuilder.username("john").password(passwordzMD5).roles("USER").build();
//
//        // kicek - lucek
//        String passordArgon2 = "{argon2}" + Argon2PasswordEncoder.defaultsForSpringSecurity_v5_8().encode("lucek");
//        System.out.println(passordArgon2);
//        UserDetails user2 = userBuilder.username("kicek").password(passordArgon2).roles("USER").build();
//
//        createUser(admin);
//        createUser(user1);
//        createUser(user2);
//    }
//}
