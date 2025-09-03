package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Need to override compareTo method for Comparable implementation
public class ComparableExample implements Comparable<ComparableExample> {
    private int id;
    private String name;
    private double salary;

    public ComparableExample(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ComparableExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(ComparableExample obj) {
        if(this.salary >obj.salary)
        return 1; //false

        else if(obj.salary>this.salary)
            return -1; //true
        else
            return 0;
    }
}

class TestComparableExample
{
    public static void main(String []args)
    {
        List<ComparableExample> emp= new ArrayList<>();
        emp.add(new ComparableExample(1,"Ayush",2000000));
        emp.add(new ComparableExample(1,"Suyash",1200000));
        emp.add(new ComparableExample(1,"kendrick",400000));
        emp.add(new ComparableExample(1,"Drake",21000));

        Collections.sort(emp);
        for(ComparableExample s : emp)
            System.out.println(s);

    }
}
