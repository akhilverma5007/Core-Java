package properties.inheritance;
public class Main_Inheritance {
    public static void main(String[] args) {
        Inheritance inher = new Inheritance(5,4,5);
        System.out.println(inher.l + " " + inher.h + " " + inher.w);
    
        Inheritance_Weight inWeight = new Inheritance_Weight();
        System.out.println(inWeight.h + " " + inWeight.weight + " " + inWeight.w + " " + inWeight.w);


    }

}
