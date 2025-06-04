//מימוש הטיפוס שיר של אורית רביד
import java.util.*;
public class Song
{
	  public static Scanner reader=new Scanner(System.in);

	  private String  name;            // שם השיר
        private String  performer;      // שם המבצע
        private int  length;            // אורך השיר בשניות
        
       
        
     /*  פעולות בונות**/    
    //ט.כניסה: הפעולה מקבלת שם שיר, שם מבצע ואורך השיר בשניות    
    //ט.יציאה: הפעולה בונה ומחזירה עצם שיר עפ"י הערכים שהתקבלו    
    public Song(String name, String performer, int length)
    {
        this.name = name;
        this.performer = performer;
        this.length = length;
    }

    public Song() {
        System.out.println("Enter name for song:");
        this.name = reader.next();
        System.out.println("enter performer: ");
        this.performer = reader.next();
        System.out.println("Enter length: ");
        this.length = reader.nextInt();
    }

	
    /* פעולות מאחזרות**/  
    //ט.יציאה: הפעולה מאחזרת את שם השיר
    public String getName()
    {
        return this.name;
    }
    
    //ט.יציאה: הפעולה מאחזרת את שם המבצע
    public String getPerformer()
    {
        return this.performer;
    }

    //ט.יציאה: הפעולה מאחזרת את אורך השיר בשניות
    public int getLength()
    {
        return this.length;
    }
   
    /*  פעולות קובעות**/ 
    //ט.כניסה: הפעולה מקבלת שם שיר
    //ט.יציאה: הפעולה קובעת את שם השיר הנוכחי להיות שם השיר שהתקבל
    public void setName(String name)
    {
        this.name = name;
    }
    
    //ט.כניסה: הפעולה מקבלת שם מבצע
    //ט.יציאה: הפעולה קובעת את שם המבצע של השיר הנוכחי להיות שם המבצע שהתקבל
    public void setPerformer(String performer)
    {
        this.performer = performer;
    }

    //ט.כניסה: הפעולה מקבלת מספר שניות
    //ט.יציאה: הפעולה קובעת את אורך השיר הנוכחי להיות מספר השניות שהתקבל
    public void setLength(int length)
    {
        this.length = length;
    }

    

    /*  פעולות חישוביות**/
    //ט.כניסה:הפעולה מקבלת מספר שניות
    //ט.יציאה: הפעולה מגדילה את אורך השיר הנוכחי במספר שהתקבל
    public void increaseLength (int sec)
    {
    	this.length=this.length+sec;
    }
    
    //  ט.כניסה:הפעולה מקבלת מספר שניות
    //ט.יציאה: הפעולה מקטינה את אורך השיר הנוכחי במספר שהתקבל
    public void decreaseLength (int sec)
    {
    	this.length=this.length-sec;
    }
       
     //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את אורך השיר
     public String category ()     
     {
         if (this.length<2*60)
                return "short";
         else   
                if (this.length>=4*60)
                        return "long";
                else    
                        return "average";
            }          
            
       //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את השיר הנוכחי 
       public String toString()
       {
                return "Song Details: "+" name: "+this.name+" performer:  "+this.performer+" length:  "+this.length;  
       }        
    
}


