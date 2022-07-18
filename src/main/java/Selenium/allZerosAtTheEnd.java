package Selenium;

public class allZerosAtTheEnd {
	public static void main(String[] args) {
	int a[]  = {1,0,3,0,5,5,0,6};
	int b[]=new int[a.length];
	int m=0;
	int n=a.length-1;
	 
	 for(int i = 0 ; i < a.length;i++)	{
		 if (a[i]==0)	{
			 b[n]=a[i];
			 n--;
		 } 
		 else {
			 b[m]=a[i];
			 m++; 
		 }
	 }
	 for(int i = 0 ; i < b.length;i++)	{
	 System.out.print(b[i]+ " ");
	 System.out.println("testing");
	 }

}
}