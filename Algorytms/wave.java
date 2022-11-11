package Algorytms;

public class wave {
    void waveA(int[][]arr) {
        int colLenght = arr.length - 2;
        int rowLength = arr[0].length - 2;

        for (int waveStep = 1; waveStep < colLenght * rowLength; waveStep++) {
            for (int i = 0; i <= colLenght; i++) {
                for (int j = 0; j <= rowLength; j++) {
                    if (arr[i][j] == waveStep) {
                        if (arr[i - 1][j] == -2 || arr[i][j + 1] == -2 || arr[i + 1][j] == -2 || arr[i][j - 1] == -2) return;
                        else {
                            if (arr[i - 1][j] == 0) arr[i - 1][j] = waveStep + 1;
                            if (arr[i][j + 1] == 0) arr[i][j + 1] = waveStep + 1; 
                            if (arr[i + 1][j] == 0) arr[i + 1][j] = waveStep + 1; 
                            if (arr[i][j - 1] == 0) arr[i][j - 1] = waveStep + 1;
                        }
                    }
                }
            }
        }
    }
    static void printField(int arr[][]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++)
                System.out.printf("%2d ", arr[i][j]);
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
    int[][] field = {{-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,0,0,0,0,-1,0,0,-1},{-1,0,0,0,0,-1,0,0,-1},
    {-1,0,0,-1,0,0,0,0,-1},{-1,0,0,-1,0,0,0,0,-1},{-1,-1,-1,-1,-1,-1,-1,-1,-1}}; 
    int iendSpot = 1;
    int jendSpot = 7;
    field[iendSpot][jendSpot] = -2;
    int iStart = 4;
    int jStart = 1;
    field[iStart][jStart] = 1;    
    printField(field);
    System.out.println();
    wave object = new wave();
    object.waveA(field);
    printField(field);
    }
}