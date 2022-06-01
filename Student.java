//mapping csv to objects via hashmap
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;


public class Student implements Serializable
{
    String regno;
    int m1;
    int m2;
    int m3;
    
    @Override 
    public String toString()
    {
        return regno + " "+ m1+" "+m2+" "+m3;
    }
    
    public Student( String a , ArrayList<String> b)
    {
        this.regno=a;
        this.m1=Integer.parseInt(b.get(0));
        this.m2=Integer.parseInt(b.get(1));
        this.m3=Integer.parseInt(b.get(2));
    }
    
   
}
