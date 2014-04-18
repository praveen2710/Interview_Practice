/*
*
*/
import java.util.*;

class checkPrime{
  public static void main(String args[]){
    boolean b = true;
    checkPrime cn = new checkPrime();
    System.out.println("Enter the number to be checked");
    Scanner sn = new Scanner(System.in);
    int input =sn.nextInt();
    for(int i=1;i<input/2;i++){
      if(input%i!=0){
        b=false;
      }
    }
    if(b==true){
      System.out.println("Number is Prime");
    }
    else{
    System.out.println("Number is not Prime");
    }
  }
}
