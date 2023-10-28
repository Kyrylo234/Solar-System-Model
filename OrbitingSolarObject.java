public class OrbitingSolarObject extends SolarObject{
    /**
     * This is the Orbiting Solar object class
     * Which allows it to change it's angle (moves around the Sun)
     * @author Kyrylo Postupalenko
     */
    
    private double distance;
    private double angle;
    private double velocity;
    

    /**
     * Creates a new solar object that orbits the around something
     * @param inputDiameter The diameter of the circular solar object 
     * @param inputColour The colour of the solar object
     * @param inputDistance the objects distance away from the sun
     * @param inputAngle The angle in degrees around the sun (0 degrees is equal to 6 o'clock)
     * @param inputVelcity the speed at which the angle will change 
     * Velocity will be used to change the angle and so will need to equal objects movement in degrees per loop/function cycle
     */
    public OrbitingSolarObject(double inputDiameter, String inputColour, double inputDistance, double inputAngle, double inputVelcity){
        super(inputDiameter, inputColour); 
        distance = inputDistance; 
        angle = inputAngle; 
        velocity = inputVelcity;  
    }


    /**
     * Increments the objects angle
     * By adding velocity to the objects current angle in degrees
     */
    public void incrementAngle(){
        angle = angle + velocity;
        if(angle>=360){
            angle = angle - 360;
        }
    }

    public void changeDistance(double inputNum){
        distance = inputNum;
    }

    /**
     * Draws the solar object on the JFrame
     * Uses the SolarSystem class to draw
     */
    public void drawObject(SolarSystem inputSolarSystem){
        inputSolarSystem.drawSolarObject(distance, angle, getDiameter(), getColour());
    }


    /**
     * @return Returns the Solar objects distance from the centre
     */
    public double getDistance(){
        return distance;
    }

    /**
     * @return Returns the Solar objects angle around the centre
     * 0 degrees is equal to 6 o'clock
     */
    public double getAngle(){
        return angle;
    }
}