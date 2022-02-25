/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage.Aliens;

import mainPackage.Alien;
import mainPackage.Raza;

/**
 *
 * @author ThunderKnight
 */
public class Cazador extends Alien {
    
    int huntedHumans;

    public Cazador(int huntedHumans, String name, Raza raza, int age, boolean menace) {
        super(name, raza, age, menace);
        this.huntedHumans = huntedHumans;
    }
    
}
