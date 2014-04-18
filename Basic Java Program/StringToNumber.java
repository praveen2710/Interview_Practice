/*
*This program is to convert a string to number without using Interger.parsrseInt()
*function.We need to use Ascii character concept to solve this proble,
*/
/*
*My first assumption executed correctly that I had based on Binary to Decimal Format
*however there seems to be a easier implementation for it.
*sum=sum*10+number; so always think on problem and try different things
*/
class StringToNumber{

  public int convertToNumber(String input){
    char[] eachBit = input.toCharArray();
    int zeroAscii = (int)'0'; //type casting
    int powerFactor = eachBit.length-1;
    int outputNumber = 0;
    for(int i=0;i<eachBit.length;i++){
      int numberAscii = (int)eachBit[i];
      outputNumber+= Math.pow(10,powerFactor)*(numberAscii-zeroAscii);
      powerFactor--;
    }
    return outputNumber;
  }
  
  public static void main(String args[]){
    StringToNumber sn = new StringToNumber();
    System.out.println(sn.convertToNumber("5231"));
  }
}
