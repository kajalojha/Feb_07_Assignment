package Feb_07_Asiignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Given a collection of string elements stringArray, organize the elements into groups where each group consists of
// strings that are anagrams of each other. An anagram is defined as a word or phrase that is created by rearranging
// the letters of another word or phrase, using all original letters exactly once. The solution can present the groups
// in any sequence.

//For stringArray = ["eat", "tea", "tan", "ate", "nat", "bat"], the output should be [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]. Each subgroup contains words that are anagrams of each other.
//For stringArray = [""], the output should be [[""]]. The array contains only one element that is an empty string, thus it forms a group by itself.
//For stringArray = ["z"], the output should be [["z"]]. Since there's only one string with one letter, it forms a group on its own.
//The length of stringArray is between 1 and 10^4.
//The length of each string in stringArray is between 0 and 100.
//Each string in stringArray consists of lowercase English letters.
//Your task is to group all the anagrams together from the given stringArray and return the grouped anagrams in any order.
public class Q1_AnagramString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        String arr[] = new String[n];// careate arr1
        String arr2[] = new String[n];// create second array so that after sorting the element we put them on arr2[]
        for (int i = 0; i < n; i++) // take input from user
        {
            arr[i] = sc.next();
        }
        int check[] = new int[n]; // create check array so for balance of count

        for (int i = 0; i < arr.length; i++)
        {
         String str = arr[i]; // put the element if arr1[] in String str
         char ch[] = str.toCharArray(); // convert String array to char array
         Arrays.sort(ch);// sort the array
         arr2[i] =  String.valueOf(ch); // convert char array into String type array

        }

        for(int i=0 ; i<n ;i++)
        {
            ArrayList<String> list = new ArrayList<>(); // create a array list to put the element
            for(int j =0 ;j<n ;j++)
            {
                if(arr2[i].equals(arr2[j]) )// if element of arr2 at is same as the element of arr2[j]
                {
                    if(check[j] == 0) // if check is 0
                    {
                        list.add(arr[j]); // add element in list
                        check[j] = -1; // make check -1
                    }

                }
            }
            if(list.size()!=0) // list size is not equal to 0
            {
                System.out.println(list); // print list
            }
        }
    }
}
