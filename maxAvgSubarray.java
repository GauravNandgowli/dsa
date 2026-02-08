public class maxAvgSubarray { 

  public static void main(String[] args) {
    int [] arr = {5,1,4,3,2,6};
    System.out.println(maxAvg(arr , 4));
  }

  public static double  maxAvg(int [] arr , int k){
    int start =0 , end = 0 , aggr = 0 ; double max = 0 , avg = 0;
    while (end < arr.length) {
      aggr =  aggr +  arr[end];  
      if (end - start + 1 == k) {
        avg =  aggr/k;
        max = Math.max(max , avg);
      }
      if(end - start + 1 > k){
        aggr= aggr - arr[start];
        start++;
      }



      end++;
    }
    return max;  }
}
