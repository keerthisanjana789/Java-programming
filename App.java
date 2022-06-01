import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class App
{
    public static void main(String[] args)
    {
        
    List<Student> data = new ArrayList<Student>();
    HashMap <String ,ArrayList<String>> map =new HashMap();
    try{
         String line ;
         String splitc = ",";
         BufferedReader input = new BufferedReader(new FileReader("data.csv"));
         
         ArrayList<String> no = new ArrayList();
         
         while((line = input.readLine()) != null)
         {
             String[] dat = line.split(splitc);
             ArrayList<String> nos = new ArrayList();
             nos.add(dat[1]);
             nos.add(dat[2]);
             nos.add(dat[3]);
             map.put(dat[0],nos);
             
         }
    }
         catch(Exception e)
         {	 	  	 		      		      	 	     	     	 	
             System.out.println(e.getMessage());
         }
         for(String reg  : map.keySet())
         {
             Student temp = new Student( reg , map.get(reg));
             data.add(temp);
         }
         
        for(Student k : data)
        {
            System.out.println(k);
        }
        classAvg(data);
        try
        {
            FileOutputStream fout = new FileOutputStream("stud.ser");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            
            for(Student k : data)
            {oout.writeObject(k);}
            oout.close();
            fout.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    public static void classAvg (List<Student> t) 
    {
        int s1=0;
        int s2=0;
        int s3=0;
        for( Student k: t)
        {	 	  	 		      		      	 	     	     	 	
            s1=s1+k.m1;
            s2=s2+k.m2;
            s3=s3+k.m3;
        }
        s1=s1/3;
        s2=s2/3;
        s3=s3/3;
        System.out.println("Average for Course 1 = "+s1);
        System.out.println("Average for Course 2 = "+s2);
        System.out.println("Average for Course 3 = "+s3);
    }
    
        
}
