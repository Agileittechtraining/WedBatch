package reusability;



public class Outsideclass {
int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outsideclass o1 = new Outsideclass();
Outsideclass o2 = new Outsideclass();
Outsideclass o3 = new Outsideclass();
o1.a = 10;
o2.a = 20;
o3.a = 30;
System.out.println("Before change"+o1.a);
System.out.println("Before change"+o2.a);
System.out.println("Before change"+o3.a);
o1=o2;
o2=o3;
o3=o1;
System.out.println("After change"+o1.a);
System.out.println("After change"+o2.a);
System.out.println("After change"+o3.a);


	}

}
