public class Transponirovanie {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int array[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = a * i + j;
                array[i][j] = b * i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++)
                System.out.print(array[j][i] + " ");
            System.out.println();
        }
    }
}