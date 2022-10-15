/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

 */

package java.seminar;

public class task_1 {
    int temp = 0;
    int count = 0;
    int [] a = new int[] {1, 1, 0, 1, 1, 1};
    for (int i = 0; i<a.length; i++){
        if (a[i]==1){
            temp++;

        }
        if(count<temp){
            count = temp;
        }
    }
}
