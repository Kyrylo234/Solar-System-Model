public class Sun extends SolarObject{
    /**
     * This is the Sun class
     * @author Kyrylo Postupalenko
     */
    private Planet[] planets;
    
    /**
     * Creates a new Sun
     * @param inputDiameter The diameter of the Sun
     * @param inputColour The colour of the Sun
     */
    public Sun(double inputDiameter, String inputColour){
        super(inputDiameter, inputColour);
    }

    /**
     * Draws the Sun in the middle of the JFrame
     * @param inputSolarSystem The Jframe that is used to draw the solar system
     * Uses SolarSystem class
     */
    public void drawObject(SolarSystem inputSolarSystem){
        inputSolarSystem.drawSolarObject(0, 0, getDiameter(), getColour());
    }

    /**
     * @param num the index of the array
     * @return Returns the planet from the array of planets using the index
     */
    public Planet getPlanets(int num){
        return planets[num];
    }
}