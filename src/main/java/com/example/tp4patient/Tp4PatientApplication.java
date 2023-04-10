package com.example.tp4patient;

import com.example.tp4patient.entities.Patient;
import com.example.tp4patient.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp4PatientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp4PatientApplication.class, args);
    }
//@Bean
CommandLineRunner CommandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"hanan",new Date(),false,122));
            patientRepository.save(new Patient(null,"naji",new Date(),false,321));
            patientRepository.save(new Patient(null,"mohammed",new Date(),true,564));
            patientRepository.save(new Patient(null,"salimi",new Date(),false,123));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
}

}
