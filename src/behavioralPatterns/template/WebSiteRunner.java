package behavioralPatterns.template;

public class WebSiteRunner {

    public static void main(String[] args) {

        PageTemplate persnalPage = new PersonalsPage();
        PageTemplate servicePage = new ServicesPage();

        persnalPage.showPage();
        System.out.println("=======================");
        servicePage.showPage();
    }
}
