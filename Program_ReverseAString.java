//Reverse A String In Java

public class Program_ReverseAString {
    public static void main(String[] args) {
        String str = "Geeks", rts = "";         
    
        char ch;
        for(int i = 0; i<str.length(); i++){
            ch = str.charAt(i);
            rts = ch+rts;
        }

        System.out.println(rts);


    }
}
