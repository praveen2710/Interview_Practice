/*class can have multiple classes but only one public class can be present with 
*same name as class name and not be specified as public
*I need to concentrate more on what I am doing Making silly blunders for obvious
*programs . Declaring array properly writing loop condition properly and so on.
*/

import java.util.*;
class BinaryToDecimal{
  
  public double convertToDecimal(int[] input){
    double eachBit;
    double totalSum=0; //intialize each bit need to read more about it
    int powerFactor=input.length-1;
    for(int i = 0;i<input.length;i++){
      eachBit=0;
      eachBit = input[i]*Math.pow(2,powerFactor);
      powerFactor--;
      //System.out.println(input[i]);
      totalSum +=eachBit;
    }
    return totalSum;  
  }

 public static void main(String args[]){
    BinaryToDecimal btd = new BinaryToDecimal(); 
    int[] binary ={1,1,0,0,0,0}; // braces are  curly for square and not int if defining
    double output=btd.convertToDecimal(binary);
    System.out.println(output);
  }
}
