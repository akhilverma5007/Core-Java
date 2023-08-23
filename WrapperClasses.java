public class WrapperClasses {
    public static void main(String[] args) {
        
        // int a = 10;
        // int b = 20;

        //Integer num = new Integer(10); //Not required insted use below

        Integer num = 45; // num is a object here
        //You can do num. ..... and it will show you all the properties, that is called Wrapper class
        
        int a = 10;
        int b = 20;
        
        swap(a, b);
        System.out.println(a + " " + b);

        Integer aa = 100;
        Integer bb = 200; 

        swapp(aa, bb);
        System.out.println(aa + " " + bb);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
     //This will not swap, (this is only swapping incide the swap function only)
     // because of scope of function because java is pass by value . 
     //But when you pass a object the reference value is passed


     

    static void swapp(Integer aa, Integer bb){
       Integer temp = aa; 
       aa = bb;
       bb = temp;
    }
    //Now also its not swapping, the reason is because Integer is a final class

}
