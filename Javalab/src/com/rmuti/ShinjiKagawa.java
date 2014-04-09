package com.rmuti;

public class ShinjiKagawa {
	private String name;
	private String position;
	private String friend[];
 public ShinjiKagawa() {
	 name = "ShinjiKagawa";
	 position = "Midfield";
	 friend = new String [] {"Darren Fletcher","Ryan Giggs","Michael Carrick"};
 }
 public ShinjiKagawa(int a) {
	 System.out.println("ShinjiKagawa Overloading 1");
 }
 public String getName(){
	 return name;
 }
 public String getPosition(){
	 return position;
 }
 public String[] getFriend(){
 return friend;
 }
}


 

