
public class numberDisplay
{
    // variable numerica para el display
    private int display;
    // limite del display
    private int limit;
    
    public numberDisplay(int newLimit)
    {
      display = 0;
      limit = newLimit;
    
    }
    
    //metodo para cambiar el valor del display
    public void setValue(int newDisplay)
    {
      display = newDisplay;
    }
    
    //metodo que imprime el valor actual del display
    public void getDisplayValue()
    {
        System.out.println("valor del display  = " + display);
    }
    
    // metodo que devuelve el valor de display como un entero
    public void getValue()
    {
        int displayValue = display;
        System.out.println(displayValue);
    }
    
    //metodo que incrementa en 1 el display y si alcanza el limite vuelve al principio
    public void incremet()
    {
      display = display + 1;
      if (display >= limit )
      {
 
         display = 0;
      }
      
    }
}
