package Week3_OopWithNLayered.AbstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Database can get Mysql database..");
    }
}
