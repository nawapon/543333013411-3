package com.rmuti;

import java.util.Arrays;


public class CallShinjiKagawa {

	public static void main(String[] args) {
		ShinjiKagawa shinjiKagawa = new ShinjiKagawa();
		System.out.println("Name : "+shinjiKagawa.getName());
		System.out.println("Position : "+shinjiKagawa.getPosition());
		System.out.println("Friend : "+Arrays.toString(shinjiKagawa.getFriend()));
		shinjiKagawa = new ShinjiKagawa(1);
	}

}
