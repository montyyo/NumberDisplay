
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
    
    // 
}
