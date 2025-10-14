package in.easysystems.pojos;

import java.time.LocalDate;
import java.time.Period;

public record PersonRecord(LocalDate birthDate, String name, int age) {

    // Compact canonical constructor to calculate age automatically
    public PersonRecord(LocalDate birthDate, String name) {
        this(birthDate, name, Period.between(birthDate, LocalDate.now()).getYears());
    }
}
