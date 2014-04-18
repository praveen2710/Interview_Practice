/*
*inplace reversal of a number meaning not converting to array and reversing number
*similar implementation will be recurse string reversal 
*/
class ReverseNumber{
  public int reversedNumber(int number){
    int reverse=0;
    while(number>0){
      reverse=(reverse*10)+(number%10);
      number=number/10;
    }
    return reverse;
  }
  public static void main(String args[]){
    ReverseNumber rn = new ReverseNumber();
    System.out.println(rn.reversedNumber(156));
  }
}
