package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List <Doctor> doctors = new ArrayList<>();

    public void addDoctorToTeam(Doctor doctor){
    doctors.add(doctor);
    }

    public void removeDoctorFromTeam (Doctor doctor){
        doctors.remove(doctor);
    }

    public void createShift(){
        System.out.println("Team goes to the shift");
        for (Doctor doctor: doctors
             ) {
           doctor.treatPatent();
        }
    }
}
