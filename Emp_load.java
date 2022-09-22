class EMP{
    int id;
    String name, address;
    String phone;

    public EMP(int i, String n, String a, String p){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
    }

    public void display(int i){
        System.out.println("Name:"+id+"\tphone:"+phone);
    }

    public void display(){
        System.out.println("\nName:"+name+"\tAddress:"+address);
    }

}

class HR extends EMP{

    int salary;

    public HR(int i, String n, String a, String p, int sal) {
        super(i, n, a, p);
        this.salary = sal;
    }

     public void empWithSalary(){
        System.out.println("\nEmployee Name: "+name+"\nSalary: "+salary);
    }

    public void empWithSalary(int tax){
        System.out.println("\nEmployee Name: "+name+"\nSalary: "+(salary-tax)+"\nTax Deducted: "+tax);
    }
}



public class Emp_load {

    public static void main(String args[]){

        EMP obj1 = new EMP(1,"abc","bng", "0909");
        HR obj2 = new HR(2,"def","glb", "12345", 200);
        /*obj1.display(1);
        obj1.display();*/

        obj2.empWithSalary();
        obj2.empWithSalary(30);
    }
}
