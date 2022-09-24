final class Employee {
 
   
    private final String name;
 
   
    public Employee(String name)
    {
        this.name = name;
 
     }
 
   
    public String getName()
    {
	 return name;
    }
}
class Immutable {

    public static void main(String[] args)
    {
 
	 Employee s = new Employee("ABC");
 
        System.out.println(s.getName());
	s.getName().concat("XYZ");

	System.out.println(s.getName());
    }
}
