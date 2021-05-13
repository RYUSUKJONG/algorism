package no5;


//대소문자 변경

public class Main {

    public static void main(String[] args) {

        // a : 97 ~ 122
        // A : 65 ~ 90


        String input = "helloWorlD";
        char[] arr;
        arr = input.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char)(arr[i]+'A'-'a');
            }
            else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i]-('A'-'a'));
            }

        }
        System.out.println(arr);

    }
};