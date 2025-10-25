package RecursionInjava;
public class CheckArrayIsSorted {
 public static boolean checkArraySorted(int arr[],int ind){
    if(ind== arr.length-1){
       return true;
    }
    if(arr[ind]>=arr[ind+1]){
        return false;
    }
    else{
        return checkArraySorted(arr, ind+1);
    }
 }


 // O(n)
  public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6 };
       boolean check =  checkArraySorted(arr, 0);
       System.out.println(check);
    }
}