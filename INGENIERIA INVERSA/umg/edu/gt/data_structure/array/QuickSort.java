package umg.edu.gt.data_structure.array;

public class QuickSort {
   public void quickSort(int[] arr, int low, int high) {
      if (low < high) {
         int pivotIndex = this.partition(arr, low, high);
         this.quickSort(arr, low, pivotIndex - 1);
         this.quickSort(arr, pivotIndex + 1, high);
      }

   }

   private int partition(int[] arr, int low, int high) {
      int pivot = arr[high];
      int i = low - 1;

      int j;
      for(j = low; j < high; ++j) {
         if (arr[j] <= pivot) {
            ++i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      }

      j = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = j;
      return i + 1;
   }
}
