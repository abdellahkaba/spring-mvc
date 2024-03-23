package com.example.hospitalmvc;

import com.example.hospitalmvc.entites.Patient;
import com.example.hospitalmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class HospitalMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalMvcApplication.class, args);
    }

   // @Bean
    CommandLineRunner commandLineRunner (PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(new Patient(null,"Hassan",new Date(),false, 18));
            patientRepository.save(new Patient(null,"Abdellah",new Date(),true, 33));
            patientRepository.save(new Patient(null,"Mussa",new Date(),true, 24));
            patientRepository.save(new Patient(null,"Oumar",new Date(),false, 19));

            //Affiche tous les utilisateurs
            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });
        };
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
    }
}
