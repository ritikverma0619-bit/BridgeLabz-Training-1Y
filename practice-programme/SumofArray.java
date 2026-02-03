import java.util.Scanner;
class SumofArray{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = sc.nextInt();
int[] arr = new int[n];
int sum =0;
System.out.println("Enter the elements: ");
for(int i=0; i<n; i++){
arr[i] = sc.nextInt();
}
for(int i=0; i<n; i++){
sum = sum + arr[i];
}
System.out.println("sum of array elements = " +sum);
sc.close();
}
}