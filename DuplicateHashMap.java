import java.util.*;
import java.util.Map;

class Employee {
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;

    }
    public int hashCode()
    {
        int hashcode = 0;
        return hashcode;

    }
    public boolean equals(Object obj)
    {
        if (obj instanceof Employee) {
            Employee emp = (Employee)obj;
            return (emp.name.equals(this.name)
                    && emp.id == this.id);
        }
        else {
            return false;
        }
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }





    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class DuplicateHashMap{
	public static void main(String[] args){

  Map<Employee, Integer> map = new HashMap<Employee, Integer>();
        Employee e1 = new Employee(1, "abc");

        Employee e2 = new Employee(2, "def");
        Employee e3 = new Employee(3, "ghi");
        Employee e4 = new Employee(4, "jkl");
        Employee e5 = new Employee(5, "xyz");
        Employee e11 = new Employee(1, "abc");


        map.put(e1, 1);
        map.put(e2, 2);
        map.put(e3, 3);
        map.put(e4, 4);
        map.put(e5, 5);
        map.put(e11, 1);


      
        for (Map.Entry<Employee, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=>"
                    + entry.getValue());
        }


    }
}

