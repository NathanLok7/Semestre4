package fecha;


public class Date {
   private int day = 1;
   private int month = 1;
   private int year = 1970;
   
   public Date(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
}
   public Date() {
	   
   }
   

public void setDay(int day) {
	   if (day>= 1 && day<=31) {
		   this.day = day;
		   
	   }
	   else {
		   System.out.println("dia inexistente");
	   }
   }
   
   public void setMonth(int month) {
	   if (month>= 1 && month<=12) {
		   this.month = month;
		   
	   }
	   else {
		   System.out.println("mes inexistente");
	   }
   }
   
   public void setYear(int year) {
	   if (year>= 0 && year<=9999) {
		   this.year = year;
		   
	   }
	   else {
		   System.out.println("aÃ±o inexistente");
	   }
   }
   
   public int getDay() {
	   return day;
   }
   
   public int getMonth() {
	   return month;
   }
   
   public int getYear() {
	   return year;
   }
   
   public boolean isValid() {
      if (month == 2 && day == 29 && isLeap()) {
    	  return true;
      }
      if (month == 4 && day == 31)
      {
      	return false;
      }
      if (month == 6 && day == 31) {
      	return false;
      }
      if (month == 9 && day == 31) {
      	return false;
      }
      if (month == 11 && day == 31) {
      	return false;
      }
      return false;
   }
	
	
   private boolean isLeap() {
	   boolean isLeapYear;
	   
	   isLeapYear = (year%4==0);
	   
	   isLeapYear =  isLeapYear && (year % 100 != 0 || year % 400 == 0);
	   
	   if(isLeapYear) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   public void tostring(Date xd) {
	   System.out.println("la fecha es: " + xd.getDay() + " de " + xd.mes() + " del " + xd.getYear());
   }
   
   private String mes() {
	   if (month == 1)
		   return "Enero";
	   if (month == 2)
		   return "Febrero";
	   if (month == 3)
		   return "Marzo";
	   if (month == 4)
		   return "Abril";
	   if (month == 5)
		   return "Mayo";
	   if (month == 6)
		   return "Junio";
	   if (month == 7)
		   return "Julio";
	   if (month == 8)
		   return "Agosto";
	   if (month == 9)
		   return "Septiembre";
	   if (month == 10)
		   return "Octubre";
	   if (month == 11)
		   return "Noviembre";
	   if (month == 12)
		   return "Diciembre";
	   return "Enero";
   }
   
}

import fecha.Date;

public class testFecha {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(2020,9,10);
	    Date d3 = new Date(2020,13,25);
	    Date d4 = new Date(2021,2,29);
	    d1.tostring(d1);
	    d2.tostring(d2);
	    d3.tostring(d3);
	    
        System.out.println(d4.isValid());
        
        if (d4.isValid()) {
        	System.out.println("valida");
        }
        else {
        	System.out.println("invalida");
        }
	}

}
