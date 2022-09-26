import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {

    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hi, Choose  one of the below");
            System.out.println(" 1.Enter mail \n 2.Enter id \n 3.Enter phone \n 4.Enter Add\n 5.Exit");
            String s = sc.next();
            String reg_email = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
            String reg_id = "^AMT+[0-9]+$";
            String reg_ph = "^[+]91[0-9]{10}|[0-9]{10}+$";
            String reg_add = "^[A-Za-z,0-9\\s]+\\s[1-9][0-9]{5}$";


            switch (s) {
                case "1":
                    System.out.println("please enter mail");
                    String e = sc.next();
                    if (e.matches(reg_email)) {
                        System.out.println("entered mail id is valid");
                    } else {
                        System.out.println("entered mail is not valid");
                    }
                    break;
                case "2":
                    System.out.println("please enter employee id");
                    String id = sc.next();
                    if (id.matches(reg_id)) {
                        System.out.println("entered id is valid");
                    } else {
                        System.out.println("entered id is wrong");
                    }
                    break;
                case "3":
                    System.out.println("please enter phone number");
                    String ph = sc.next();
                    if (ph.matches(reg_ph)) {
                        System.out.println("enter ph no is correct");
                    } else {
                        System.out.println("entered ph no is wrong");
                    }
                    break;
                case "4": {
                    System.out.println("please enter address");
                    Scanner sc1 = new Scanner(System.in);
                    String add = sc1.nextLine();
                    if (add.matches(reg_add)) {
                        System.out.println("Entered address is correct");
                    } else {
                        System.out.println("please enter crct address");
                    }
                }
                break;

                default: {
                    System.out.println("choose any 1 from 4");
                }
                case "5": i=0;
                break;

            }

        }
    }
}


