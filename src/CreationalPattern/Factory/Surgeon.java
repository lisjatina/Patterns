package CreationalPattern.Factory;

public class Surgeon implements Doctor {

    @Override
    public void treatPatent() {
        System.out.println("Surgeon does the operation");

    }
}
