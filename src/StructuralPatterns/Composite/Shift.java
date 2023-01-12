package StructuralPatterns.Composite;

import CreationalPattern.Factory.Doctor;
import CreationalPattern.Factory.Optometrist;
import CreationalPattern.Factory.Surgeon;

public class Shift {

    public static void main(String[] args) {
        Team team = new Team();

        Doctor surgeonForAdults = new Surgeon();
        Doctor surgeonForKids = new Surgeon();
        Doctor optometrist = new Optometrist();

        team.addDoctorToTeam(surgeonForAdults);
        team.addDoctorToTeam(surgeonForKids);
        team.addDoctorToTeam(optometrist);

        team.createShift();
    }

}
