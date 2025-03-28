package com.view;

import java.util.Scanner;

import com.model.AuthModel;

import utils.TerminalUtils;

public class AuthView {

	Scanner sc = new Scanner(System.in);
	private AuthModel authModel;
	
	public AuthView(AuthModel authModel) {
		this.authModel = authModel;
		
		TerminalUtils.output("Introduce tu Usuario");
		String userName = sc.nextLine();
		
		sc.nextLine();
		
		TerminalUtils.output("Introduce tu Usuario");
		String userPassword = sc.nextLine();

		
		
		
		
		
	}
}
