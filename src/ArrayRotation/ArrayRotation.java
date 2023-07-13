package ArrayRotation;

import java.util.Scanner;

public class ArrayRotation {
	
	public static int[] rotateArray(int arr[],int r1,int count1){
        while (count1 < (r1)) {
            int temp = arr[count1];
            arr[count1] = arr[r1];
            arr[r1] = temp;
            count1++;
            r1--;
        }
    return  arr;
}

public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the number of time to rotate");
    int rotate=sc.nextInt();
    int ans[]=rotateArray(arr,n-1,0);
    ans=rotateArray(ans,rotate-1,0);
    ans=rotateArray(ans,n-1,rotate);

    for(int p=0;p<ans.length;p++){
        System.out.println(ans[p]);
    }
}

}
