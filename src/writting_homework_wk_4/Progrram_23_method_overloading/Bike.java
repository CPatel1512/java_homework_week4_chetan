package writting_homework_wk_4.Progrram_23_method_overloading;
/**
 * Creating a child class
 */
public class Bike extends Vehicle {
    //defining same method as in the parent class
    public void run(){
        System.out.println("bike is runningn safely");
    }

    public static void main(String[] args) {
        Bike obj = new Bike();//creating object
        obj.run();//calling method
    }
}
