package mainPackage;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Main {

    private static  ArrayList<Planeta> planets = new ArrayList();
    private static ArrayList<Alien> aliens = new ArrayList();
    public static MainScreen MainScreen = new MainScreen();
    private static ArrayList<Raza> razas = new ArrayList();
    
    public static void main(String[] args) {
        
        init();
    }

    public static void init(){
        
        Planeta marte = new Planeta("Marte",false,-20,300);
        Planeta tierra = new Planeta("Tierra",true,50,200);
        
        addPlanet(marte);
        addPlanet(tierra);
        
        MainScreen.updatePlanetComboBoxes();
        
        MainScreen.setVisible(true);
    }
    
   //--------------------------------------------------------------------------- 

    public static Planeta getPlanetByName(String name){
        for (Planeta planet : planets) {
            if(planet.getName().equals(name)){
                return planet;
            }
        }
        return null;
    }
    
    public static Raza getRaceByName(String name){
        for (Raza raza : razas) {
            if(raza.getName().equals(name)){
                return raza;
            }
        }
        return null;
    }
    
    public static boolean alienExists(String name){
        for (Alien alien : aliens) {
            if(alien.getName().equals(alien)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean raceExists(String name){
        for (Raza raza : razas) {
            if(raza.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean planetExists(String name){
        for (Planeta planet : planets) {
            if(planet.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public static String[] updatePlanets(){
        String[] planetNames = new String[Main.planets.size()];
        
        for (int i = 0; i < Main.planets.size(); i++) {
            planetNames[i] = Main.planets.get(i).getName();
        }
        return planetNames;
    }

    public static ArrayList<Raza> getRazas() {
        return razas;
    }

    public static void setRazas(ArrayList<Raza> razas) {
        Main.razas = razas;
    }
    
    public static ArrayList<Planeta> getPlanets() {
        return planets;
    }

    public static void setPlanets(ArrayList<Planeta> planets) {
        Main.planets = planets;
    }

    public static ArrayList<Alien> getAliens() {
        return aliens;
    }

    public static void setAliens(ArrayList<Alien> aliens) {
        Main.aliens = aliens;
    }
    
    public static void addPlanet(Planeta planet){
       
        MainScreen.availablePlanetsListModel.addElement(planet.getName());
        MainScreen.pathfinderAvailablePlanetsListModel.addElement(planet.getName());;
        MainScreen.explorerAvailablePlanets.setModel(MainScreen.availablePlanetsListModel);        
        MainScreen.pathfinderAvailablePlanets.setModel(MainScreen.availablePlanetsListModel);
        Main.planets.add(planet);
        
    }
    
    public static void addAlien(Alien alien){
        Main.aliens.add(alien);
    }
    
    
   public static void addRace(Raza race){
       Main.razas.add(race);
   }
 
    
    
}
