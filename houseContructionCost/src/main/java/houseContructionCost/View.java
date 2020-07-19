package houseContructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.awt.Button;
import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame{

	/**
	 * 
	 */
	
	private static final Logger l=LogManager.getLogger(View.class);
	private static final long serialVersionUID = 2105513806562365829L;
	private JTextField area=new JTextField(20);
	private JTextField TotalCost=new JTextField(20);
    private JLabel  areaLabel=new JLabel("Enter total area of house");
    private JLabel TotalCostLabel=new JLabel("Total cost");
	JLabel Material=new JLabel("Enter material standard");
	private Button Calculate=new Button("Calculate Cost");

	private Choice c=new Choice();
	
	View()
	{
		JPanel p=new JPanel();
		this.setSize(600, 300);
		p.setLayout(new GridLayout(10,2));
		
		c.add("Standard Material(1200)");
		c.add("Above standard Material(1500)");
		c.add("High Standard Material(1800)");
		c.add("High Stadard Material(2500)");
		
		p.add(areaLabel);
		p.add(area);
		p.add(Material);
		p.add(c);
		p.add(Calculate);
		p.add(TotalCostLabel);
		p.add(TotalCost);
		this.add(p);
		
	}
	
	public double getArea()
	{
		l.info("getarea");
		return Double.parseDouble(area.getText());
		
	}
	
	public int getMaterial()
	{
		l.info("get material");
		return c.getSelectedIndex();
	}
	public void setCost(double c)
	{
		l.info("get total cost");
		TotalCost.setText(Double.toString(c));
	}
	
	public void CalculateaddActionListener(ActionListener a)
	{
		l.info("action listener for calculate");
		Calculate.addActionListener(a);
	}
	
}
