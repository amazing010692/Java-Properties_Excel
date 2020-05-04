package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFilereading_writing {

	public static void main(String[] args) throws IOException {
		
		/*//create a file
		File file = new File(System.getProperty("user.dir") + "\\src\\test.txt");
		file.createNewFile();
		
		//write inside a file
		FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\src\\test.txt");
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("Please write inside this file");
		writer.newLine();
		writer.write("This is my second line");
		writer.flush();*/
		
		//read from a file
		FileReader fr = new FileReader(System.getProperty("user.dir") + "\\src\\test.txt");
		BufferedReader reader = new BufferedReader(fr);
		
		/*System.out.println(reader.readLine());
		System.out.println(reader.readLine());
		System.out.println(reader.readLine());*/
		
		String i = "";
		while((i = reader.readLine()) != null) {
			
			System.out.println(i);
		}

	}

}
