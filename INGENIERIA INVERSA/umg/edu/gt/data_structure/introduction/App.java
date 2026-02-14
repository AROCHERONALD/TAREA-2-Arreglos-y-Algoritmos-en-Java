package umg.edu.gt.data_structure.introduction;

import java.util.Arrays;
import umg.edu.gt.data_structure.array.BubbleSort;
import umg.edu.gt.data_structure.array.MergeSortDemo;
import umg.edu.gt.data_structure.array.QuickSort;
import umg.edu.gt.data_structure.array.SumArray;

public class App {
   public static void main(String[] args) {
      int[] d1 = new int[]{3, 5, 2, 9};
      SumArray sumArray = new SumArray();
      System.out.println(sumArray.sum(d1));
      MergeSortDemo mergeSortDemo = new MergeSortDemo();
      int[] d2 = new int[]{8, 3, 7, 4, 9, 2};
      mergeSortDemo.mergeSort(d2);
      System.out.println(Arrays.toString(d2));
      BubbleSort blueSort = new BubbleSort();
      int[] arr = new int[]{5, 1, 4, 2, 8};
      blueSort.bubbleSort(arr);
      int[] var7 = arr;
      int var8 = arr.length;

      int n;
      for(int var9 = 0; var9 < var8; ++var9) {
         n = var7[var9];
         System.out.print(n + " ");
      }

      QuickSort quick = new QuickSort();
      int[] arr1 = new int[]{10, 7, 8, 9, 1, 5};
      quick.quickSort(arr1, 0, arr1.length - 1);
      int[] arr2 = arr1;
      n = arr1.length;

      for(int var11 = 0; var11 < n; ++var11) {
         int n = arr2[var11];
         System.out.print(n + " ");
      }

      arr2 = new int[]{10, 7, 8, 9, 1, 5};
      Arrays.sort(arr2);
      System.out.println("\nUse sort: " + Arrays.toString(arr2));
   }
}
