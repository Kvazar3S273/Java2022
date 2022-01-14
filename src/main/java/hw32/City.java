package hw32;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private String title;
    private int population;
    private int square;
    private int regions;
    private int density;
    private String postIndex;
}
