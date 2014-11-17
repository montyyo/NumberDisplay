
/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockDisplay
{
     // atribute for hours
    private int hours;
    // limite del display
    private int minutes;
    //save the actualy hour
    private String saveHour;
    
    /**
     * create a new constructor.
     */
    public clockDisplay()
    {
        saveHour = "00:00";
    }
    
    /**
     * create a new constructor with parameters 
     */
    public clockDisplay(int newHours, int newMinutes)
    {
        hours = newHours;
        minutes = newMinutes;
        if (hours < 10 && minutes > 10 )
        {
            saveHour = "0" + hours + ":" + minutes;
        }
        
        if (minutes <10 && hours > 10)
        {
            saveHour = hours + ":0" + minutes;
        }
    }
    
    
    
    
}
