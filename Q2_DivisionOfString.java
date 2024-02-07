package Feb_07_Asiignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Given a string inputString and a list of words wordsList, determine if inputString can be divided into a sequence o
// f one or more words from wordsList, with spaces inserted between words. The same word from wordsList can be used
// multiple times in the division.
//
//        For inputString = "Avisoft" and wordsList = ["Avi", "soft"], the function should return true because
//        "Avisoft"
//        can be divided as "Avi soft".
//For inputString = "jammukashmirjammu" and wordsList = ["jammu", "kashmir"], the function should return true because
// "jammukashmir" can be divided as "jammu kashmir jammu", and it's allowed to reuse words from wordsList.
//For inputString = "catsandog" and wordsList = ["cats", "dog", "sand", "and", "cat"], the function should return
// false since there's
// no way to divide "catsandog" using the words from wordsList that matches the entire string.
//The length of inputString is between 1 and 300 characters.
//The size of wordsList is between 1 and 1000.
//Each word in wordsList has a length between 1 and 20 characters.
//inputString and each word in wordsList consist only of lowercase English letters.
//All words in wordsList are unique.
//Determine if the given inputString can be fully segmented into a sequence of one or more words from the provided
// wordsList.
public class Q2_DivisionOfString
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of wordlist "); // for number of wordlist
        int n = sc.nextInt();// take number of word from user
        String str[] = new String[n]; // store in array
        for(int i=0 ; i<n ;i++)
        {
            str[i] = sc.next();// take word
        }
        System.out.println("enter the string");
        String st= sc.next();//  for string


        int last =0  , flag = 0; // initially last and flag is 0

        String s = ""; // take empty string

        for(int i=0 ; i< st.length();i++) // i iterate to the actual length of string
        {
            s = s+ st.charAt(i); //add charAt(i) in s like add char(0) ,charAt(1) and so on

            for(int j=0 ; j< str.length ;j++)//j iterate to the length of the wordlist
            {
                if(s.equals(str[j]) && i!= st.length()-1) // here we check the conditiom the value in s is equal to
                    // value of str and i is not equal  length-1 .
                {
                    s= ""; // make s empty
                    flag = 1; // flag becomee 1
                }
                if( s.equals(str[j]) && i == st.length()-1) // when i is equal to str.length()-1
                {
                    last = 1 ; // last become 1
                }

            }

        }
        if(last==1 && flag==1) // when both last and last is equal to 1 then print true
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false"); // else print false
        }


    }
}
