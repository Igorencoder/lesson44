package course1;

public class CrossesZeroesApp {



    //Поле
    public static char [] [] map;

    //размер поля
    public static final int SIZE = 3;

    //точек для победы
    public static final int DOTS_TO_WIN = 3;

    //описания точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';

    // инициализируем поле
    public static void initMap() {
        map = new char [SIZE] [SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print (map[i][j] + "");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        initMap();
        printMap();
    }

}
