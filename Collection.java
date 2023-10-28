public class Collection {
    private Sun[] suns;
    private int sunSize=0;
    private Planet[] planets;
    private int planetSize=0;
    private Moon[] moons;
    private int moonsSize=0;
    private Asteroid[] asteroids;
    private int asteroidsSize = 0;

    public Collection(int numberOfSuns, int numberOfPlanets, int numberOfMoons, int numberOfAsteroids){
        suns = new Sun[numberOfSuns];
        planets = new Planet[numberOfPlanets];
        moons = new Moon[numberOfMoons];
        asteroids = new Asteroid[numberOfAsteroids];
    }

    public void addSun(Sun sun){
        suns[sunSize] = sun;
        sunSize++;
    }

    public void addPlanet(Planet planet){
        planets[planetSize] = planet;
        planetSize++;
    }

    public void addMoon(Moon moon){
        moons[moonsSize] = moon;
        moonsSize++;
    }

    public Sun getSun(int i){
        return suns[i];
    }
    public int getPlanetsAmount(){
        return planetSize;
    }
    public Planet getPlanet(int i){
        return planets[i];
    }


    public Moon getMoon(int i){
        return moons[i];
    }
    public int getMoonsAmount(){
        return moonsSize;
    }

    public Asteroid getAsteroid(int i){
        return asteroids[i];
    }
    public int getAsteroidAmount(){
        return asteroidsSize;
    }
    public void addAsteroid(Asteroid i){
        asteroids[asteroidsSize] = i;
        asteroidsSize++;
    }
}
