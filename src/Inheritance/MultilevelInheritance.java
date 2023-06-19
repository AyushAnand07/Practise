package Inheritance;

public class MultilevelInheritance {

        String getName(){
            return "Im a programmer";
        }
    }

    class Programmer extends MultilevelInheritance{
        String getCodingLanguage(){
            return "Java";
        }
    }

    class Program extends Programmer{
        int getLineOfCode(){
            return 25;
        }
        public static void main(String[] args) {
            Program program = new Program();
            System.out.println(" I am "+program.getName()+" and I code in "+ program.getCodingLanguage()+
                    " . This program has "+program.getLineOfCode()+" lines.");
        }
}
