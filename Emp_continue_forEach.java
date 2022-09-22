import java.util.*;

class Employee{
   int id;
   String add;
   String name;
   String type;

   Employee(int id,String add,String type){
   this.id=id;
   this.add=add;
   this.type=type;
   }
   Employee(String type){
      this.type=type;
   }
   void getIdWithAdd(){
       System.out.println(id +" " + add+" "+ type);
   }
      }

public class Emp_continue_forEach {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "a1", "hr");
        Employee e2 = new Employee(2, "bcd", "hr");
        Employee e3 = new Employee(3, "ABaC", "admin");
        Employee e4 = new Employee(4, "cde", "systemEngg");
        Employee e5 = new Employee(5, "acd", "hr");
        Employee e6 = new Employee(6, "ADC", "admin");
        Employee e7 = new Employee(7, "cde", "systemEngg");
        Employee e8 = new Employee(8, "abd", "hr");
        Employee e9 = new Employee(9, "BC", "admin");
        Employee e10 = new Employee(10, "cde", "systemEngg");

        ArrayList<Employee> empArray = new ArrayList<>();

        empArray.add(e1);
        empArray.add(e2);
        empArray.add(e3);
        empArray.add(e4);
        empArray.add(e5);
        empArray.add(e6);
        empArray.add(e7);
        empArray.add(e8);
        empArray.add(e9);
        empArray.add(e10);

        for (Employee emp : empArray) {
            if (emp.id % 2 == 0)
                continue;
            {
                emp.getIdWithAdd();

            }

        }
    }
}
