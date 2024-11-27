package DataStructure_Algorithms.Sort;

public class InsertSort{
  public int[] insertSort(int[] numbers){
    int i;
    int j;
    int temp;
    for(i=1;i<numbers.length;i++){
      temp = numbers[i];
      j=i-1;
      while(j>=0 && numbers[j]>temp){
        numbers[j+1]=numbers[j];
        j--;
      }
      numbers[j+1] = temp;
    }
    return numbers;
  }
}