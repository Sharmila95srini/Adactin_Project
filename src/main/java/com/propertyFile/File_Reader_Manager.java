package com.propertyFile;

public class File_Reader_Manager {
	
	public static File_Reader_Manager getFRM() {
		File_Reader_Manager frm=new File_Reader_Manager();
		return frm;
		
	}
	
	public  Configuration_Reader getCR() throws Throwable{
		
		Configuration_Reader cr=new Configuration_Reader();
		return cr;
		
		}
	
	

}
