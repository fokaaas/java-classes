import java.util.Objects;

public class Airplane implements Comparable<Airplane> {
    private String country;
    private String manufacturer;
    private String model;
    private int maxSpeed;
    private int range;

    public Airplane(String country, String manufacturer, String model, int maxSpeed, int range) {
        this.country = country;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.range = range;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Airplane airplane = (Airplane) obj;
        return country.equals(airplane.country) &&
                manufacturer.equals(airplane.manufacturer) &&
                model.equals(airplane.model) &&
                maxSpeed == airplane.maxSpeed &&
                range == airplane.range;

    }

    @Override
    public int hashCode() {
        return Objects.hash(country, manufacturer, model, maxSpeed, range);
    }

    @Override
    public int compareTo(Airplane other) {
        if (this.maxSpeed != other.maxSpeed) {
            return Integer.compare(this.maxSpeed, other.maxSpeed);
        }
        return Integer.compare(other.range, this.range);
    }
}
