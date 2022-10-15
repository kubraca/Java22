package Week3_OopWithNLayered.AbstractDemo;

public class OracleDatabaseManager  extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Database can get Oracle...");
    }
}
