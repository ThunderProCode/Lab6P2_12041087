/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage.Aliens;

import java.util.ArrayList;
import mainPackage.Alien;
import mainPackage.Planeta;
import mainPackage.Raza;

/**
 *
 * @author ThunderKnight
 */
public class Conquistador extends Alien {
    
    ArrayList<Planeta> conqueredPlanets = new ArrayList();

    public Conquistador(String name, Raza raza, int age, boolean menace, ArrayList<Planeta> conqueredPlanets ) {
        super(name, raza, age, menace);
        this.conqueredPlanets = conqueredPlanets;
    }

    public ArrayList<Planeta> getConqueredPlanets() {
        return conqueredPlanets;
    }

    public void setConqueredPlanets(ArrayList<Planeta> conqueredPlanets) {
        this.conqueredPlanets = conqueredPlanets;
    }
    
    
    
}
