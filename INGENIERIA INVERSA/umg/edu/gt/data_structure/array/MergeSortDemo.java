package umg.edu.gt.data_structure.array;

import java.util.Arrays;

public class MergeSortDemo {
   public void mergeSort(int[] a) {
      if (a.length > 1) {
         int mid = a.length / 2;
         int[] left = Arrays.copyOfRange(a, 0, mid);
         int[] right = Arrays.copyOfRange(a, mid, a.length);
         this.mergeSort(left);
         this.mergeSort(right);
         this.merge(a, left, right);
      }
   }

   private void merge(int[] a, int[] left, int[] right) {
      int i = 0;
      int j = 0;
      int var6 = 0;

      while(i < left.length && j < right.length) {
         if (left[i] <= right[j]) {
            a[var6++] = left[i++];
         } else {
            a[var6++] = right[j++];
         }
      }

      while(i < left.length) {
         a[var6++] = left[i++];
      }

      while(j < right.length) {
         a[var6++] = right[j++];
      }

   }
}
