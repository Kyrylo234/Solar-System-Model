public class Driver{
    /**
     * This is the driver/main that runs the solar system model
     * @author Kyrylo Postupalenko
     */
    public static void main(String[] args){
        int suns = 1;
        int planets = 8;
        int moons = 4;
        int asteroids = 900;
        SolarSystem solarSystem1 = new SolarSystem(1000, 1000);

        //Cretaes the collection of objects that are in the solar system
        Collection collection = new Collection(suns, planets, moons, asteroids);


        Sun sun1 = new Sun(40,"YELLOW");
        collection.addSun(sun1);


        //Creates the 8 planets
        Planet mercury = new Planet(10, "DARK_GREY", 50, 300, (1/0.24));
        collection.addPlanet(mercury);
        Planet venus = new Planet(13, "ORANGE", 70, 30, (1/0.62));
        collection.addPlanet(venus);
        Planet earth = new Planet(15, "GREEN", 90, 0, (1/1));
        collection.addPlanet(earth);
        Planet mars = new Planet(12, "RED", 110, 270, (1/1.88));
        collection.addPlanet(mars);
        Planet jupiter = new Planet(30, "ORANGE", 170, 160, (1/11.86));
        collection.addPlanet(jupiter);
        Planet saturn = new Planet(23, "DARK_GREY", 210, 180, (1/29.46));
        collection.addPlanet(saturn);
        Planet uranus = new Planet(25, "DARK_GREY", 250, 90, (1/84.01));
        collection.addPlanet(uranus);
        Planet neptune = new Planet(10, "CYAN", 290, 280, (1/164.79));
        collection.addPlanet(neptune);

        Moon moon = new Moon(3, "White", 15, 0, 1);
        collection.addMoon(moon);

        Moon moon2 = new Moon(3, "White", 25, 0, 1);
        collection.addMoon(moon2);
        Moon moon3 = new Moon(3, "White", 25, 90, 1);
        collection.addMoon(moon3);

        Moon moon4 = new Moon(3, "White", 25, 180, 1);
        collection.addMoon(moon4);




        earth.setMoonArray(1);
        earth.addMoonToArray(moon);

        jupiter.setMoonArray(3);
        jupiter.addMoonToArray(moon2);
        jupiter.addMoonToArray(moon3);
        jupiter.addMoonToArray(moon4);

        for(int i = 0; i<(asteroids/2); i++){
            collection.addAsteroid(new Asteroid(1, "White", (Math.random() * (140 - 120)) + 120, (i), 1));
        }
        for(int i = (asteroids/2); i<asteroids; i++){
            collection.addAsteroid(new Asteroid(1, "White", (Math.random() * ((saturn.getDistance()+10) - (saturn.getDistance()-20)) + (saturn.getDistance()-20)), (i), 1));
        }

        Comet comer1 = new Comet(10,"WHITE", 250, 0, 1);

        while(true){
            collection.getSun(0).drawObject(solarSystem1);

            for(int i = 0; i < collection.getPlanetsAmount(); i++){
                collection.getPlanet(i).drawEverything(solarSystem1);
                collection.getPlanet(i).incrementEverything();
            }
            for(int i = 0; i< collection.getAsteroidAmount(); i++){
                collection.getAsteroid(i).drawObject(solarSystem1);
                collection.getAsteroid(i).incrementAngle();
            }

            comer1.drawObject(solarSystem1);
            comer1.elipticalOrbit();

            solarSystem1.finishedDrawing();
        }
    }
}