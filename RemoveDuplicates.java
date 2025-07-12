/* Remove Duplicate Characters from a String//
// Task:
//You’ll be given a string.
//Remove all the duplicate characters, and print only the first occurrence.*/

import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String result=" ";
       
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(result.indexOf(ch)==-1) // result.indexOf(c) == -1 means: character is NOT in the result yet andSo we add it only the first time it appears
        {
            result+=ch;
        }
        }
        System.out.println("The removal of duplicate elements in the given string: "+result);
    }
}
