package hw34;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fraction {
    @NonNull
    private int numerator;
    @NonNull
    private int denominator;

    public String ToString() {
        return String.format(numerator + "/" + denominator);
    }

}
