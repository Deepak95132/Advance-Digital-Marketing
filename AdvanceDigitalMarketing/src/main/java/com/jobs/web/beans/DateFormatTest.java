package com.test;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String datePattern1 = "\\d{2}[-./]?\\d{2}[-./]?\\d{4}"; //assumation date must have 0 before the single date number
		String datePattern2= "\\d{4}[-./]?\\d{2}[-./]?\\d{2}";
		String date1 = "20/12/2000";

		String format="mm/dd/yyyy";
		String separator="";
		int firstNumberStart=0;
		int firstNumberEnd=2;
		int secondNumberStart=3;
		int secondNumberEnd=5;
		int firstNumberStart1=5;
		int firstNumberEnd1=7;
		int secondNumberStart1=8;
		int secondNumberEnd1=10;
		if(date1.length()==10) {
		 separator=date1.substring(2,3);
		}else if(date1.length()==8){
		 secondNumberStart=2;
		 secondNumberEnd=4;
		 firstNumberStart1=4;
		 firstNumberEnd1=6;
		 secondNumberStart1=6;
		 secondNumberEnd1=8;
		}
		if(date1.matches(datePattern1)){
			int first=Integer.parseInt(date1.substring(firstNumberStart,firstNumberEnd));
			int second=Integer.parseInt(date1.substring(secondNumberStart,secondNumberEnd));
			if(first>12) {
				format="dd"+separator+"mm"+separator+"yyyy";
			}else if(second>12) {
				format="mm"+separator+"dd"+separator+"yyyy";
			}else {
			 format="mm"+separator+"dd"+separator+"yyyy";
			}
		}else if(date1.matches(datePattern2)) {
			int first=Integer.parseInt(date1.substring(firstNumberStart1,firstNumberEnd1));
			int second=Integer.parseInt(date1.substring(secondNumberStart1,secondNumberEnd1));
			if(first>12) {
				format="yyyy"+separator+"dd"+separator+"mm";
			}else if(second>12) {
				format="yyyy"+separator+"mm"+separator+"dd";
			}else {
			 format="yyyy"+separator+"mm"+separator+"dd";
			}
			} 
		System.out.println(format);

	}

}
