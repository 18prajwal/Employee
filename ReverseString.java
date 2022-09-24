public class ReverseString {
    public static void main(String[] args) {

        String doj = "zyxwvutsr";
        for (int i = doj.length(); i > 0; i--) {

            char a = doj.charAt(i - 1);

            System.out.print(a);
        }

    }
}
