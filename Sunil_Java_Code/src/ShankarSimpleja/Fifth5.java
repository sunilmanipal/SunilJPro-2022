package ShankarSimpleja;


enum Year {Jan, Feb, Mar, Apr, May, Jun, Jul, Aug,Sep,Oct,Nov,Dec}
public class Fifth5 {

	public static void main(String[] args) {
		  Year yr  = Year.Jan;
		     switch(yr)
		     {
		     case Jan :
		     case Feb :
		     case Mar :
		    	 System.out.println("Spring");
		    	 break;
		     case Apr:
		     case May:
		     case Jun:
		    	 System.out.println("Summer");
		         break;
		     case Jul:    
		     case Aug:
		     case Sep:
		         System.out.println("Autumn");
		         break;
		     case Oct:
		     case Nov:
		     case Dec:
		         System.out.println("Winter");
		         break;
		     		}

	}

}
