package com.SimpleInterest.SimpleInterest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{

		private View view;
		private Model model;

		public Controller(View view, Model model) {
			this.view = view;
			this.model = model;
			
			this.view.SIActionListener(this);
			this.view.CIActionListener(this);
			this.view.ClearActionListener(this);

		}

		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand()=="Simple Interest")
			{
				view.setSI(model.calculateSI(view.getP(), view.getR(), view.getT()));
			}
			else if(e.getActionCommand()=="Compound Interest")
			{
				view.setCI(model.calculateCI(view.getP(), view.getR(), view.getT(), view.getn()));
			}
			else if(e.getActionCommand()=="Clear")
			{
				view.setSI(0.0);
				view.setCI(0.0);
			}
		}
		
		
		
}
