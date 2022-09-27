public class TryNestedTry {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        System.out.println("Statement 2");
        System.out.println("Statement 3");
	int[] arr=new int[5];
	try{
		try{
			System.out.println(arr[6]);
		}
		catch(Exception e){
			e.printStackTrace();
		}

		int j=20/0;
	
	}
	catch(Exception e){
	//	System.out.println("Arithmetic Exception");
		e.printStackTrace();
	}
	System.out.println("Statement 4");
	System.out.println("Statement 5");
    }
}
