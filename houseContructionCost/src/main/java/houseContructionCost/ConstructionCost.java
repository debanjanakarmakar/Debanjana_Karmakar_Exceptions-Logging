package houseContructionCost;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class ConstructionCost implements ActionListener{
	View v;
	private static final Logger l=LogManager.getLogger();
	ConstructionCost(View v)
	{
		this.v=v;
		this.v.CalculateaddActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand()=="Calculate Cost")
			{
				l.info("Calculatio start");
				int material=v.getMaterial();
				double area=v.getArea();
				double cost=0;
				if(material==0)
				{
					cost=1200;
				}
				else if(material==1)
				{
					cost=1500;
				}
				else if(material==2)
				{
					cost=1800;
				}
				else
				{
					cost=2500;
				}
				cost*=area;
				
				v.setCost(cost);
				l.info("Calculation End");
			}
			
		
		
	}


}
