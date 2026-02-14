package umg.edu.gt.data_structure.array;

public class SumArray {
   public int sum(int[] nums) {
      int total = 0;
      int[] var3 = nums;
      int var4 = nums.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int n = var3[var5];
         total += n;
      }

      return total;
   }
}
