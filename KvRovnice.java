  
  import java.util.Scanner;
public class KvRovnice {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Vypište hodnotu a");
        int a = vstup.nextInt();
        System.out.println("Vypište hodnotu b");
        int b = vstup.nextInt();
        System.out.println("Vypište hodnotu c");
        int c = vstup.nextInt(); 
        int d = b*b - 4*a*c;
        if(d == 0){
            double reseni = -b/(a+a);
            System.out.println("Øešení je: " + reseni);
        }
        if(d < 0) {
            System.out.println("Rovnice nemá øešení");
        }
        if(d > 0) {
            double odmocnina = Math.sqrt(d);
            double reseni1 = (-b+odmocnina)/(a+a);
            double reseni2 = (-b-odmocnina)/(a+a);
            System.out.println("Rovnice má dvì øešení.");
            System.out.print("x1 = " + reseni1+ "\n" + "x2 = " + reseni2);
        }
            
        
        
    }
    

}