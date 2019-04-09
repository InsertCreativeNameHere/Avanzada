/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author estudiantes
 */
public class Sudoku {

    private int[][] Sudoku = new int[9][9];

    public void generarSudoku() {
        int fila, columna, cuadrante, numeroAleatorio;
        this.llenarSudokuCero();

        for (int i = 0; i < 26; i++) {
            while (true) {
                numeroAleatorio = (int) Math.ceil(Math.random() * 9);
                fila = (int) (Math.random() * 9 );
                columna = (int) (Math.random() * 9);
                cuadrante = this.conocerCuadrante(fila, columna);
                if (!this.comprobarEntradaCuadrante(cuadrante, numeroAleatorio)) {
                    if (!this.comprobarFilas(fila, numeroAleatorio)) {
                        if (!this.comprobarColumnas(columna, numeroAleatorio)) {
                            this.Sudoku[fila][columna] = numeroAleatorio;
                            break;
                            
                        }
                    }
                }
            }
        }
    }

    public boolean comprobarEntradaCuadrante(int cuadrante, int numeroAleatorio) {
        switch (cuadrante) {
            case 1:
                if (this.comprobarExistencia(0, 2, 0, 2, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            case 2:
                if (this.comprobarExistencia(0, 2, 3, 5, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            case 3:
                if (this.comprobarExistencia(0, 2, 6, 8, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            case 4:
                if (this.comprobarExistencia(3, 5, 0, 2, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            case 5:
                if (this.comprobarExistencia(3, 5, 3, 5, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            case 6:
                if (this.comprobarExistencia(3, 5, 6, 8, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            case 7:
                if (this.comprobarExistencia(6, 8, 0, 2, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            case 8:
                if (this.comprobarExistencia(6, 8, 3, 5, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            case 9:
                if (this.comprobarExistencia(6, 8, 6, 8, numeroAleatorio)) {
                    return true;
                }
                ;
                break;
            default:
                return false;
        }
        return false;
    }

    public int conocerCuadrante(int fila, int columna) {
        int cuadrante = 0;
        if (fila >= 0 && fila <= 2 && columna >= 0 && columna <= 2) {
            cuadrante = 1;
        }
        if (fila >= 0 && fila <= 2 && columna >= 3 && columna <= 5) {
            cuadrante = 2;
        }
        if (fila >= 0 && fila <= 2 && columna >= 6 && columna <= 8) {
            cuadrante = 3;
        }
        if (fila >= 3 && fila <= 5 && columna >= 0 && columna <= 2) {
            cuadrante = 4;
        }
        if (fila >= 3 && fila <= 5 && columna >= 3 && columna <= 5) {
            cuadrante = 5;
        }
        if (fila >= 3 && fila <= 5 && columna >= 6 && columna <= 8) {
            cuadrante = 6;
        }
        if (fila >= 6 && fila <= 8 && columna >= 0 && columna <= 2) {
            cuadrante = 7;
        }
        if (fila >= 6 && fila <= 8 && columna >= 3 && columna <= 5) {
            cuadrante = 8;
        }
        if (fila >= 6 && fila <= 8 && columna >= 6 && columna <= 8) {
            cuadrante = 9;
        }
        return cuadrante;
    }

    public void llenarSudokuCero() {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                this.Sudoku[i][j] = 0;
            }
        }
    }

    public boolean buscarCeros() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.Sudoku[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean comprobarFilas(int fila, int numeroRevisar) {
        for (int i = 0; i < 9; i++) {
            if (this.Sudoku[fila][i] == numeroRevisar) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarColumnas(int columna, int numeroRevisar) {
        for (int i = 0; i < 9; i++) {
            if (this.Sudoku[i][columna] == numeroRevisar) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarExistencia(int filaInicial, int filaFinal, int columnaInicial, int columnaFinal, int numero) {
        boolean resultado = false;
        for (int i = filaInicial; i <= filaFinal; i++) {
            for (int j = columnaInicial; j <= columnaFinal; j++) {
                if (this.Sudoku[i][j] == numero) {
                    resultado = true;
                    return resultado;
                }
            }
        }
        return resultado;
    }

    public void imprimir() {
        String a = " ";
        for (int i = 0; i < 9; i++) {
            a = " ";
            System.out.println("\n");
            for (int j = 0; j <= 8; j++) {
                a = a + String.valueOf(" " + this.Sudoku[i][j] + " ");
            }
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.llenarSudokuCero();
        sudoku.generarSudoku();
        sudoku.imprimir();

    }

}
