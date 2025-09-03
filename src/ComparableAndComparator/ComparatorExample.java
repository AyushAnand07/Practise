package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    private int id;
    private String name;
    private double salary;

    public ComparatorExample(int id, String name, double salary) {
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
        return "ComparatorExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class TestComparatorExample
{
    public static void main(String []args)
    {
        List<ComparatorExample> emp= new ArrayList<>();
        emp.add(new ComparatorExample(1,"Ayush",2000000));
        emp.add(new ComparatorExample(1,"Suyash",1200000));
        emp.add(new ComparatorExample(1,"kendrick",400000));
        emp.add(new ComparatorExample(1,"Drake",21000));


        Comparator<ComparatorExample> com= new Comparator<>() {
            @Override
            public int compare(ComparatorExample o1, ComparatorExample o2) {
                if (o1.getSalary() > o2.getSalary())
                    return 1;
                else
                    return -1;

            }
        };

        Collections.sort(emp,com);
        for(ComparatorExample s : emp)
            System.out.println(s);

    }
}