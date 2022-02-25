package mainPackage;

import java.util.ArrayList;

public class Main {

    ArrayList<Planeta> planets = new ArrayList();
    ArrayList<Alien> aliens = new ArrayList();
    
    public static MainScreen MainScreen = new MainScreen();
    
    public static void main(String[] args) {
        MainScreen.setVisible(true);
    }

   //--------------------------------------------------------------------------- 
    
    public ArrayList<Planeta> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planeta> planets) {
        this.planets = planets;
    }

    public ArrayList<Alien> getAliens() {
        return aliens;
    }

    public void setAliens(ArrayList<Alien> aliens) {
        this.aliens = aliens;
    }
    
    public void addPlanet(Planeta planet){
        this.planets.add(planet);
    }
    
    public void addAlien(Alien alien){
        this.aliens.add(alien);
    }
    
}
