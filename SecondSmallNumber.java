//   Function to find 2 smallest number from an array

public class SecondSmallNumber {
	public static int getSmallest(int[] array){
		int temp;
        for(int i = 0; i<array.length; i++ ){
          for(int j = i+1; j<array.length; j++){
             if(array[i]>array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
             }
          }
        }
        System.out.println("2nd Smallest element of the array is:: "+array[1]);
	    System.out.println("2 Smallest element of the array is:: "+array[0] +","+array[1]);
		return 0;
	   }
   public static void main(String args[]){
      int array[] = {5,11,2,7,9,8,15};
	  getSmallest(array);
	   
	  
   }
}