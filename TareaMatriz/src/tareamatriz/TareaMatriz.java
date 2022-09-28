
package tareamatriz;

public class TareaMatriz {

    public static void main(String[] args) {
        
        
        int sumatoria2 = 0;
        int[][] matriz = new int[3][3];

            int cont = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++){

                    matriz[i][j] = cont++;
                    sumatoria2+=matriz[i][2];
                }
            }
        
        
        System.out.println("*************************************************");
        //Seccion para mostrar el arreglo
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                
                System.out.print("    " + matriz[i][j]);
                
                
            }
            System.out.println("");
            
        }
        System.out.println("*************************************************");
        System.out.println("La sumatoria de la segunda diagonal es: "+ sumatoria2);
    }    
}
