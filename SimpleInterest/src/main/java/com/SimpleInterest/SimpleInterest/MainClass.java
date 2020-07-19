package com.SimpleInterest.SimpleInterest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MainClass {
	
	private static final Logger l=LogManager.getLogger(MainClass.class);
	
	public static void main(String args[])
	{
		
	l.info("Creating View Class object");
	View view=new View();
	l.info("Creating Model Class object");
	Model m=new Model();
	l.info("Creating Controller Class object");
	Controller c=new Controller(view,m);
	view.setVisible(true);
}
}