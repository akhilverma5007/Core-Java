package properties.inheritance;
public class Inheritance {  //PARENT 
    double l;
    double h;
    double w;


    //Created a Constructor of base class
    Inheritance () { 
        this.h = -1;
        this.l = -1;
        this.w = -1;
    } 

    //Cube :- Constructor 2
    Inheritance (double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    //If you pass three arguments it will call this :- Constructor 3
    Inheritance (double l, double h, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
