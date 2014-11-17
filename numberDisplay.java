
public class NumberDisplay
{
    // variable numerica para el display
    private int display;
    // limite del display
    private int limit;
    
    //introduce el limite
    public NumberDisplay(int newLimit)
    {
      display = 0;
      
      limit = newLimit;
    
    }
    
    //metodo para cambiar el valor del display
    public void setValue(int newDisplay)
    {
      if (newDisplay < limit && newDisplay >=0){
      display = newDisplay;
    }
    }
    
    //metodo que imprime el valor actual del display
    public void getDisplayValue()
    {
        if (display < 10 )
        {
            System.out.println("0" + display);
        }
        else
        {
             System.out.println(display);
        }
    }
    
    // metodo que devuelve el valor de display como un entero
    public int getValue()
    {
       return  display;
    }
    
    //metodo que incrementa en 1 el display y si alcanza el limite vuelve al principio
    //if (value < (limit - 1)){ value = value +1} else {value = 0;} si sumas dentro llega al limite , este no
    public void incremet()
    {
      display = display + 1;
      if (display == limit )
      {
          display = 0;
      }
      
    }
    
    //otro tipo de string
    public String getDisplayValueTwo()
    {
       String returnedValue="";
         if (display < 10)
         {
            returnedValue = "0" + display;
            }
         else
         {
            returnedValue = "" + display;
            }
    
       return returnedValue;
    
    }
}
