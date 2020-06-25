public class Arr6{
public static void sorting(int a[],int length) {
	int i=0,j=0,temp=0;
	for(i=0;i<length-1;i++) {
		for(j=0;j<length-i-1;j++) {
		if(a[j]>a[j+1]) {
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		   }
	    }
      }	
       for(int b : a) 
	   System.out.println(b+" ");
}
	public static void main (String []args) {
		int[] a= {40,70,10,30,25,55,99,12,45,40};
		sorting(a,10);	
	}
}