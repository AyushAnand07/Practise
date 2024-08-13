package SingletonClass;

//Singleton class in Java is a special class that allows only one instance (or object) of itself to be created.
//Create a private constructor of the class to restrict object creation outside the class.
//Create a private attribute of the class type that refers to the single object.
//Create a public static method that allows us to create and access the object we created.
class Database {
    private static Database dbObject; //private attribute of class type referring to object
    private Database() {  //Constructor
    }
    public static Database getInstance() {
        // create object if it's not already created
        if(dbObject == null) {
            dbObject = new Database();
        }
        // returns the singleton object
        return dbObject;
    }
    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}
class Main {
    public static void main(String[] args) {
        Database db1;
        // refers to the only object of Database
        db1= Database.getInstance();
        db1.getConnection();
    }
}

