package mainPackage;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import mainPackage.Aliens.Cazador;

public class Main {

    private static  ArrayList<Planeta> planets = new ArrayList();
    private static ArrayList<Alien> aliens = new ArrayList();
    public static MainScreen MainScreen = new MainScreen();
    public static EditScreen EditScreen = new EditScreen();
    public static Alien SelectedAlien;
    
    private static ArrayList<Raza> razas = new ArrayList();
    
    public static void main(String[] args) {
        
        init();
    }

    public static void init(){
        
        Planeta marte = new Planeta("Marte",false,-20,300);
        Planeta tierra = new Planeta("Tierra",true,50,200);
        
        addPlanet(marte);
        addPlanet(tierra);
        
        Raza newRace = new Raza(tierra,"Terricolas");
        Raza newRace1 = new Raza(marte,"Marsianos");

        razas.add(newRace);
        razas.add(newRace1);
        
        Cazador newCazador = new Cazador(10,"Hector",newRace,19,false);
        Cazador newCazador1 = new Cazador(10,"Rita",newRace1,17,true);

        aliens.add(newCazador1);
        aliens.add(newCazador);
        
        tierra.addAlien(newCazador);
        marte.addAlien(newCazador1);
        
        MainScreen.tree.setEditable(true);
        MainScreen.tree.setComponentPopupMenu( MainScreen.getPopUpMenu() );
        MainScreen.tree.addMouseListener( MainScreen.getMouseListener() );
        
        MainScreen.updatePlanetComboBoxes();
        MainScreen.updateRaceComboBoxes();
        
        MainScreen.setVisible(true);
    }
    
    public static void initEditScreen(Alien alien){
        EditScreen.jTextField1.setText(alien.getName());
        EditScreen.jSpinner1.setValue(alien.getAge());
        EditScreen.jCheckBox1.setSelected(alien.isMenace());
        EditScreen.jComboBox1.setSelectedItem(alien.getRaza().getName());
    }
    
   //--------------------------------------------------------------------------- 

    public static Alien getSelectedAlien() {
        return SelectedAlien;
    }

    public static void setSelectedAlien(Alien SelectedAlien) {
        Main.SelectedAlien = SelectedAlien;
    }

    
    
     public static Alien getAlienByName(String name){
        for (Alien alien : aliens) {
            if(alien.getName().equals(name)){
                return alien;
            }
        }
        return null;
    }
    
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
