
/*#******************************************************************************************************************
        # @purpose :Demonstrate PowerOfTwo Logic.
        # @file  :PowerOftwo.java
        # @author :Sandhya
   #***************************************************************************************************************/
package BasicPrograms;

public class PowerOfTwo {

	public static void main(String[] args) {
	Integer n = Integer.parseInt(args[0]);

	while(n>0) {
		 int a = n%2;
		 if(a==0) {
				System.out.println("num is power of 2");
			}
			else {
				System.out.println("not a power of two");
			}
		n/=2;
		}
	}
}
