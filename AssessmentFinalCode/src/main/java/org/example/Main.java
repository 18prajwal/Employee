package org.example;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

class Ticket{
    String eid;
    String name;
    String issue;
    int ticketNumber;

   static String AssignedTeam;
    String TicketOwner;

    public Ticket(String eid, String name, String issue, int ticketNumber, String AssignedTeam, String TicketOwner) {
        this.eid = eid;
        this.name = name;
        this.issue = issue;
        this.ticketNumber = ticketNumber;
        this.AssignedTeam=AssignedTeam;
        this.TicketOwner=TicketOwner;
    }
}
public class Main {

    static Map<Integer, Ticket> map = new HashMap<>();
    static Map<String,Main> mainMap=new HashMap<>();
    String Team;
   static String AssignedTeam;
    String AssignedGroup;
   static String owner;
    public Main(String Team, String AssignedGroup) {
        this.Team= Team;
        this.AssignedGroup=AssignedGroup;
    }

    @Override
    public String toString() {
        return "Main{" +
                "Team='" + Team + '\'' +
                ", AssignedGroup='" + AssignedGroup + '\'' +
                '}';
    }

    public Main(){

    }



    static Random r=new Random();

    public static void main(String[] args) throws IOException {

        System.out.println("welcome");
        Main m1 = new Main();

        boolean b = true;
        while (b) {
            System.out.println("Print 1 for raise a ticket \nPrint 2 for check status of the ticket \nPrint 3 for exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Press 1 for IT \nPress 2 for HR \nPress 3 for Finance ");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("This is IT");
                            m1.storeTicketDetailsIT();
                            break;
                        case 2:
                            System.out.println("This is HR");
                            m1.storeTicketDetailsHR();
                            break;
                        case 3:
                            System.out.println("This is Finance");
                            m1.storeTicketDetailsFinance();
                            break;

                    }

                    break;

                case 2:
                    System.out.println("Enter TID");
                    int ticket_id = sc.nextInt();
                    Ticket obj=map.get(ticket_id);
                    System.out.println("Ticket id: "+obj.ticketNumber+" Raised by "+obj.name+" and the team working on the "+obj.issue +" and the assigned team is "+ obj.AssignedTeam+" ticket owner "+owner+" severity "+r.nextInt(5));
                    break;

                case 3:
                    b = false;
            }
        }
    }

    private static void storeTicketDetailsIT() throws IOException {

        System.out.println("Raising a ticket");
        System.out.print("Enter Employee id : ");
        Scanner sc=new Scanner(System.in);
        String eid = sc.next();
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Enter Issue Description : ");
        String issue = sc.next();
        int ticketNumber = new Random().nextInt(100);

        Main obj = new Main();
        obj.ExcelDetails();
        List<String> ITTeam=new ArrayList<>();
        for (Map.Entry<String, Main> m: mainMap.entrySet()){
            Main value = m.getValue();
            String TeamValue = value.Team;
            if(TeamValue.equals("IT")){
                ITTeam.add(m.getKey());
                AssignedTeam =m.getValue().AssignedGroup;

            }
        }
      //  System.out.println(AssignedTeam);

        owner=ITTeam.get(r.nextInt(3));
        Ticket t1=new Ticket(eid,name,issue,ticketNumber,AssignedTeam,owner);
        map.put(t1.ticketNumber,t1);
        System.out.println("Hello "+t1.name+" the ticket is raised and the ticket number is "+t1.ticketNumber);

    }
    private static void storeTicketDetailsHR() throws IOException {

        System.out.println("Raising a ticket");
        System.out.print("Enter Employee id : ");
        Scanner sc=new Scanner(System.in);
        String eid = sc.next();
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Enter Issue Description : ");
        String issue = sc.next();
        int ticketNumber = new Random().nextInt(100);

        Main obj = new Main();
        obj.ExcelDetails();
        List<String> HRTeam=new ArrayList<>();
        for (Map.Entry<String, Main> m: mainMap.entrySet()){
            Main value = m.getValue();
            String TeamValue = value.Team;
            if(TeamValue.equals("HR")){
                HRTeam.add(m.getKey());
                AssignedTeam =m.getValue().AssignedGroup;

            }
        }
        owner=HRTeam.get(r.nextInt(3));
        Ticket t1=new Ticket(eid,name,issue,ticketNumber,AssignedTeam,owner);
        map.put(t1.ticketNumber,t1);
        System.out.println("Hello "+t1.name+" the ticket is raised and the ticket number is "+t1.ticketNumber);

    }
    private static void storeTicketDetailsFinance() throws IOException {

        System.out.println("Raising a ticket");
        System.out.print("Enter Employee id : ");
        Scanner sc=new Scanner(System.in);
        String eid = sc.next();
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("Enter Issue Description : ");
        String issue = sc.next();
        int ticketNumber = new Random().nextInt(100);

        Main obj = new Main();
        obj.ExcelDetails();
        List<String> FinanceTeam=new ArrayList<>();
        for (Map.Entry<String, Main> m: mainMap.entrySet()){
            Main value = m.getValue();
            String TeamValue = value.Team;
            if(TeamValue.equals("Finance")){
                FinanceTeam.add(m.getKey());
                AssignedTeam =m.getValue().AssignedGroup;

            }
        }
        owner=FinanceTeam.get(r.nextInt(3));
        Ticket t1=new Ticket(eid,name,issue,ticketNumber,AssignedTeam,owner);
        map.put(t1.ticketNumber,t1);
        System.out.println("Hello "+t1.name+" the ticket is raised and the ticket number is "+t1.ticketNumber);

    }
    private void ExcelDetails() throws IOException {
        FileInputStream fis = new FileInputStream(new File("/home/amantya/Documents/Assessment/Pre-Table-1.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet("Sheet1");
        XSSFRow row;
        Map<String, String> teamDetails = new HashMap<>();
        String name, department;
        for (int i = 2; i< sh.getLastRowNum()+1; i++){
            row = sh.getRow(i);
            name = row.getCell(1).getStringCellValue();
            int cellNum = row.getLastCellNum();
            for(int j=2; j<cellNum;j++){
                department = row.getCell(j).getStringCellValue();
                teamDetails.put(name,department);
            }
        }

        FileInputStream fis2 = new FileInputStream(new File("/home/amantya/Documents/Assessment/Pre-Table-2.xlsx"));
        XSSFWorkbook wb2 = new XSSFWorkbook(fis2);
        XSSFSheet sh2 = wb2.getSheet("Sheet1");
        XSSFRow row2;
        Map<String, String> teamDetails2 = new HashMap<>();
        String name2, Assigned_grp;
        for (int i = 2; i< sh2.getLastRowNum()+1; i++){
            row2 = sh2.getRow(i);
            name2 = row2.getCell(1).getStringCellValue();
            int cellNum2 = row2.getLastCellNum();
            for(int j=2; j<cellNum2;j++){
                Assigned_grp = row2.getCell(j).getStringCellValue();
                teamDetails2.put(name2,Assigned_grp);
            }
        }
        for (Map.Entry<String, String> map5: teamDetails.entrySet() ) {
           mainMap.put(map5.getKey(),new Main(map5.getValue(),teamDetails2.get(map5.getKey())));

        }
        //System.out.println(mainMap.toString());

    }
}