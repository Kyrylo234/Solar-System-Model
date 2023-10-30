public class Satellite extends SolarObject{
    private double centreOfRotationDistance;
    private double centreOfRotationAngle;
    private double rotationalVelocity;
    public Satellite(double inputDiameter, String inputColour, double inputCentreOfRotationDistance, double inputCentreRotationAngle, double inputRotationalVelocity){
        super(inputDiameter, inputColour);
        centreOfRotationDistance = inputCentreOfRotationDistance;
        centreOfRotationAngle = inputCentreRotationAngle;
        rotationalVelocity = inputRotationalVelocity;
    }
}