package CreationalPattern.Factory;

public class Hospital {

        public static void main(String[] args) {
            String speciality = "surgeon";

           DoctorFactory doctorFactory = createDoctorBySpeciality(speciality);
           Doctor doctor = doctorFactory.createDoctor();
           doctor.treatPatent();
    }

    static DoctorFactory createDoctorBySpeciality (String speciality){
            if(speciality.equalsIgnoreCase("surgeon")){
                return new SurgeonDoctorFactory();
            }
            else if (speciality.equalsIgnoreCase("optometrist")){
                return new OptometristDoctorFactory();
            }
            else {
                throw new RuntimeException(speciality + " is unknown specialty");
            }
    }
}
