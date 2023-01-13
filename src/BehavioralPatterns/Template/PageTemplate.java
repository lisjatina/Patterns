package BehavioralPatterns.Template;

public abstract class PageTemplate {

    public void showPage(){
        System.out.println("Hostipal page header");
        showPageContent();
        System.out.println("Hospital page footer");
    }

    public abstract void showPageContent();
}
