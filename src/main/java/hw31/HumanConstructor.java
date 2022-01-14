package hw31;

public class HumanConstructor {
    public static void main(String[] args) {
        Human a = new Human();
        a.setFirstName("Tamara");
        System.out.println(a.getFirstName());

        Human b=new Human("Viktor","Tsoi", "male");
        System.out.println(b.getSecondName());


    }
}
