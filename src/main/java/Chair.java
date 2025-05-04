/**
 * This Chair class allows users to access the legs and materials of the Chair
 * @author Lily You
 * @version 4
 */

public class Chair {
    private int legs;
    private String material;

    /**
     * Intializes the values of the variables legs and materials
     * @param legs int - the numbers of legs the chair has
     * @param material String - the material of the chair
     */
    public Chair(int legs, String material){
        this.legs = legs;
        this.material = material;
    }

    /**
     * Constructs a Chair object with legs as 4 and material as wood
     */
    public Chair(){
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * Constructs a Chair object with the variable legs and material as wood
     * @param legs int - the number of legs the chair has
     */
    public Chair(int legs){
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * Returns how many legs the chair has
     * @return the number of legs the chair has as an int
     */
    public int getLegs(){
        return this.legs;
    }

    /**
     * Returns the material of the chair
     * @return the material of the chair as a string
     */
    public String getMaterial(){
        return this.material;
    }
}
