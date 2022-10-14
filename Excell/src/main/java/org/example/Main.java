package org.example;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class MyThread1 extends Thread{


    public void run(){

        FileInputStream fis= null;
        try {
            fis = new FileInputStream(new File("/home/amantya/Documents/java excel/E1.xls"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        HSSFWorkbook wb= null;
        try {
            wb = new HSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        HSSFSheet sheet=wb.getSheetAt(0);

        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
        ConcurrentHashMap<Integer, Details> map=new ConcurrentHashMap<Integer, Details>();
        for (Row row:sheet) {
            ArrayList<String> rowList = new ArrayList<>();
            ArrayList<Double> rowListINT = new ArrayList<>();
            for (Cell cell:row) {
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        rowListINT.add(cell.getNumericCellValue());
                        // System.out.println(cell.getNumericCellValue()+ "\t\t\t");
                        break;

                    case Cell.CELL_TYPE_STRING:
                        rowList.add(cell.getStringCellValue());
                        break;
                }
            }
            //System.out.println(rowList);
            //System.out.println(rowListINT);
            if(rowList.contains("First Name")||rowList.isEmpty()||rowListINT.contains("1.0"))
            {
                continue;
            }
            /*System.out.println(rowList);
            System.out.println(rowListINT); */
            double id = rowListINT.get(2);
            double o = rowListINT.get(0);
            double age = rowListINT.get(1);

            String fName = rowList.get(0);
            String lName=rowList.get(1);
            String gender=rowList.get(2);
            String country=rowList.get(3);
            String date=rowList.get(4);

            Details obj = new Details((int) id, (int) o, (int) age,fName,lName,gender,country,date);
            map.put(obj.id, obj);
        }
        System.out.println(map);
    }
}


class MyThread2 extends Thread{
    public void run(){

        FileInputStream fis= null;
        try {
            fis = new FileInputStream(new File("/home/amantya/Documents/java excel/E2.xls"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        HSSFWorkbook wb= null;
        try {
            wb = new HSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        HSSFSheet sheet=wb.getSheetAt(0);

        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
        ConcurrentHashMap<Integer, Details> map1= new ConcurrentHashMap<>();
        for (Row row:sheet) {
            ArrayList<String> rowList2=new ArrayList<>();
            ArrayList<Double> rowListInt2=new ArrayList<>();
            for (Cell cell:row) {
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        rowListInt2.add(cell.getNumericCellValue());
                        //System.out.println(cell.getNumericCellValue()+"\t\t");
                        break;

                    case Cell.CELL_TYPE_STRING:
                        rowList2.add(cell.getStringCellValue());
                        //System.out.println(cell.getStringCellValue()+"\t\t");
                        break;
                }
            }
            if(rowList2.contains("First Name")||rowList2.isEmpty()||rowListInt2.contains("1.0"))
            {
                continue;
            }
            // System.out.println();
            //System.out.println(rowList2);
            // System.out.println(rowListInt2);

            double id = rowListInt2.get(2);
            double o = rowListInt2.get(0);
            double age = rowListInt2.get(1);

            String fName = rowList2.get(0);
            String lName=rowList2.get(1);
            String gender=rowList2.get(2);
            String country=rowList2.get(3);
            String date=rowList2.get(4);


            Details obj = new Details((int) id, (int) o, (int) age,fName,lName,gender,country,date);
            map1.put(obj.id, obj);
        }
        System.out.println(map1);
    }
}
class Details {
    int id,O,Age;
    String FirstName,LastName,Gender,Country,Date;

    public Details(int id, int o, int age, String firstName, String lastName, String gender, String country, String date) {
        this.id = id;
        O = o;
        Age = age;
        FirstName = firstName;
        LastName = lastName;
        Gender = gender;
        Country = country;
        Date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getO() {
        return O;
    }

    public void setO(int o) {
        O = o;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", O=" + O +
                ", Age=" + Age +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Country='" + Country + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}



public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        MyThread1 t1=new MyThread1();
        t1.start();
        t1.join();
        System.out.println("    next thread     ");
        MyThread2 t2= new MyThread2();
        t2.start();
    }
}