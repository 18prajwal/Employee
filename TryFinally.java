public class TryFinally {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        System.out.println("Statement 2");
        System.out.println("Statement 3");
	try{
		int j=20/0;
		System.out.println(j);
	}
	catch(Exception e){
		System.out.println("Arithmetic Exception");
	}
	finally{
		System.out.println("Finally");
	}
	System.out.println("Statement 4");
	System.out.println("Statement 5");
    }
}
