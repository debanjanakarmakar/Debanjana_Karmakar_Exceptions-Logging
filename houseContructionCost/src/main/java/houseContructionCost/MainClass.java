package houseContructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass {

	private static final Logger l=LogManager.getLogger(MainClass.class); 
    public static void main(String[] args) {
    	
        try {
    	View viewObject=new View();
        
        ConstructionCost c=new ConstructionCost(viewObject);
        viewObject.setVisible(true);
       
        }
        catch(Exception e)
        {
        	l.error("Error Occured\n"+e);
        	e.printStackTrace();
        }
    }

}
