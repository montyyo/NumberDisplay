
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
    // actualy hour
    private String saveHour;
    // day
    private NumberDisplay day;
    // month
    private NumberDisplay month;
    // year
    private NumberDisplay year;
    // date
    private String saveDate;
    /**
     * create a new constructor.
     */
    public clockDisplay()
    {
        hours = new NumberDisplay(24);//creacion en memoria de objetos con limite 24h
        minutes = new NumberDisplay(60);//creacion en memoria de objeto con limite 60m
        day = new NumberDisplay(31);
        month = new NumberDisplay(13);
        year = new NumberDisplay(99);
        
        //Inicializamos los parametros de la fecha a 1
       day.setValue(1);
       month.setValue(1);
       year.setValue(1);
        
       updateDisplay(); //llamada al metodo de numberdisplay
    }
    
    /**
     * create a new constructor with parameters 
     */
    public clockDisplay(int newHours, int newMinutes, int newDay, int newMonth, int newYear)
    {
       hours = new NumberDisplay(24);//creacion en memoria de objetos
       minutes = new NumberDisplay(60);
       day = new NumberDisplay(31);
       month = new NumberDisplay(13);
       year = new NumberDisplay(99);
       
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
    public void setTime(int setHour, int setMinute )
    {
       hours.setValue(setHour); // cambio de los atributos de hora y minutos
       minutes.setValue(setMinute);
       
       updateDisplay();    //guardamos los cambios
    }
    
    /**
     * method setDate, acept the parameters int and change the Date
     */
     public void setDate(int newDay, int newMonth, int newYear)
    {
       // cambio de los atributos de fecha
       day.setValue(newDay);
       month.setValue(newMonth);
       year.setValue(newYear);
       updateDisplay();    //guardamos los cambios
    }
    
    /**
     * method string getTime, return actually hour
     */
   public String getTime()
   {
    
       return  saveHour ;
       
   }
    
   /**
    * method dateTrick plus a day
    */
   public void dateTrick()
   {
     day.incremet(); //aumento de 1
     if(day.getValue() == 0) {
        month.incremet(); //si es día 1 aumentamos el mes en 1 
        day.incremet(); // al pasar de mes el dia es 1 no 0
       if( month.getValue() == 0){
             
             year.incremet(); //aumentamos el año
             month.incremet(); // al pasar de año el mes es 1 no 0
       } 
     }
     
     updateDisplay();
   }
    
    
    /**
     * method timeTick plus a minute
     */
    public void timeTrick()
    
    {
       
        minutes.incremet();//incrementamos los minutos y su al cambiar llega al limite y pasa a 0 sumamos una hora.
        if(minutes.getValue() == 0) { 
            hours.incremet(); 
           if ( hours.getValue() == 0){
               day.incremet();
               if(day.getValue() == 0) {
                     month.incremet(); //si es día 1 aumentamos el mes en 1 
                     day.incremet(); // al pasar de mes el dia es 1
                    if( month.getValue() == 0){
                      year.incremet(); //aumentamos el año
                      month.incremet(); // al pasar de año el mes es 1
                    } 
               }  
           }
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
      // variable local para excribir la fecha
       saveDate = " " + day.getDisplayValueTwo()+ "/" + month.getDisplayValueTwo() + "/" + year.getDisplayValueTwo();
       String pm = " pm";
       String am = " am";
       if(hours.getValue() < 12)
       {
          if (hours.getValue() == 0)
          {
               saveHour  = "12"+ ":" + minutes.getDisplayValueTwo() + am  + saveDate; 
          }
          else
          {
            saveHour  = hours.getDisplayValueTwo() + ":" + minutes.getDisplayValueTwo() + am + saveDate; 
          }
       }
       else
       {
         if (hours.getValue() == 12)
         {
            saveHour  = hours.getValue() + ":" + minutes.getDisplayValueTwo() + pm + saveDate; 
         }
         else
         {
            if((hours.getValue()-12) <10 )
            {
                saveHour = "0" + (hours.getValue()-12) + ":" + minutes.getDisplayValueTwo() + pm + saveDate; 
            }
            else
            {
                saveHour  = (hours.getValue()-12) + ":" + minutes.getDisplayValueTwo() + pm + saveDate; 
            }
         }
       }
   }                                    
}

