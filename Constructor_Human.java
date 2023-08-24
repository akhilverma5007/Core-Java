public class Constructor_Human {
    
        int age;
        String name;
        int salary;
        boolean married;
        static long population; //static means common to all

        public Constructor_Human(int age, String name, int salary, boolean married){
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married; 
            Constructor_Human.population += 1; //use class name because its common to all

        }
    

}
