public class CustomClass {
    public static void main(String[] args) throws InvalidAgeException {
        int age=17;
        if(age<18){
            throw new InvalidAgeException("you are minor");
        }
        else{
            System.out.println("Age is valid");
        }
    }
}
