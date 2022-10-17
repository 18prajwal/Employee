package org.example;

import java.util.*;

class Employee extends Thread{
    @Override
    public void run() {

    }
}
class Ticket{
    String EmployeeId;
    String EmployeeName;
    String IssueDescription;

/*    public Ticket() {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        IssueDescription = issueDescription;
    }*/

    void createTicket(){
        System.out.print("please enter your Employee id : ");
        Scanner sc=new Scanner(System.in);
        String id= sc.next();
        System.out.print("please enter your name : ");
        String name=sc.next();
        System.out.print("please enter your issue : ");
        String issue=sc.next();
        System.out.println("Ticket is created by Id "+ id  +" name "+ name +" having " +  issue +" issues");

    }
    void receivedTicket(){
        System.out.println("here are the tickets which are received from the other team" );

    }



    void checkStatus(String sent){
        System.out.println("Contacting the "+ sent+" team");
        if(sent.equals("IT")){
            System.out.println("Hello this is IT Team ");
            Scanner sc=new Scanner(System.in);
            String status=sc.nextLine();
            if(status.equals("work done")){
                System.out.println("the issue is fixed you can check");
            }
            else{
                System.out.println("wait a bit we are trying to fix");
            }
        }
        else if(sent.equals("HR")){
            System.out.println("Hello this is HR Team ");
            Scanner sc=new Scanner(System.in);
            String status=sc.nextLine();
            if(status.equals("work done")){
                System.out.println("the issue is fixed you can check");
            }
            else{
                System.out.println("wait a bit we are trying to fix");
            }
        }
        else if(sent.equals("Finance")){
            System.out.println("Hello this is Finance Team ");
            Scanner sc=new Scanner(System.in);
            String status=sc.nextLine();
            if(status.equals("work done")){
                System.out.println("the issue is fixed you can check");
            }
            else{
                System.out.println("wait a bit we are trying to fix");
            }

        }
        else{
            System.out.println("Hello this is Facility Team ");
            Scanner sc=new Scanner(System.in);
            String status=sc.nextLine();
            if(status.equals("work done")){
                System.out.println("the issue is fixed you can check");
            }
            else{
                System.out.println("wait a bit we are trying to fix");
            }
        }

    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Management System");

        int ticketNumber=12;
        int eta=1;
        String IT=null;
        boolean j=true;
        while(j) {
            System.out.println(" ");
            System.out.println(" Press 1 for IT Team \n Press 2 for HR Team \n Press 3 for Finance Team \n Press 4 for Facility Team \n Press 5 for exit");
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            switch (i) {
                case 1:
                    List list1=new ArrayList<>();
                    System.out.println("Hello This is IT Team");
                    System.out.println("press 1 for raising a ticket and 2 for check the status ");
                    int options1 = sc.nextInt();
                    Ticket t1 = new Ticket();
                    if (options1==1) {
                        t1.createTicket();
                        System.out.println("To whom the ticket is sent");
                        String sent=sc.next();
                        System.out.println("ticket is created with the ticket number " + ticketNumber + " by the IT Team" + " and sent to the " + sent + " and ETA will be " + eta + " hours ");
                        list1.add(ticketNumber);
                        ticketNumber++;

                    }
                    else if(options1==2){
                        System.out.println("Asking status to the team" );
                        //System.out.println(ticketNumber);
                        String sent=sc.next();
                        t1.checkStatus(sent);

                    }
                    else {
                           //list1.add(ticketNumber);
                        System.out.println(list1);

                    }

                    break;
                case 2:
                    System.out.println("Hello This is HR Team");
                    System.out.println("press 1 for raising a ticket and 2 for check the status ");
                    int options2 = sc.nextInt();
                    Ticket t2 = new Ticket();
                    if (options2==1) {
                        t2.createTicket();
                        System.out.println("To whom the ticket is sent");
                        String sent=sc.next();
                        System.out.println("ticket is created with the ticket number " + ++ticketNumber + " by the HR Team"+ " and sent to the "+ sent + " and ETA will be " + eta + " hours");

                    } else if(options2==2){
                        System.out.println("Asking status to the team");
                        String sent=sc.next();
                        t2.checkStatus(sent);
                    }
                    else {

                    }
                    break;
                case 3:
                    System.out.println("Hello This is Finance Team");
                    System.out.println("press 1 for raising a ticket and 2 for check the status  ");
                    int options3 = sc.nextInt();
                    Ticket t3 = new Ticket();
                    if (options3==1) {
                        t3.createTicket();
                        System.out.println("To whom the ticket is sent");
                        String sent=sc.next();
                        System.out.println("ticket is created with the ticket number " + ++ticketNumber + " by the Finance Team" + " and sent to the "+ sent +" and ETA will be " + eta + " hours");
                    } else {
                        System.out.println("Asking status to the team");
                        String sent=sc.next();
                        t3.checkStatus(sent);
                    }
                    break;
                case 4:
                    System.out.println("Hello This is Facility Team");
                    System.out.println("press 1 for raising a ticket and 2 for check the status ");
                    int options4 = sc.nextInt();
                    Ticket t4 = new Ticket();
                    if (options4==1) {
                        t4.createTicket();
                        System.out.println("To whom the ticket is sent");
                        String sent=sc.next();
                        System.out.println("ticket is created with the ticket number " + ++ticketNumber + " by the Facility Team" +" and sent to the "+ sent + " and ETA will be " + eta + " hours");
                    } else {
                        System.out.println("Asking status to the team");
                        String sent=sc.next();
                        t4.checkStatus(sent);
                    }
                    break;
                case 5:
                    j=false;

            }
        }
    }
}