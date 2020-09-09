package cists;

import java.io.Serializable;

/**
 *
 * Condition objects represent the user's physical and mental condition during
 * the event.
 *
 * @author MJ Hayfield
 * @since 20-05-2020
 * @version 1.0
 */
public class Condition implements Serializable {
    
    // attributes
    
    /**
     * Whether the user was anxious or not when the event began.
     */
    boolean anxious = false;
    
    /**
     * Enumeration of user's mood when the event started.
     */
    public enum Mood {
        happy,
        excited,
        sad,
        angry,
        normal,
        tired,
        grumpy,
        stressed,
        relaxed,
    }
    Mood mood;
    
    /**
     * Whether the user was ill before the event began.
     */
    boolean areYouIll = false;
    
    /**
     * What the user was ill with when the event began.
     */
    String illWithWhat = "";
    
    /**
     * Whether the user slept before the event began.
     */
    boolean slept = true;
    
    /**
     * The number of hours the user slept before the event began.
     */
    int hrsSlept = 0;
    
    /**
     * The medication which the user had taken before the event.
     */
    String medicationTaken = "";
    
    
    //constructor

    /**
     * Initialises a new instance of a Condition class with the given details.
     * 
     * @param aAnxious whether the user was anxious
     * @param aMood the user's mood
     * @param aAreYouIll whether the user was ill
     * @param aIllWithWhat what the user was ill with
     * @param aSlept whether the user slept
     * @param aHrsSlept hours user slept
     * @param aMedicationTaken medication taken by the user
     */
    public Condition(boolean aAnxious,Mood aMood, boolean aAreYouIll, String
    aIllWithWhat, boolean aSlept, int aHrsSlept, String aMedicationTaken) {
        anxious = aAnxious;
        mood = aMood;
        areYouIll = aAreYouIll;
        illWithWhat = aIllWithWhat;
        slept = aSlept;
        hrsSlept = aHrsSlept;
        medicationTaken = aMedicationTaken;
        
        System.out.println("Condition created successfully");
    
    }
    
    //getters
    
    /**
     * Returns whether the user was anxious at the events beginning.
     * @return anxious
     */
    public boolean getAnxious(){
        return this.anxious;
    }
    
    /**
     * Returns mood of the user when the event began.
     * @return mood
     */
    public Mood getMood(){
        return this.mood;
    }
    
    /**
     * Returns whether the user was ill when the event began.
     * @return areYouIll 
     */
    public boolean getAreYouIll(){
        return this.areYouIll;
    }
    
    /**
     * Returns what the user was ill with. 
     * @return illWithWhat
     */
    public String getIllWithWhat(){
        return this.illWithWhat;
    }
    
    /**
     * Returns whether the user slept before the event began.
     * @return slept
     */
    public boolean getSlept(){
        return this.slept;
    }
    
    /**
     * Returns number of hours slept before the event.
     * @return hrsSlept
     */
    public int getHrsSlept(){
        return this.hrsSlept;
    }
    
    /**
     * Returns the medication taken before the event.
     * @return medicationTaken
     */
    public String getMedicationTaken(){
        return this.medicationTaken;
    }
    
    //setters
    
    /**
     * Sets whether the user was anxious when the event began with the answer provided.
     * @param aAnxious whether the user was anxious at the event's beginning
     */
    public void setAnxious(boolean aAnxious){
        this.anxious = aAnxious;
    }
    
    /**
     * Sets what mood the user was when the event began with the answer provided.
     * @param aMood the user's mood at the start of the event
     */
    public void setMood(Mood aMood){
        this.mood = aMood;
    }
    
    /**
     * Sets whether the user was ill at all when the event began with the answer provided.
     * @param aAreYouIll whether they were ill at the start of the event
     */
    public void setAreYouIll(boolean aAreYouIll){
        this.areYouIll = aAreYouIll;
    }
    
    /**
     * Sets what the user was ill with with the string provided.
     * @param aIllWithWhat what the user was ill with
     */
    public void setIllWithWhat(String aIllWithWhat){
        this.illWithWhat = aIllWithWhat;
    }
    
    /**
     * Sets whether the user had slept before the event with the answer provided.
     * @param aSlept whether the user slept before the event
     */
    public void setSlept(boolean aSlept){
        this.slept = aSlept;
    }
    
    /**
     * Sets the number of hours slept before the event with the one provided.
     * @param aHrsSlept number of hours slept before event 
     */
    public void setHrsSlept(int aHrsSlept){
        this.hrsSlept = aHrsSlept;
    }
    
    /**
     * Set what medication the user had taken before the event with the string provided.
     * @param aMedicationTaken the medication taken before the event
     */
    public void setMedicationTaken(String aMedicationTaken){
        this.medicationTaken = aMedicationTaken;
    }
    
    
}
