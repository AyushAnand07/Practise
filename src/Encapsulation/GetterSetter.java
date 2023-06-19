package Encapsulation;

import java.io.IOException;

public class GetterSetter {
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
}

class Main {
    public static void main(String[] args) {
        GetterSetter myObj = new GetterSetter();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}

