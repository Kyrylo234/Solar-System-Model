public class Planet extends OrbitingSolarObject{
    /**
     * This is the Planet class
     * @author Kyrylo Postupalenko
     */
    private int numberOfMoons;
    private Moon[] moons;

    /**
     * Creates a new Planet that orbits the around the sun
     * @param inputDiameter The diameter of the circular solar object 
     * @param inputColour The colour of the solar object
     * @param inputDistance the objects distance away from the sun
     * @param inputAngle The angle in degrees around the sun (0 degrees is equal to 6 o'clock)
     * @param inputVelcity the speed at which the angle will change 
     * @param numberOfMoons Sets the number of moons the planet has to 0
     * Velocity will be used to change the angle and so will need to equal objects movement in degrees per loop/function cycle
     */
    public Planet(double inputDiameter, String inputColour, double inputDistance, double inputAngle, double inputVelcity){
        super(inputDiameter, inputColour, inputDistance, inputAngle, inputVelcity);
        numberOfMoons = 0;
    }

    /**
     * Creates an array for all the moons of a planet
     * @param inputArraySize The size that the array will be
     */
    public void setMoonArray(int inputArraySize){
        moons = new Moon[inputArraySize];
    }

    /**
     * Adds the moon to the planets array of moons
     * @param inputMoon the Moon class to be added to the array
     */
    public void addMoonToArray(Moon inputMoon){
        if(moons.length <= (numberOfMoons+1)){
            moons[numberOfMoons] = inputMoon;
            numberOfMoons++; 
        }
        else{
            System.out.println("Error array too small");//if something goes wrong
        }
        
    }

    /**
     * Draws the Planet and
     * if the planet has any monns draws them too
     * @param inputSolarSystem the solar system on which the objects are drawn on (JFrame)
     */
    public void drawEverything(SolarSystem inputSolarSystem){
        drawObject(inputSolarSystem);
        if(numberOfMoons>0){
            for(int i = 0; i < moons.length; i++){
                moons[i].drawObject(inputSolarSystem, getDistance(), getAngle());
            }
        }
    }

    public void incrementEverything(){
        incrementAngle();
        if(numberOfMoons>0){
            for(int i = 0; i < moons.length; i++){
                moons[i].incremnetCentreOfRotationAngle();
            }
        }
    }

    /**
     * 
     * @param num the index of the array
     * @return Returns the Moon from the array of moons using the index
     */
    public Moon getMoons(int num){
        return moons[num];
    }
}