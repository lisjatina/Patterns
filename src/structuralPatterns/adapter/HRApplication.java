package structuralPatterns.adapter;

public class HRApplication {

    public void saveEmployee(){
        System.out.println("Saving new employee to the Database");
    }
    public void updateEmployeeData(){
        System.out.println("Updating employee data in the Database");
    }

    public void loadEmployeeData(){
        System.out.println("Loading employee data from the Database");
    }

    public void deleteEmployee(){
        System.out.println("Deleting employee from the Database");
    }
}
