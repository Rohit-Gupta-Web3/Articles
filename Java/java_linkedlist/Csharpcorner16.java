import static java.lang.System.out;  
import java.util.LinkedList;  
import java.util.ListIterator;  
  
class Csharpcorner16              
{              
    public static void main(String[] args)          
    {              
        LinkedList<String> l1 = new LinkedList<String>();  
        l1.add("c");  
        l1.add("sharp");  
        l1.add(2,"corner");  
          
        ListIterator x = l1.listIterator(2);  
        
        out.print(x);  
    }                
}  
