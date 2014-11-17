
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
        hours = new NumberDisplay(24);//creacion en memoria de objetos
        minutes = new NumberDisplay(60);
         saveHour = hours.getDisplayValueTwo() + ":" + minutes.getDisplayValueTwo(); //llamada al metodo de numberdisplay
    }
    
    /**
     * create a new constructor with parameters 
     */
    public clockDisplay(int newHours, int newMinutes)
    {
       hours = new NumberDisplay(24);//creacion en memoria de objetos
       minutes = new NumberDisplay(60);
       hours.setValue(newHours); //cambio de valores 
       minutes.setValue(newMinutes);
       saveHour = hours.getDisplayValueTwo() + ":" + minutes.getDisplayValueTwo();
    }
    
    /**
     * methot setTime, acept 2 parameters int hours and minutes and change time.
     */
    public void setTime(int setHour, int setMinute)
    {
       hours.setValue(setHour);
       minutes.setValue(setMinute);
       saveHour = hours.getDisplayValueTwo() + ":" + minutes.getDisplayValueTwo();       
    }
    
    /**
     * method string getTime, return actually hour
     */
   public String getTime()
   {
       return saveHour;
   }
    
    /**
     * method timeTick plus a minute
     */
    public void timeTrick()
    
    {
    
    
    }
 }
