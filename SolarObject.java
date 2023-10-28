public class SolarObject{
    /**
     * This is the Solar object class
     * @author Kyrylo Postupalenko
     */
    private double diameter;
    private String colour;


   
    /**
	 * Creates a Solar object
	 * @param diameter the width/diameter of the circular of the solar object
	 * @param colour the colour the solar object is
	 */
    public SolarObject(double inputDiameter, String inputColour){ //Constructor
        diameter = inputDiameter;
        colour = inputColour; 
    }


    /**
	 * @return Returns the diameter of the solar object
	 */
    public double getDiameter(){
        return diameter; 
    }


    /**
	 * @return Returns the Colour of the solar object
	 */
    public String getColour(){
        return colour; 
    }
}