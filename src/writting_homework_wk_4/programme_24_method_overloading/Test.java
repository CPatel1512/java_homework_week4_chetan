package writting_homework_wk_4.programme_24_method_overloading;
/**
 * Test class to create objects and call the methods
 * Output:
 * SBI Rate of Interest: 8
 * ICICI Rate of Interest: 7
 * AXIS Rate of Interest: 9
 */
public class Test {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Icici i = new Icici();
        Axis a = new Axis();
        System.out.println("SBI Rate of Interest: " + s.getRateOfIntrest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfIntrest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfIntrest());
    }
}
