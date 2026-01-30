import java.util.Scanner;
public class MainExample{
public static void main (String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter your num: ");
int n = sc.nextInt();
for(int i=1; i<=n; i++){
if(i%2==0){
continue;
} else{
System.out.println(i);
}
}
}
}