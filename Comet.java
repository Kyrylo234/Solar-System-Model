public class Comet extends OrbitingSolarObject{

    private double minInitialAngle;
    private double maxInitialAngle;
    private double initialAngle;

    public Comet(double inputDiameter, String inputColour, double inputDistance, double inputAngle, double inputVelcity){
        super(inputDiameter, inputColour, inputDistance, inputAngle, inputVelcity);
        minInitialAngle = inputAngle - 90;
        if(minInitialAngle<0){
            minInitialAngle= minInitialAngle+360;
        }
        maxInitialAngle = inputAngle + 90;
        if(maxInitialAngle > 360){
            maxInitialAngle = maxInitialAngle-360;
        }
        initialAngle = inputAngle;
    }

    public void elipticalOrbit(){
        incrementAngle();
        if(initialAngle <= getAngle() && maxInitialAngle >= getAngle()){
            changeDistance(1+getDistance());
        }else if(maxInitialAngle < getAngle() && getAngle() < 360){
            changeDistance(getDistance()-1);
        }
        System.out.println(getAngle());
        System.out.println(getDistance());
        
    }
}
