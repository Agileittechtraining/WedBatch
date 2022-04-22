package mypackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Handlingioexceptions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

File f = new File("C:\\Fihandling\\Agileittech.txt");
f.createNewFile();
FileWriter fw = new FileWriter(f);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Hi\n");
bw.flush();
bw.write("Hello\n");
bw.flush();
bw.write("How are you");
bw.close(); //close the file
FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
System.out.println(br.readLine());
System.out.println(br.readLine());
System.out.println(br.readLine());
br.close(); //close the file

	}

}
