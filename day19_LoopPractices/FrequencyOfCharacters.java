package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

        char ch = str.charAt(j); ///   //each character of str
        int count = 0;

            for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);                    //each character of str
            if (ch == each){
                count++;
            }
        }        // each character of str

               result += ch;
              result += count;
            }

        System.out.println(result);


    }
}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
