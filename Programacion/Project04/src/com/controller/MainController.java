package com.controller;

import java.util.Scanner;

import com.model.modelDatabase;
import com.view.IMainView;

	public class MainController {
	
		private IMainView mainView;
		private modelDatabase database;

		
		public MainController() {
			this.mainView = new MainTerminalView();
			this.database = new modelDatabase();
			
			
		}
		
		public void run() {
			int option;
			
			do {
				option = mainView.mainMenu();
			}
		}

		
	
	
}
