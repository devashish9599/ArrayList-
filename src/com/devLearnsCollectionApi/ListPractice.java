package com.devLearnsCollectionApi;
//
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//
public class ListPractice {
//
	public static void main(String[] args) throws IOException
	{
	//	
		ArrayList<Student> classList = new ArrayList<Student>();
		List<String> fileread = Files.readAllLines(Paths.get("f:\\details.txt"));
		//
		for(String ch: fileread) {
			Student data = new Student();
			String clmn[] = ch.split(",");
			data.setName(clmn[0]);
			data.setAge(Integer.parseInt(clmn[1]));
			data.setContactNO(clmn[2]);
			data.setMarks(Float.parseFloat(clmn[3]));
			classList.add(data);
			}
		extracted(classList);
		//
		for(Student student : classList) {
			//
			System.out.println(student);
		}
		//
		//
}

	private static void extracted(ArrayList<Student> classList) {
		Collections.sort(classList);
	}
}