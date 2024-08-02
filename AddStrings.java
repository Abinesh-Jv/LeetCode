class Solution {
    public String rev(String s){
        String newString = "";
        for (int i=0; i<s.length(); i++)
      {
        char ch= s.charAt(i); 
        newString = ch+newString;
      }
        return newString;
    }
    public String addStrings(String num1, String num2) {
        String n1,n2;
        int difference = num1.length()-num2.length();
        difference = difference > 0?difference:-difference;
        if (num1.length() > num2.length()){
            n1 = num1;
            n2 = "";
            for(int i = 0;i<difference;i++){
                n2+=0;
            }
            n2 += num2;
        }else{
            n1 = num2;
            n2 = "";
            for(int i = 0;i<difference;i++){
                n2+=0;
            }
            n2 += num1;
        }
        int remainder = 0;
        String num = "";
        for(int i = n1.length()-1;i>=0;i--){
            int temp = (n1.charAt(i)-48) + (n2.charAt(i)-48) + remainder;
            remainder = 0;
            if (temp > 9){
                remainder = 1;
                num += (char)((temp%10)+48);
            }
            else{
                num += temp;
            }            
        }if(remainder==1) num += '1';
    return this.rev(num);
    }
    
}
