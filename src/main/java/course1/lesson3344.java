package course1;

public class lesson3344 {
/*
    public static void Diagonal() {
        int [][] table = new int [5][5];
        int counter = 1; // ненужна
        for (int i = 0; i < 5 /можно просто table.length;/ i++) {

            int j; // ненужно объявляется в условии цикла как i в первом цикле
            for (j = 0; j < table[i].length; j++) {
                table[i][j] = counter; //индекс строки и столбца должны совпадать //таким образом table[i][i]=1;
                counter++;//непонятно зачем
                if (table[i] == table[j]) {//непонятно зачем
                    counter = 1;//непонятно зачем
                }//непонятно зачем
                System.out.print(table[i][j] + " ");//заполнять массив и печатать его лучще в разных циклах
            }
            System.out.println();

        } System.out.println();//непонятно зачем

    } */

    private static void diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }}}
