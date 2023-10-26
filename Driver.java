public class Driver{
    /**
     * This is the driver/main that runs the solar system model
     * @author Kyrylo Postupalenko
     */
    public static void main(String[] args){
        SolarSystem solarSystem1 = new SolarSystem(1000, 1000);
        Sun sun1 = new Sun(40,"YELLOW");
        Asteroid[] asteroidsArray = new Asteroid[900];

        Planet mercury = new Planet(10, "DARK_GREY", 50, 300, (1/0.24));
        Planet venus = new Planet(13, "ORANGE", 70, 30, (1/0.62));
        Planet earth = new Planet(15, "GREEN", 90, 0, (1/1));
        Planet mars = new Planet(12, "RED", 110, 270, (1/1.88));
        Planet jupiter = new Planet(30, "ORANGE", 170, 160, (1/11.86));
        Planet saturn = new Planet(23, "DARK_GREY", 210, 180, (1/29.46));
        Planet uranus = new Planet(25, "DARK_GREY", 250, 90, (1/84.01));
        Planet neptune = new Planet(10, "CYAN", 290, 280, (1/164.79));

        Moon moon = new Moon(3, "White", 15, 0, 1);
        earth.setMoonArray(1);
        earth.addMoonToArray(moon);

        for(int i = 0; i<(asteroidsArray.length); i++){
            asteroidsArray[i] = new Asteroid(1, "White", (Math.random() * (140 - 120)) + 120, (i), 1);
        }

        Comet comer1 = new Comet(10,"WHITE", 250, 0, 10);

        while(true){
            sun1.drawObject(solarSystem1);
            mercury.drawEverything(solarSystem1);
            mercury.incrementEverything();
            venus.drawEverything(solarSystem1);
            venus.incrementEverything();
            earth.drawEverything(solarSystem1);
            earth.incrementEverything();
            mars.drawEverything(solarSystem1);
            mars.incrementEverything();
            jupiter.drawEverything(solarSystem1);
            jupiter.incrementEverything();
            saturn.drawEverything(solarSystem1);
            saturn.incrementEverything();
            uranus.drawEverything(solarSystem1);
            uranus.incrementEverything();
            neptune.drawEverything(solarSystem1);
            neptune.incrementEverything();
            for(int i = 0; i<(asteroidsArray.length); i++){
                asteroidsArray[i].drawObject(solarSystem1);
                asteroidsArray[i].incrementAngle();
            }
            comer1.drawObject(solarSystem1);
            comer1.elipticalOrbit();

            solarSystem1.finishedDrawing();
        }
    }
}