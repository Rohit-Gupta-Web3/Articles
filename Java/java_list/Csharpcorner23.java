import static java.lang.System.out;    
import java.util.*;    
              
class Csharpcorner23              
{              
    public static void main(String[] args)          
    {              
        List list1 = new ArrayList();      
           
        list1.add("Maruti");    
        list1.add("Benz");    
        list1.add(1, "Audi");     
          
        Object[] a1 = list1.toArray();  
        out.print(a1);  
   }              
} 
