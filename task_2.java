/*
 * Дан массив nums = [3,2,2,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

 */

package java.seminar;

import javax.print.attribute.standard.MediaSize.NA;

public class task_2 {
    int [] nums = new int[] {3,2,2,3};
    int val = 3;
    int temp = 0;
    for (int i=nums.length; i>0; i--) {
        if(nums[i]!=val) {
            temp = i;
            for (int j=i; j>0; j--) {
                if (nums[j] == val) {
                    nums[j] = nums[i];
                    nums[i] = val;

                }

            }
        }

    }
    System.out.println(x:"Тройки в конце");
    for (int i = 0; i<nums.length; i++) {
        System.out.println(nums[i] + "");
    }
    
}
