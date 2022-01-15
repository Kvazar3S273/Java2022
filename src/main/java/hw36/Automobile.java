package hw36;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Automobile {
    private String name;
    private String mark;
    private int yearMade;
    private int engineCapacity;

    public String ToString() {
        return String.format("Назва автомобіля: " + name + "\n" +
                "Марка: " + mark + "\n" +
                "Рік випуску : " + yearMade + "\n" +
                "Об'єм двигуна : " + engineCapacity + "\n");
    }
}
