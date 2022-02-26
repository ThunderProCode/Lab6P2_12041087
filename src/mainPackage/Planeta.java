
package mainPackage;

import java.util.ArrayList;


public class Planeta {
    
    private String name;
    private boolean water;    
    private int temp;
    ArrayList<Alien> aliens = new ArrayList();
    private int size;

    public Planeta(String name, boolean water, int temp, int size) {
        this.name = name;
        this.water = water;
        this.temp = temp;
        this.size = size;
    }
    
    /**
     * Get the value of size
     *
     * @return the value of size
     */
    public int getSize() {
        return size;
    }

    /**
     * Set the value of size
     *
     * @param size new value of size
     */
    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Alien> getAliens() {
        return aliens;
    }

    public void setAliens(ArrayList<Alien> aliens) {
        this.aliens = aliens;
    }
    
    /**
     * Get the value of temp
     *
     * @return the value of temp
     */
    public int getTemp() {
        return temp;
    }

    /**
     * Set the value of temp
     *
     * @param temp new value of temp
     */
    public void setTemp(int temp) {
        this.temp = temp;
    }

    
    /**
     * Get the value of water
     *
     * @return the value of water
     */
    public boolean isWater() {
        return water;
    }

    /**
     * Set the value of water
     *
     * @param water new value of water
     */
    public void setWater(boolean water) {
        this.water = water;
    }

    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void addAlien(Alien alien){
        this.aliens.add(alien);
    }

    @Override
    public String toString() {
        return "name=" + name;
    }
    
    
    
}
