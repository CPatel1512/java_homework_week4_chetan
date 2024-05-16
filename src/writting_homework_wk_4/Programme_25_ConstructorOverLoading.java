package writting_homework_wk_4;

//Java program to overload constructors
public class Programme_25_ConstructorOverLoading {


    int id;
    String name;
    int age;

    // creating two arg constructor
    Programme_25_ConstructorOverLoading(int i, String n) {
        id = i;
        name = n;
    }

    // creating three arg constructor
    Programme_25_ConstructorOverLoading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
public void display(){
    System.out.println(id+ " " + name + " " + age);
}
    public static void main(String[] args) {
        Programme_25_ConstructorOverLoading s1 = new Programme_25_ConstructorOverLoading(111,"Kathan");
        Programme_25_ConstructorOverLoading s2 = new Programme_25_ConstructorOverLoading(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
