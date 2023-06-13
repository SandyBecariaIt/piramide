import java.util.Scanner;
 
public class PyramidAsterisks {
 
    public static void main(String[] args) {
        
      int  whiteSpace = 10;
      int asterisksCount = 1;
      
      while(whiteSpace >= 0){
        //Espacios en blanco
        for(int i=0; i < whiteSpace ; i++){
          System.out.print(".");
        }
              
        //Asteriscos
        for(int j=1; j <= asterisksCount ; j++){
          System.out.print("0");
        }
        
        whiteSpace--;
        asterisksCount += 2;
        System.out.println();
      }
    }
}
