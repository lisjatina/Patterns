package structuralPatterns.adapter;

public class AdapterHrToDatabase extends HRApplication implements Database {
    @Override
    public void insert() {
     saveEmployee();
    }

    @Override
    public void update() {
    updateEmployeeData();
    }

    @Override
    public void select() {
    loadEmployeeData();
    }

    @Override
    public void delete() {
    deleteEmployee();
    }
}
