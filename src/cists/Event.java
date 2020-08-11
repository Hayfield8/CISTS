package cists;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Event objects represent a single CVS episode, each identifiable by date.
 *
 * @author MJ Hayfield
 * @since 20-07-2019
 * @version 1.0
 */
public class Event implements Serializable {
    
    // attributes
    
    /**
     * Enumeration of the period of day in which the event started.
     */
    public enum EventBeginTime {
        morning,
        afternoon,
        evening,
        lateNight,
        earlyMorning
    }
    EventBeginTime eventBeginTime;
    
    /**
     * Enumeration of the location in which the event started.
     */
    public enum Location {
        home,
        travelling,
        socialising,
        shopping,
        work,
        other
    }
    Location location;
    
    /**
     * The number of hours the event lasted.
     */
    int hoursLasted = 0;
    
    /**
     * The number of days the event lasted.
     */
    int daysLasted = 0;
    
    /**
     * The date when the event started.
     */
    Date date;
    
    /**
     * Any notes about the event. 
     */
    String notes = "";
    
    /**
     * Link to vomit object.
     * @see Vomit
     */
    CustomFields customFields;
    
    /**
     * Link to condition object.
     * @see Condition
     */
    Condition condition;
    
    /**
     * The number of Event objects created.
     */
    static int count = 0;
    
    /**
     * 
     * Initialises a new instance of a CvsEvent class with the given details and
     * the given Vomit and Condition objects.
     * 
     * @param aEventBeginTime the event begin time
     * @param aLocation the location the event began
     * @param aHoursLasted hours the event lasted
     * @param aCondition condition object
     * @param aNotes notes regarding the event
     * @param aCustomFields vomit object
     * @param aDaysLasted days the event lasted
     */
    
    public Event (EventBeginTime aEventBeginTime, Location aLocation, int 
    aHoursLasted, int aDaysLasted, String aNotes, CustomFields aCustomFields,
    Condition aCondition){
        
        eventBeginTime = aEventBeginTime;
        location = aLocation;
        hoursLasted = aHoursLasted;
        daysLasted = aDaysLasted;
        date = new Date();
        notes = aNotes;
        customFields = aCustomFields;
        condition = aCondition;
        count = count++;
        
        System.out.println("CvsEvent created successfully");
    }
    
//getters
    
    /**
     * Returns the time this event began.
     * @return eventBeginTime
     */
    public EventBeginTime getEventBeginTime(){
        return this.eventBeginTime;
    }
    
    /**
     * Returns the location this event began.
     * @return location
     */
    public Location getLocation(){
        return this.location;
    }
    
    /**
     * Returns the hours this event lasted.
     * @return hoursLasted
     */
    public int getHoursLasted(){
        return this.hoursLasted;
    }
    
    /**
     * Returns the number of days this event lasted.
     * @return daysLasted
     */
    public int getDaysLasted(){
        return this.daysLasted;
    }
    
    /**
     * Returns the notes regarding this event.
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }
    
    /**
     * Returns the vomit object linked to this event.
     * @return vomit
     */
    public CustomFields getCustomFields(){
        return this.customFields;
    }
    
    /**
     * Returns the condition object linked to this event.
     * @return condition
     */
    public Condition getCondition(){
        return this.condition;
    }
    
    /**
     * Returns the count of CvsEvents created at the time of this events creation.
     * @return count
     */
    public int getCount(){
        return Event.count;
    }
    
    /**
     * Returns the date when the event was created.
     * @return date
     */
    public Date getDate(){
        return this.date;
    }
    
//setters
    
    /**
     * Sets the events begin time to the one provided.
     * @param aEventBeginTime the event begin time
     */
    public void setEventBeginTime(EventBeginTime aEventBeginTime){
        this.eventBeginTime = aEventBeginTime;
    }
    
    /**
     * Sets the location where the event began with the one provided. 
     * @param aLocation the location the event began
     */
    public void setLocation(Location aLocation){
        this.location = aLocation;
    }
    
    /**
     * Sets the number of hours the event lasted with the one provided.
     * @param aHoursLasted hours the event lasted
     */
    public void setHoursLasted(int aHoursLasted){
        this.hoursLasted = aHoursLasted;
    }
    
    /**
     * Sets the number of days the event lasted with the one provided.
     * @param aDaysLasted number of days the event lasted 
     */
    public void setDaysLasted(int aDaysLasted){
        this.daysLasted = aDaysLasted;
    }
    
    /**
     * Sets the notes regarding the event with those provided.
     * @param aNotes notes regarding the event
     */
    public void setNotes(String aNotes){
        this.notes = aNotes;
    }
    
//vomit setters
    
    
    /**
     * Sets whether the user vomited during the event in the linked Vomit object
     * with the answer provided.
     * @param aVomited whether the user vomited or not
     */
     public void setVomitVomited(boolean aVomited){
        this.customFields.setVomited(aVomited);
    }
    
     /**
      * Sets the number of times the user vomited during the event in the linked Vomit object
      * with the number provided.
      * @param aNoOfVomit the number of times the user vomited
      */
    public void setVomitNoOfVomit(int aNoOfVomit){
        this.customFields.setNoOfVomit(aNoOfVomit);
    }
    
    /**
     * Sets whether the vomiting was violent or not in the linked Vomit object with 
     * the answer provided.
     * @param aViolent whether the vomited was violent or not
     */
    public void setVomitViolent(boolean aViolent){
        this.customFields.setViolent(aViolent);
    }
    
    /**
     * Sets whether the user has eaten before the event began in the linked Vomit object
     * with the answer provided.
     * @param aEatenBefore whether they had eaten before the event
     */
    public void setVomitEatenBefore(boolean aEatenBefore){
        this.customFields.setEatenBefore(aEatenBefore);
    }
    
    /**
     * Sets what the user had eaten before the event in the linked Vomit object with
     * the string provided.
     * @param aEatenWhat what was eaten before the event began
     */
    public void setVomitEatenWhat(String aEatenWhat){
        this.customFields.setEatenWhat(aEatenWhat);
    }
    
    /**
     * Sets whether the user had drunk alcohol before the event in the linked Vomit object
     * with the answer provided.
     * @param aDrunkAlcohol whether alcohol was drunk before the event or not
     */
    public void setVomitDrunkAlcohol(boolean aDrunkAlcohol){
        this.customFields.setDrunkAlcohol(aDrunkAlcohol);
    }
    
    /**
     * Sets what alcohol the user had drunk before the event in the linked Vomit object with
     * with the string provided.
     * @param aDrunkWhat what the user drunk before the event 
     */
    public void setVomitDrunkWhat(String aDrunkWhat){
        this.customFields.setDrunkWhat(aDrunkWhat);
    }
    
    /**
     * Sets whether the user was hung-over or not when the event began in the linked
     * Vomit object with the answer provided.
     * @param aHungover whether the user was hung-over during the event
     */
    public void setVomitHungover(boolean aHungover){
        this.customFields.setHungover(aHungover);
    }
    
// condition setters
    
    /**
     * Sets whether the user was anxious when the event began in the linked Condition
     * object with the answer provided.
     * @param aAnxious whether the user was anxious at the event's beginning
     */
     public void setConditionAnxious(boolean aAnxious){
        this.condition.setAnxious(aAnxious);
    }
    
    /**
     * Sets what mood the user was when the event began in the linked Condition object
     * with the answer provided.
     * @param aMood the user's mood at the start of the event
     */
    public void setConditionMood(Condition.Mood aMood){
        this.condition.setMood(aMood);
    }
    
    /**
     * Sets whether the user was ill at all when the event began in the linked Condition 
     * object with the answer provided.
     * @param aAreYouIll whether they were ill at the start of the event
     */
    public void setConditionAreYouIll(boolean aAreYouIll){
        this.condition.setAreYouIll(aAreYouIll);
    }
    
    /**
     * Sets what the user was ill with in the linked Condition object with the string
     * provided.
     * @param aIllWithWhat what the user was ill with
     */
    public void setConditionIllWithWhat(String aIllWithWhat){
        this.condition.setIllWithWhat(aIllWithWhat);
    }
    
    /**
     * Sets whether the user had slept before the event in the linked Condition
     * object with the answer provided.
     * @param aSlept whether the user slept before the event
     */
    public void setConditionSlept(boolean aSlept){
        this.condition.setSlept(aSlept);
    }
    
    /**
     * Sets the number of hours slept before the event in the linked Condition object 
     * with the one provided.
     * @param aHrsSlept number of hours slept before event 
     */
    public void setConditionHrsSlept(int aHrsSlept){
        this.condition.setHrsSlept(aHrsSlept);
    }
    
    /**
     * Set what medication the user had taken before the event in the linked Condition 
     * object with the string provided.
     * @param aMedicationTaken the medication taken before the event
     */
    public void setConditionMedicationTaken(String aMedicationTaken){
        this.condition.setMedicationTaken(aMedicationTaken);
    }
    
//toString
    
    /**
     * Converts this Event's date into a string and returns it. For use in this events 
     * overridden toString method.
     * @return strDate  
     */
    String dateToString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("converted Date to String: " + strDate);
        return strDate;
    }
    
    /**
     * Returns a string of the date and time this object was created as 
     * representation of this object. Utilises the dateToString method.
     * @return strDate
     */
    @Override
    public String toString(){
        return this.dateToString();
        
    }
}
