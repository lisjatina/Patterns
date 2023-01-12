package CreationalPattern.Factory;

public class SurgeonDoctorFactory implements DoctorFactory{
    @Override
    public Doctor createDoctor() {
        return new Surgeon();
    }
}
