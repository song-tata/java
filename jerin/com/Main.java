package com;

import com.manager.gg.Admin;

public class Main {

	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.adddummy();
		
//		admin.showLunch();
		
		admin.copyLunch();
		
		System.out.println("-".repeat(80));
		
		admin.setLunch();

	}

}
