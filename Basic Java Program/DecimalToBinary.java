/*
*Here I am trying to implement it using bistwise operations to brush up my bit
*wise operation skills.
*all array when declared are filled with 0,bolean with false,and string with 
*null.Also we can declare a String array.
*
*/
import java.util.*;

class DecimalToBinary{
	
 	public int[] convertToBinary(int input){
	  int[] binary = new int[25];
    int index=0;
		while(input>0){
	    binary[index++]=input%2;
      input = input/2;  
		}	
    return binary;
	} 	

	public static void main(String args[]){
		DecimalToBinary dtb = new DecimalToBinary();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number you want to convert it to Binary");
		int input = sn.nextInt();
	  int[] output=dtb.convertToBinary(input);
	  System.out.println("Modulus function"+2%2);
    for(int i=output.length-1;i>=0;i--)
    { 
      System.out.print(output[i]);
    }
  }
}

/*
*Errors made:Not declaring properly
*not impoerting class
*reversing a loop making mistakes
*simple function made in too complex
*need to practice more in terminal to get a hang of it
*/
