public class Transponirovanie {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int array[][] = new int[a][b];

        System.out.println("Исходный массив!");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] =array[0].length*i+j;     // Чтобы получить правильную числовую последовательность число
                System.out.print(array[i][j] + " ");  // должно быть равно количеству символов в строке массива.
            }                                         // Условие образования чисел в массиве может быть любым.
            System.out.println();
        }
        System.out.println("Транспонированный массив!");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++)
                System.out.print(array[j][i] + " ");
            System.out.println();
        }
    }
}
/* array[0][0]=4*0+0=0
*  array[0][1]=4*0+1=1
*  array[0][2]=4*0+2=2
*  array[0][3]=4*0+3=3
*  array[1][0]=4*1+0=4
*  array[1][1]=4*1+1=5
*  array[1][2]=4*1+2=6
*  array[1][3]=4*1+3=7
*
* Исходный массив получается!
* 0  1  2  3
* 4  5  6  7
*
* Нужно получить!
* 0  4
* 1  5
* 2  6
* 3  7
*/