public class IntegerToRoman {
   public static void main(String[] args) {
    int num = 9;
    int i = 0;
    StringBuffer sb = new StringBuffer();
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    while(num>0){
        if(num >= values[i]){
            sb.append(roman[i]);
            num = num - values[i];

        }
        else i++;
    }
    System.out.println(sb.toString());
   } 
}
