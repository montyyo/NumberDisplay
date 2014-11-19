
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
    
    /**
     * create a new constructor.
     */
    public clockDisplay()
    {
        hours = new NumberDisplay(24);//creacion en memoria de objetos con limite 24h
        minutes = new NumberDisplay(60);//creacion en memoria de objeto con limite 60m
        updateDisplay(); //llamada al metodo de numberdisplay
    }
    
    /**
     * create a new constructor with parameters 
     */
    public clockDisplay(int newHours, int newMinutes)
    {
       hours = new NumberDisplay(24);//creacion en memoria de objetos
       minutes = new NumberDisplay(60);
       hours.setValue(newHours); //cambio de valores del objeto, invocando el metodo setValue de la clase NumberDisplay 
       minutes.setValue(newMinutes);
       updateDisplay();
    }
    
    /**
     * methot setTime, acept 2 parameters int hours and minutes and change time.
     */
    public void setTime(int setHour, int setMinute)
    {
       hours.setValue(setHour);
       minutes.setValue(setMinute);
     updateDisplay();    
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
         if ( hours.getValue() >= 12){
             int hora = hours.getValue() - 12;
             saveHour = "0" + hora + ":" + minutes.getDisplayValueTwo()+ "pm"; //updateDisplay();
            }
         else{
             saveHour = hours.getDisplayValueTwo() + ":" + minutes.getDisplayValueTwo() + "am"; //updateDisplay();
            }
             
         
        

    }
 }
