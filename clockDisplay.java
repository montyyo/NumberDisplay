
/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockDisplay
{
     // atribute for hours
    private NumberDisplay hours;
    // limite del display
    private NumberDisplay minutes;
    //save the actualy hour
    private String saveHour;
    
    /**
     * create a new constructor.
     */
    public clockDisplay()
    {
        hours = new NumberDisplay(0);
        minutes = new NumberDisplay(0);
    }
    
    /**
     * create a new constructor with parameters 
     */
    public clockDisplay(int newHours, int newMinutes)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        saveHour = hours + ":" + minutes;
    }
    
    /**
     * methot setTime, acept 2 parameters int hours and minutes.
     */
    public void setTime(int setHour, int setMinute)
    {
        hours = setHour;
        minutes = setMinute;
        
    }
    
    /**
     * method string getTime, return actually hour
     */
    public String getTime()
    {
       
    }
    
    
 }
