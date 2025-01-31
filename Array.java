import java.util.Scanner;
public class Array{
	public static void main(String[]args){
	Scanner sc =new Scanner(System.in);
	int a[] =new int [10];
	for(int i=1;i<10;i++)
{
	System.out.println("ENter no:");
	a[i] =sc.nextInt();
}
	for(int i=1;i<10;i++){
	System.out.print(a[i]);
}
	
	for(int i=1;i<10;i++){
		for(int j=i+1;j<10;j++){
		int temp;
		if(a[i] <a[j]){
		temp =a[i];
		a[i] =a[j];
		a[j] =temp;
	
}
}
for(int k=1;k<10;k++){
System.out.println("Sorted array:" +a[k]);
}}
}
}
