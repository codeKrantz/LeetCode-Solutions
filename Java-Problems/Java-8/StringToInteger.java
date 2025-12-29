public class StringToInteger{
     public int myAtoi(String s) {
     //removes white space
     s = s.trim();   
     int sign = 1;
     int i = 0;
     long res = 0; // for overflow

     //first edge case: string is empty
     if(s.length() ==0){
        return 0;
     }

     //Sign checking, increment i to move to the next character 
     if(s.charAt(0) == '-'){
        sign = -1;
        i++;
     }
    else if(s.charAt(0) == '+'){
        i++;
    }

    //Processing characters
    while(i < s.length()){
        //find current char
        char ch = s.charAt(i);
        //if the character is a letter, break emmediatly via ASCII value check
        if(ch < '0' || ch > '9'){
            break;
        }
        res = res * 10 + (ch - '0');//coverting char to a number
        if(sign * res > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(sign * res < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        i++;
    }

    //need to cast
    return (int) (sign*res);
    }
}