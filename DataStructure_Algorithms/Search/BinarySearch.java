package DataStructure_Algorithms.Search;

public class BinarySearch {
    private int[] numbers={5,4,10,1,6,2};
    public BinarySearch(){
      insertSort();
    }

    public int findNumber(int number){
      int left=0;
      int right=numbers.length;
      int mid;
        while(left<=right){
          mid=(right+left)/2;
          if(number==numbers[mid]) return mid;
          else if(numbers[mid]>number) right= mid-1;
          else left=mid + 1;
        }
        return -1;
    }

    void insertSort(){
      int temp;
      int i,j;
      for(i=1;i<numbers.length;i++){
        temp = numbers[i];
        j=i-1;
        while(j>=0 && numbers[j]>temp){
          numbers[j+1]=numbers[j];
          j--;
        }
        numbers[j+1] = temp;
      }
    }
}
