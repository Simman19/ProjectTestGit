package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
public class CourseDetials {
	static File f;
	static File f1;
	private void methodOfFile() 
	{
		 f = new File("D:\\add\\sub\\div\\");
		/*boolean b = f.mkdir();
		System.out.println(b);
		boolean c = f.mkdirs();
		System.out.println(c);
		boolean fileobject = f.createNewFile();
		System.out.println(fileobject);
		boolean cr1 = f.canRead();
		System.out.println(cr1);
		boolean cr2 = f.canWrite();
		System.out.println(cr2);
		boolean hidden = f.isHidden();
		System.out.println(hidden);*/
		String[] list = f.list();
		
	//	for (String x : list) {
			//System.out.println(x);
		//}
		
		File[] listFiles = f.listFiles();  // give the Extract path location of the file  
		for (File d : listFiles) {
			System.out.println(d);
		}
		}
	
private void methodOfFileUtils() throws IOException 
{
	f= new File("D:\\add\\sub\\div\\java.txt");
	FileUtils.write(f, "This is Java file Class");
	FileUtils.write(f, "This Last class of java ", false);
	FileUtils.write(f, "/n This Is not a last calss ", true);
	List<String> readLines = FileUtils.readLines(f);
//	System.out.println(readlines);
	for (String x : readLines) {
		System.out.println(x);
	}
	
   f1= new File("D:\\add\\sub\\div\\sql.txt");
   boolean cnf = f1.createNewFile();
   System.out.println(cnf);
   FileUtils.copyFile(f, f1);
}	

   public void exereisePro2() throws IOException 
   {
    f= new File("D:\\add\\sub\\div\\java.txt");
    String java = FileUtils.readFileToString(f);
    boolean check = java.contains("java");
    System.out.println(check);
   }
	
	private void exereisePro10() 
	{
		f= new File("D:\\add\\sub\\div\\");
		String[] l = f.list();
		for (String filelist1 : l) {
			System.out.println(filelist1);
				}
		

	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		CourseDetials c = new CourseDetials();
	    c.methodOfFile();
	   // c.methodOfFileUtils();	  
	   //   c.exereisePro10();
		
	}
	private void branchsimman() {
		System.out.println(" Simman");

	}

	private void branchsimman1() {
		System.out.println(" Simman");

	}

	private void branchsimman2() {
		System.out.println(" Simman");

	}
	private void add() {
		// TODO Auto-generated method stub

	}

	
}
