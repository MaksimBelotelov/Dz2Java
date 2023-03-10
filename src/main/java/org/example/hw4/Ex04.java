package org.example.hw4;

public class Ex04 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '2'},
                {'6', '.', '.', '1', '9', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validete: " + isValidSudoku(board));
    }

    /**
     * Метод проверяет, нет ли в массиве для судоку ошибок
     * @param board входной двумерный массив 9 * 9
     * @return true, если ошибок нет, false, если есть ошибки
     */
    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    for(int k = i - i % 3; k < (i - i % 3) + 3; k++) {
                        for(int l = j - j % 3; l <  (j - j % 3) + 3; l++) {
                            if((board[i][j] == board[k][l]) &&
                                    (i!=k) && (j!=l)){
                                return false;
                            }
                        }
                    }
                    for(int k = j + 1; k < 9; k++) {
                        if(board[i][j] == board[i][k])
                            return false;
                    }
                    for(int l = i + 1; l < 9; l++){
                        if(board[i][j] == board[l][j])
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
