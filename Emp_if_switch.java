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
       System.out.println(id +" " + add);
   }
   void timings(){
      if(type.equals("hr")){
         System.out.println("hr 9 to 6");
      }
      else if(add.equals("ABC")){
         System.out.println("admin 9-7");
      }
      else{
         System.out.println("9 to 7");
      }
   }
   void decision(){
      switch(type){
         case "hr":
            System.out.println("hr 10 to 7");
            break;
         case "admin":
            System.out.println("admin 9 to 7");
            break;
         default :
            System.out.println(" 11 to 5");
            break;
      }

   }
}

   public class Emp_if_switch {
    public static void main(String[] args) {
   
        Employee e5=new Employee(5,"abcd","hr");
        Employee e6=new Employee(6, "ABC","admin");
        Employee e7=new Employee(7,"cde","systemEngg");

        e5.timings();
        e6.timings();
        e7.timings();

        System.out.println("............");

        e5.decision();
        e6.decision();
        e7.decision();

    }
}


