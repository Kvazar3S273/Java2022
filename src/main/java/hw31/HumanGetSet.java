package hw31;

public class HumanGetSet {
    public static void main(String[] args) {
        Human human = new Human();
        human.setFirstName("Ippolit");
        human.setSecondName("Zampolit");
        human.setSex("male");
        System.out.println(human.getFirstName() + " " + human.getSecondName() + " " + human.getSex());
    }
}
