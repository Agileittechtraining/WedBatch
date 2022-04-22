package reusability;

public class Methods {
static int p;//static global variable
int q; //non static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Methods m = new Methods();
    m.printstatements(); //call with in a class
    m.q = 10;
    String str = inputprint(23);
    System.out.println("The value returned from i is"+str);
	}
    public void printstatements() { //defined method
	inputprint(12);
    System.out.println("This is from print method");
}
    public static String inputprint(int a) {
    	Methods m = new Methods();
    	m.printstatements();
    	System.out.println(a);
    	return "Hello how are you";
    }
}
