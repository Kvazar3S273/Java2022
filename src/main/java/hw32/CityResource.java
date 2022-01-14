package hw32;

public class CityResource {
    public static void main(String[] args) {
        City city = new City();
        city.setTitle("Рівне");
        city.setPopulation(244325);
        city.setDensity(3913);
        city.setSquare(64);
        city.setRegions(1);
        city.setPostIndex("33000");

        System.out.println(city);
        System.out.println("місто " + city.getTitle() + " має площу " + city.getSquare() + " кв.км.");

        City a = new City("Київ", 2954300, 836, 10, 3520, "01000");
        System.out.println(a.getTitle()+" має густоту населення "+a.getDensity()+" і площу "+a.getSquare());
    }
}
