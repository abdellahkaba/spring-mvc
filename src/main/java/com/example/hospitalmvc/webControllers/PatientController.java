package com.example.hospitalmvc.webControllers;

import com.example.hospitalmvc.entites.Patient;
import com.example.hospitalmvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository ;

    //Une methode qui accede la liste des patients

    @GetMapping(path = "/index")
    public String patients (Model model){
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("patients",patients);
        return "patients" ;
    }
}
