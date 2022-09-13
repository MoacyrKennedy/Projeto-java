

import javax.sql.rowset.spi.SyncResolver;

public class Exercicio {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int asterisco =1;
        int pos =6;
          
        for(int i=0; i<=5; i++){
            for(int j=1; j<= 10; j++){
                if(j== pos){
                    for(int m =1; m<= asterisco; m++){
                        System.out.printf("*");
                    }
                    asterisco = asterisco +2;
                    pos --;
                } else {
                    System.out.printf(" ");
                }
            }                                
            System.out.println();
   
        }
        System.out.println("___|_|__");
        System.out.println("feliz natal");
    }  
}    