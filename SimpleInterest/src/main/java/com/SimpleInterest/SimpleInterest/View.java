package com.SimpleInterest.SimpleInterest;

import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("serial")
public class View extends JFrame{
	private static final Logger l=LogManager.getLogger(Model.class);

	private JTextField  P=new JTextField(20);
	private JTextField  R=new JTextField(20);
	private JTextField  T=new JTextField(20);
	private JTextField  n=new JTextField(20);
	private JTextField SI=new JTextField(20);
	private JTextField CI=new JTextField(20);
	
	private Button siButton=new Button("Simple Interest");
	private Button ciButton=new Button("Compound Interest");
	
	private JLabel principal=new JLabel("Enter principal");
	private JLabel rateOfInterest=new JLabel("Enter rate of interest");
	private JLabel timePeriod=new JLabel("Enter time period");
	private JLabel noOfCompounding=new JLabel("Enter no. of times of compounding p.a.");
	private Button clear=new Button("Clear");
	
	
	View()
	{
		JPanel panel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);

		panel.setLayout(new GridLayout(10,2));
		
		panel.add(principal);
		panel.add(P);
		panel.add(rateOfInterest);
		panel.add(R);
		panel.add(timePeriod);
		panel.add(T);
		panel.add(noOfCompounding);
		panel.add(n);
		panel.add(siButton);
		panel.add(SI);
		panel.add(ciButton);
		panel.add(CI);
		panel.add(clear);
		
		this.add(panel);
	}
		
	public double getP()
	{
		return Double.parseDouble(P.getText());
		
	}
	public double getR()
	{
		return Double.parseDouble(R.getText());
	}
	
	public double getT()
	{
		return Double.parseDouble(T.getText());
	}
	public int getn()
	{
		return Integer.parseInt(n.getText());
	}
	public void setSI(double a)
	{
		SI.setText(Double.toString(a));
	}
	public void setCI(double a)
	{
		CI.setText(Double.toString(a));
	}
	
	public void SIActionListener(ActionListener al){
		
		l.info("SI calculation button clicked");
		siButton.addActionListener(al);

	}

	public void CIActionListener(ActionListener al){

		l.info("CI calculation button clicked");
		ciButton.addActionListener(al);

	}
	public void ClearActionListener(ActionListener al){

		l.info("Clear button clicked");
		clear.addActionListener(al);

	}
}
