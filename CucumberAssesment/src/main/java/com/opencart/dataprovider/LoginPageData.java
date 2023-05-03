package com.opencart.dataprovider;



public class LoginPageData {
	private static String number;
	private static String password;
	private static String user2;
	private static String password2;
	
	public LoginPageData(){
		ReadExcelFile file;
		try{
			file=new ReadExcelFile();
			Object[][] data=file.ReadDataInExcelFile("C:\\selenium\\xlfiles", "LoginData.xlsx", "sheet1");
			number=data[1][0].toString();
			password=data[1][1].toString();
			user2=data[2][0].toString();
			password2=data[2][1].toString();
			//to get String representation of an object
//			System.out.println(number);
//			System.out.println(password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public String getNum(){
		return number;
	}
	public String getpass(){
		return password;
	}
	public String getUser2() {
		return user2;
	}
	public String getUserPassword() {
		return password2;
	}


}
