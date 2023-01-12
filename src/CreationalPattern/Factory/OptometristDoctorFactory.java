package CreationalPattern.Factory;

public class OptometristDoctorFactory implements DoctorFactory{
    @Override
    public Doctor createDoctor() {
        return new Optometrist();
    }
}
