package TASKsECOND;

public class Power {
  
   int current;
   int voltage;
   int powerRating;
   
   Power(int current,int voltage)
   {
	   this.current=current;
	   this.voltage=voltage;	   
   }
   
   void powerRating()
   {
	   powerRating=current*voltage;
   }
   
   
}
