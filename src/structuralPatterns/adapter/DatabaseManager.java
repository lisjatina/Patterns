package structuralPatterns.adapter;

public class DatabaseManager {
    public static void main(String[] args) {
        Database database = new AdapterHrToDatabase();
        database.insert();
        database.update();
        database.select();
        database.delete();

    }
}
