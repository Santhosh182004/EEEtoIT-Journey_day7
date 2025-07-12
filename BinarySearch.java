import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        int start=0, end=n-1;
         int result=-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==target){
            result=mid;
        }
        else if(arr[mid]<target){
           start=mid+1;   // same operation like start++
            result=start;
          
        }
        else{
           end=mid-1;   // same operation liek end--
            result=end;
        }
       // start++;
       // end--;
    }
if(result==-1){
    System.out.println("The target not found ");
}
else{
    System.out.println("The target  found at index : "+result);
}}}
