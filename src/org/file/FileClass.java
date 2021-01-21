package org.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileClass {

	public static void main(String[] args) throws IOException {
//Single folder creation
		File f = new File("E:\\Devasena\\Deva");

		boolean dir = f.mkdir();

		System.out.println(dir);
		System.out.println(f.isDirectory());
//Nested folder creation
		File nested_folder = new File("E:\\Devasena\\dd\\san");
		boolean dirs = nested_folder.mkdirs();
		System.out.println(dirs);

		// creating a file
		File file = new File("E:\\Devasena\\word.txt");
		boolean NewFile = file.createNewFile();
		System.out.println(NewFile);

		// check can write on file
		boolean can_Write = file.canWrite();
		System.out.println(can_Write);
		// Writing on file
		FileUtils.write(file, "Hello");
		// overwriting on file
		FileUtils.write(file, "hiworld", true);

		// Reading the lines
		List<String> readLines = FileUtils.readLines(file);
		for (String ai : readLines) {
			
		System.out.println(ai);
		}
		// check can read on file;
		boolean can_Read = file.canRead();
		System.out.println(can_Read);
		// Execution
		boolean can_Execute = file.canExecute();
		System.out.println(can_Execute);

		// Check the driver folders list

		File folders_list = new File("E:\\");
		File[] lis = folders_list.listFiles();// (Method:listfiles)
		for (File list_Files : lis)
			System.out.println(list_Files);

		//without directory path
		String[] list = folders_list.list();
		for(String li:list) 
		{
		System.out.println(li);

	}

}
}