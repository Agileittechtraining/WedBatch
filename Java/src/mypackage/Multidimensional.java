package mypackage;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] a = new int[3][2]; 
a[0][0] = 30;
a[0][1] = 40;
a[1][0] = 20;
a[1][1] = 70;
a[2][0] = 110;
a[2][1] = 140;
System.out.println(a.length);//row length
System.out.println(a[1].length);//col length
for(int i =0;i<3;i++) {
	for(int j=0;j<2;j++) {
System.out.println(a[i][j]);
	}
}
}
}