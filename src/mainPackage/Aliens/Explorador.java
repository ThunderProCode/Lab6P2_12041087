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
public class Explorador extends Alien {
    
    private ArrayList<Planeta> exploredPlanets = new ArrayList();
    private Planeta favoritePlanet;

    public Explorador(Planeta favoritePlanet, String name, Raza raza, int age, boolean menace) {
        super(name, raza, age, menace);
        this.favoritePlanet = favoritePlanet;
    }
}
