package com.SimpleInterest.SimpleInterest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Model {
	
	private static final Logger l=LogManager.getLogger(Model.class);
	public double calculateSI(double p,double r,double t)
	{
		l.info("Calculating SI");
		return ((p*r*t)/100);
	}
	
	public double calculateCI(double p,double r,double t,int n)
	{
		l.info("Calculating CI");
		double a=p*Math.pow((1+(r/(n*100))),(n*t));
		return (a-p);
	}
}

