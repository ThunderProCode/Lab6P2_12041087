
package mainPackage;

/**
 *
 * @author ThunderKnight
 */
public class Raza {

   Planeta mainPlanet;   
    private String name;

    public Raza(Planeta mainPlanet, String name) {
        this.mainPlanet = mainPlanet;
        this.name = name;
    }

    public Planeta getMainPlanet() {
        return mainPlanet;
    }

    public void setMainPlanet(Planeta mainPlanet) {
        this.mainPlanet = mainPlanet;
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

    
}
