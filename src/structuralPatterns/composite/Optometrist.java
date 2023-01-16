package structuralPatterns.composite;

public class Optometrist implements Doctor {
    @Override
    public void treatPatent() {
        System.out.println("Optomenrist performs an optometric check");
    }
}
