/*#******************************************************************************************************************
        # @purpose :Demonstrate PrimeFactor Logic.
        # @file  :PrimeFactor.java
        # @author :Sandhya
   #***************************************************************************************************************/

package BasicPrograms;

public class PrimeFactors {

	public static void main(String[] args) {
		int n = 357;
		while(n%2==0) {
			System.out.print("2" +" ");
			n/=2;
		}
		
		for(int i=3;i<(n);i+=2){
			while(n%i==0) {
				System.out.print(i +" ");
				n/=i;
			}
		}
		if(n>2) {
			System.out.print(n);
		}
			}

}
