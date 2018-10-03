import java.util.Scanner;  
class Pole {    
   public static void main(String args[]) {  
        Scanner vstup = new Scanner(System.in);   
        int[] pole = new int[10];  
        int i = 0;  
        while(i < 10){  
        System.out.println("Zadejte èíslo od -50 do 150.");  
        int cislo = vstup.nextInt();  
        if(cislo < -50 || cislo > 150){  
        System.out.println("Špatnì zadané èíslo.");  
        }  
        if(cislo >= -50 && cislo <= 150) {  
        pole[i] = cislo;  
        i++;  
        }  
        }  
        i = 0;  
        while(i < 10){  
        System.out.println("pole[" + i + "] = " + pole[i]);  
        i++;  
        }  
        int index = 0; 
        int pozice = 0; 
        while(pozice < 10){ 
                  i = 0;   
            int maximum = pole[index]; 
            while(i < 10){ 
                if(pole[i] < maximum){ 
                    maximum = pole[i]; 
                    pole[i] = pole[index]; 
                    pole[index] = maximum; 
                } 
                i++; 
            } 
            pozice++; 
            index++;       
	} 
	System.out.println();
	System.out.println("Seøazené pole:");
	i = 0;  
	while(i < 10){  
	System.out.println("pole[" + i + "] = " + pole[i]);
	i++;  
	}  
}   
}           