package com.naver.myhome;

public class java_Homework_0603 {
		
	public boolean check_length(String zumin){
		return zumin.length() !=14 ? false : true;
	}
		public String pandan_gender(String zumin) {
			String z = zumin.substring(7,8);
			String result;
			
			if(z.equals("1") || z.equals("3")) {
				result = "����";
			}else if (z.equals("2") || z.equals("4")) { 
				result = "����";
			}else {
				result = "�ܱ���";
			}
			return result;
			}
		
		public String check_hyphen(String zumin) {
			String z = zumin.substring(7,8);
			if(z.equals("-")
			return true;
			else 
			return false;
			}
	
	}


