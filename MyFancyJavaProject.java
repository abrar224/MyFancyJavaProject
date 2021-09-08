package SoftwareAssignment;

class DbConnection{
    String dbUser;
    String dbPassword;
    String dbName;
    DbConnection(String dbUser, String dbPassword, String dbName) {
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbName = dbName;
    }

    void printAll(){
        System.out.println("User: " + dbUser + "\nPassword: " + dbPassword + "\nDBName: " + dbName);
    }
}

public class MyFancyJavaProject {

    public static void main(String[] args){
        String dbUser="abrar";
        String dbPassword="5678";
        String dbName="testDb";
        DbConnection connection = new DbConnection(dbUser, dbPassword, dbName);
        connection.printAll();
    }
}