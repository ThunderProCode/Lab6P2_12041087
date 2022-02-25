package mainPackage;


public class Alien {
    
    private String name;
    private String raza;
    private int age;
    private boolean menace;

    public Alien(String name, String raza, int age, boolean menace) {
        this.name = name;
        this.raza = raza;
        this.age = age;
        this.menace = menace;
    }
    
    /**
     * Get the value of menace
     *
     * @return the value of menace
     */
    public boolean isMenace() {
        return menace;
    }

    /**
     * Set the value of menace
     *
     * @param menace new value of menace
     */
    public void setMenace(boolean menace) {
        this.menace = menace;
    }

    
    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }

    
    /**
     * Get the value of raza
     *
     * @return the value of raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Set the value of raza
     *
     * @param raza new value of raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
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
