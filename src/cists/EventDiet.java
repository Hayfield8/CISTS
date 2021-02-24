package cists;
 
import java.io.Serializable;

/**
 *
 * EventDiet objects represents details about the user's dietary details during the event.
 *
 * @author MJ Hayfield
 * @since 20-05-2020
 * @version 1.0
 */
public class EventDiet implements Serializable {
    
    /**
     * Whether the user had eaten before the event began.
     */
    boolean eatenBefore = false;
    
    /**
     * What the user had eaten before the event began.
     */
    String eatenWhat = "";
    
    /**
     * Whether the user had drunk alcohol before the event.
     */
    boolean drunkAlcohol = false; 
    
    /**
     * What alcohol the user had drunk before the event.
     */
    String drunkWhat = "";
    
    /**
     * Whether the user was hung-over when the event began.
     */
    boolean hungover = false;
    
    /**
     * Initialises a new instance of a EventDiet class with the given details.
     * 
     * @param aEatenBefore whether the user had eaten
     * @param aEatenWhat what the user had eaten
     * @param aDrunkAlcohol whether the user drunk alcohol
     * @param aDrunkWhat what alcohol the user drunk
     * @param aHungover whether the user was hung-over
     */
    
    public EventDiet (boolean aEatenBefore, String aEatenWhat, boolean aDrunkAlcohol,
    String aDrunkWhat, boolean aHungover){
        
        eatenBefore = aEatenBefore;
        eatenWhat = aEatenWhat;
        drunkAlcohol = aDrunkAlcohol;
        drunkWhat = aDrunkWhat;
        hungover = aHungover;
        
        System.out.println("Vomit created successfully");
        
    }
    
    //Getters
    
    
    /**
     * Returns whether the user had eaten before the event.
     * @return eatenBefore
     */
    public boolean getEatenBefore(){
        return this.eatenBefore;
    }
    
    /**
     * Returns what the user had eaten before the event.
     * @return eatenWhat
     */
    public String getEatenWhat() {
        return this.eatenWhat;
    }
    
    /**
     * Returns whether the user had drunk alcohol before the event.
     * @return drunkAlcohol
     */
    public boolean getDrunkAlcohol(){
        return this.drunkAlcohol;
    }
    
    /**
     * Returns what the user had drunk before the event.
     * @return drunkWhat
     */
    public String getDrunkWhat(){
        return this.drunkWhat;
    }
    
    /**
     * Returns whether the user was hung-over when the event began.
     * @return hungover
     */
    public boolean getHungover(){
        return this.hungover;
    }
    
    //setters
    
    
    /**
     * Sets whether the user has eaten before the event began with the answer provided.
     * @param aEatenBefore whether they had eaten before the event
     */
    public void setEatenBefore(boolean aEatenBefore){
        this.eatenBefore = aEatenBefore;
    }
    
    /**
     * Sets what the user had eaten before the event with the string provided.
     * @param aEatenWhat what was eaten before the event began
     */
    public void setEatenWhat(String aEatenWhat){
        this.eatenWhat = aEatenWhat;
    }
    
    /**
     * 
     * Sets whether the user had drunk alcohol before the event with the answer 
     * provided.
     * @param aDrunkAlcohol whether alcohol was drunk before the event or not
     */
    public void setDrunkAlcohol(boolean aDrunkAlcohol){
        this.drunkAlcohol = aDrunkAlcohol;
    }
    
    /**
     * Sets what alcohol the user had drunk before the event with the string
     * provided.
     * @param aDrunkWhat what the user drunk before the event 
     */
    public void setDrunkWhat(String aDrunkWhat){
        this.drunkWhat = aDrunkWhat;
    }
    
    /**
     * Sets whether the user was hung-over or not when the event began with the
     * answer provided.
     * @param aHungover whether the user was hung-over during the event 
     */
    public void setHungover(boolean aHungover){
        this.hungover = aHungover;
    }
    
    
    
    
}
