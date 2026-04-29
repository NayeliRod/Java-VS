public  class CalcularS

public static int calcularSuma(int[][] matriz, int f, int c) {
    int suma = 0;
    int nFilas = matriz.length;
    int nCols = matriz[0].length;

    // Validar que la posición (f, c) exista
    if (f >= 0 && f < nFilas && c >= 0 && c < nCols) {
        
        // Recorrer el cuadrado 3x3 alrededor de la posición
        for (int i = f - 1; i <= f + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                
                // Verificar que el vecino esté dentro de la matriz
                if (i >= 0 && i < nFilas && j >= 0 && j < nCols) {
                    
                    // Sumar todos excepto la posición central (f, c)
                    if (!(i == f && j == c)) {
                        suma = suma + matriz[i][j];
                    }
                }
            }
        }
    }

    return suma;
}
