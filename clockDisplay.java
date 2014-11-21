
/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockDisplay
{
     // atribute for hours
    private NumberDisplay hours; //tipo NumberDisplay
    // limite del display
    private NumberDisplay minutes;
    //save the actualy hour
    private String saveHour;
    //save day
    private NumberDisplay day;
    //save month
    private NumberDisplay month;
    //save year
    private NumberDisplay year;
    //save date
    private String saveDate;
    /**
     * create a new constructor.
     */
    public clockDisplay()
    {
        hours = new NumberDisplay(24);//creacion en memoria de objetos con limite 24h
        minutes = new NumberDisplay(60);//creacion en memoria de objeto con limite 60m
        day = new NumberDisplay(30);
        month = new NumberDisplay(12);
        year = new NumberDisplay(2015);
        updateDisplay(); //llamada al metodo de numberdisplay
    }
    
    /**
     * create a new constructor with parameters 
     */
    public clockDisplay(int newHours, int newMinutes, int newDay, int newMonth, int newYear)
    {
       hours = new NumberDisplay(24);//creacion en memoria de objetos
       minutes = new NumberDisplay(60);
       day = new NumberDisplay(30);
       month = new NumberDisplay(12);
       year = new NumberDisplay(2015);
       
       hours.setValue(newHours); //cambio de valores del objeto, invocando el metodo setValue de la clase NumberDisplay 
       minutes.setValue(newMinutes);
       day.setValue(newDay);
       month.setValue(newMonth);
       year.setValue(newYear);
       
       updateDisplay();
    }
    
    /**
     * methot setTime, acept 2 parameters int hours and minutes and change time.
     */
    public void setTime(int setHour, int setMinute, int newDay, int newMonth, int newYear)
    {
       hours.setValue(setHour);
       minutes.setValue(setMinute);
       day.setValue(newDay);
       month.setValue(newMonth);
       year.setValue(newYear);
       updateDisplay();    
    }
    
    /**
     * method string getTime, return actually hour
     */
   public String getTime()
   {
    
       return  saveHour ;
       
   }
    
    /**
     * method timeTick plus a minute
     */
    public void timeTrick()
    
    {
       
        minutes.incremet();//incrementamos los minutos y su al cambiar llega al limite y pasa a 0 sumamos una hora.
        if(minutes.getValue() == 0) { 
            hours.incremet();
        }
       updateDisplay();
       //podemos llamar a updateDisplay();
    }
    
    /**
     * update string saveHour. method private solo puede usarse en el codigo desde otro metodo de la misma clase no desde
     * otra.
     */
    private void updateDisplay() //evitamos el uso redundante de codigo-- podemos sustituir saveHour por 
    {
        String saveDate = " " + day.getDisplayValueTwo()+ "/" + month.getDisplayValueTwo() + "/" + year.getDisplayValueTwo();
         if(hours.getValue() < 12)
       {
       if (hours.getValue() == 0)
       {
           saveHour  = "12"+ ":" + minutes.getDisplayValueTwo() + " am" + saveDate; 
        }
        else
        {
            saveHour  = hours.getDisplayValueTwo() + ":" + minutes.getDisplayValueTwo() + " am"+ saveDate; 
        }
    }
    else
    {
        if (hours.getValue() == 12)
        {
            saveHour  = hours.getValue() + ":" + minutes.getDisplayValueTwo() + " pm"+ saveDate; 
        }
        else
        {
            if((hours.getValue()-12) <10 )
            {
                saveHour = "0" + (hours.getValue()-12) + ":" + minutes.getDisplayValueTwo() + " pm"+ saveDate; 
            }
            else
            {
                saveHour  = (hours.getValue()-12) + ":" + minutes.getDisplayValueTwo() + " pm"+ saveDate; 
            }
        }
}
        
        
             
         
        

    }
 }
