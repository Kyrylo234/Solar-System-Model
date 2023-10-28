public class Moon extends SolarObject{
    /**
     * This is the Moon class
     * @author Kyrylo Postupalenko
     */
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;
    private double rotationalVelocity;
    
    /**
     * Creates a new Moon
     * @param inputDiameter The diameter of the moon
     * @param inputColour The colour of the moon
     * @param inputCentreOfRotationDistance The distance away from the planet
     * @param inputCentreRotationAngle The angle of orbit around the planet
     */
    public Moon(double inputDiameter, String inputColour, double inputCentreOfRotationDistance, double inputCentreRotationAngle, double inputRotationalVelocity){
        super(inputDiameter, inputColour);
        centreOfRotationDistance = inputCentreOfRotationDistance;
        centreOfRotationAngle = inputCentreRotationAngle;
        rotationalVelocity = inputRotationalVelocity;
    }

    /**
     * Draws the moon orbiting the planet
     * USes draw solar object about because it needs to additionaly calculate the moons orbit around the planet and then draws it
     * @param inpuSolarSystem The solar system to be drawn on (JFrame)
     * @param inputDistance The plantes distance away from the Sun
     * @param inputAngle The planets angle around the Sun
     */
    public void drawObject(SolarSystem inpuSolarSystem, double inputDistance, double inputAngle){
        inpuSolarSystem.drawSolarObjectAbout(inputDistance, inputAngle, getDiameter(), getColour(), centreOfRotationDistance, centreOfRotationAngle);
    }


    public void incremnetCentreOfRotationAngle(){
        centreOfRotationAngle = centreOfRotationAngle + (2 * rotationalVelocity);
    }

    /**
     * 
     * @return Returns the distance away from the planet
     */
    public double getCentreOfRotationDistance(){
        return centreOfRotationDistance;
    }

    /**
     * 
     * @return Returns the angle around the planet in degrees
     */
    public double getCentreOfRotationAngle(){
        return centreOfRotationAngle;
    }
}