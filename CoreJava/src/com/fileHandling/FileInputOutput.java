package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {
	public static void main(String[] args) throws IOException {
		FileOutputStream f1=new FileOutputStream("t1.txt");
		String s1="this is fileinput output demo";
		byte[] b=s1.getBytes();
		f1.write(b);
		f1.flush();
		f1.close();
		FileInputStream f2=new FileInputStream("t1.txt");
		int i;
		while((i=f2.read())!=0) {
			System.out.print((char)i);
		}
		
	}

}
