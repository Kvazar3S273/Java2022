package hw33;

public class CountryResource {
    public static void main(String[] args) {

        Country country = new Country();
        country.setTitle("Греція");
        country.setCapital("Афіни");
        country.setPopulation(10816286);
        country.setSquare(131957);
        country.setRegions(9);

        System.out.println(country);
        System.out.println("Країна " + country.getTitle() + " має площу " + country.getSquare() + " кв.км.");
        System.out.println("Столиця країни - місто " + country.getCapital());
        System.out.println("Населення " + country.getPopulation() + " чоловік");
        System.out.println("Складається з " + country.getRegions() + " регіонів");

        Country c = new Country("Барбадос", "Бриджтаун", 284589, 431, 1);
        System.out.println(c.getTitle() + " має столицю " + c.getCapital() + " і населення " + c.getPopulation());
    }
}
