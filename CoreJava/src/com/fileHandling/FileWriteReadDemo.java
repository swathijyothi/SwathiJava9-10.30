package com.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriteReadDemo {
public static void main(String[] args) throws Exception {
	FileWriter f1=new FileWriter("t2.txt");
	String s1="this is file write demo";
	f1.write(s1);
	f1.flush();
	f1.close();
	FileReader f2=new FileReader("t2.txt");
int i;
while((i=f2.read())!=-1) {
	System.out.print((char)i);
}
}
}
