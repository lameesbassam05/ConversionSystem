import java.util.Scanner;

public class ConversionSystem {
    public static void main(String[] args){
        
        System.out.println("Name: Lamees Bassam");
        System.out.println("ID: 202310833");
        
        Scanner scanner = new Scanner(System.in);
        
        // menu
        System.out.println("Please choose a conversion system (1-3)");
        System.out.println("1. Length (Meter, Inch, Feet");
        System.out.println("2. Temporareture (celsius, Fehrenheit, kelvin)");
        System.out.println("3. Time (Second, Milliseconds,Minutes, Hours)");
        
       // uoser’s choice
       System.out.print("Your choise: ");
       int choice = scanner.nextInt();
       
       switch(choice){
           case 1:
           lengthConversion(scanner);
           break;
           
           case 2:
           temporatureConversion(scanner);
           break;
       
           case 3:
           timeConversion(scanner);
           break;
       
           default:
           System.out.println("Invalid choice!");
       }
       
       scanner.close();
    }
    
    private static void lengthConversion(Scanner scanner){
        System.out.println("You selected lingth conversion.");
        System.out.println("Enter unit to (M/I/F): ");
         char from = scanner.next().toUpperCase().charAt(0);
        System.out.print("Enter unit to (M/I/F): ");
         char to = scanner.next().toUpperCase().charAt(0);
        System.out.print("value: ");
         double value = scanner.nextDouble();
         
         double result = 0;
          if (from == 'M'){
             if (to == 'I')      result = value * 39.37;
             else if (to == 'F') result = value * 3.281;
         }
         else if (from == 'I'){
             if (to == 'M')      result = value / 39.37;
             else if (to == 'F') result = value / 12;
         }
         else if (from == 'F'){
             if (to == 'M')      result = value / 3.281;
             else if (to == 'I') result = value * 12;
         }
          
        System.out.println(value + " " + from + " = " + result + " " + to);    }
    
    private static void temporatureConversion(Scanner scanner){
       System.out.println("You selected temporature conversion.");
        System.out.println("Enter unit to (C/F/K): ");
         char from = scanner.next().toUpperCase().charAt(0);
        System.out.print("Enter unit to (C/F/K): ");
         char to = scanner.next().toUpperCase().charAt(0);
        System.out.print("value: ");
         double value = scanner.nextDouble();
         
         double result = 0;
         if (from == 'C'){
             if (to == 'F')      result = value * (9/5) + 32;
             else if (to == 'K') result = value + 273.15;
         }
         else if (from == 'F'){
             if (to == 'C')      result = (value - 32) * (5/9);
             else if (to == 'K') result = (value + 459.67) * (5/9);
         }
         else if (from == 'K'){
             if (to == 'C')      result = value - 273.15;
             else if (to == 'F') result = value * (9/5) - 459.67;
         }
         
        System.out.println(value + " " + from + " = " + result + " " + to);
    }
    
    private static void timeConversion(Scanner scanner){
       System.out.println("You selected time conversion.");
        System.out.println("Enter unit to (S/MS/MIN/HR): ");
         String from = scanner.next().toUpperCase();
        System.out.print("Enter unit to (S/MS/MIN/HR): ");
         String to = scanner.next().toUpperCase();
        System.out.print("value: ");
         double value = scanner.nextDouble();
         
         double result = 0;
         if (from.equals("S")){
             if (to.equals("MS"))       result = value * 1000;
             else if (to.equals("MIN")) result = value / 60;
             else if (to.equals("HR"))  result = value / 3600;
         }
         else if (from.equals("MS")){
             if (to.equals("S"))         result = value / 1000;
             else if (to.equals ("MIN")) result = value / 1000 / 60;
             else if (to.equals("HR"))   result = value / 1000 / 3600;
         }
         else if (from.equals("MIN")){
             if (to.equals("S"))        result = value * 60;
             else if (to.equals("MS"))  result = value * 60 * 1000;
             else if (to.equals("HR"))  result = value / 60;
         }
         else if (from.equals("HR")){
             if (to.equals("S"))       result = value * 3600;
             else if (to.equals("MS")) result = value * 3600 * 1000;
             else if (to.equals("MIN"))  result = value * 60;
         }
         
        System.out.println(value + " " + from + " = " + result + " " + to);
    }
} 