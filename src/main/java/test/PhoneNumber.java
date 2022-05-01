package main.java.test;

public class PhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        char[] cStr = phoneNumber.toCharArray();
        if(cStr[0] != '(') return false;
        if(cStr[4] != ')') return false;
        if(cStr[5] != ' ') return false;

        for(int i = 1; i < cStr.length; i++){
            if(i != 4 && i != 5 && i != 9){
                if(!Character.isDigit(cStr[i])) return false;
            }
        }
        return true;
    }
}
