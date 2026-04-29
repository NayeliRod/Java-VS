public class MatrizSimetrica {
    public static void main(String[] args) {
        
        // Crear una matriz de 4x4
        int[][] matriz = new int[4][4];
        
        // Llenar la matriz de forma simetrica
        // Una matriz simetrica cumple: matriz[i][j] = matriz[j][i]
        matriz[0][0] = 1;   matriz[0][1] = 2;   matriz[0][2] = 3;   matriz[0][3] = 4;
        matriz[1][0] = 2;   matriz[1][1] = 5;   matriz[1][2] = 6;   matriz[1][3] = 7;
        matriz[2][0] = 3;   matriz[2][1] = 6;   matriz[2][2] = 8;   matriz[2][3] = 9;
        matriz[3][0] = 4;   matriz[3][1] = 7;   matriz[3][2] = 9;   matriz[3][3] = 10;
        
        // Mostrar la matriz en pantalla
        System.out.println("MATRIZ SIMETRICA:");
        System.out.println();
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
