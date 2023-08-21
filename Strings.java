public class Strings{
    public static void main(String[] args){
        String a = "akhil";
        String b = "akhil";
        System.out.println(a == b);
        System.out.println(a.equals(b));


        String a1 = new String("verma");
        String a2 = new String("verma");

        System.out.println(a1 == a2);

        //Wrapper Class

        Integer num = new Integer(33);
        System.out.println(num);
        //OR
        System.out.println(num.toString());

        //String Performance
        String series = ""; 
        for (int i = 0; i < 26; i++) 
        {
            char ch = (char)('a' + i);
            series = series + ch;    
        }
        System.out.println(series);
    }
}