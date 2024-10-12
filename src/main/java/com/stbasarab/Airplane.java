package com.stbasarab;

import java.util.Objects;

/**
 * Represents an airplane with the specified attributes.
 */
public class Airplane implements Comparable<Airplane> {
    private final String country;
    private final String manufacturer;
    private final String model;
    private final int maxSpeed;
    private final int range;

    /**
     * Constructs an Airplane instance with the specified attributes.
     *
     * @param country      The country where the airplane is manufactured.
     * @param manufacturer The manufacturer of the airplane.
     * @param model        The model of the airplane.
     * @param maxSpeed     The maximum speed of the airplane in kilometers per hour.
     * @param range        The maximum flight range of the airplane in kilometers.
     */
    public Airplane(String country, String manufacturer, String model, int maxSpeed, int range) {
        this.country = country;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.range = range;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two airplanes are considered equal if they have the same country, manufacturer, model, maxSpeed, and range.
     *
     * @param obj The reference object with which to compare.
     * @return {@code true} if this airplane is the same as the obj argument; {@code false} otherwise.
     */
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


    /**
     * Returns a hash code value for the object. This method is supported for the benefit of hash-based collections.
     *
     * @return A hash code value for this airplane, computed using its attributes.
     */
    @Override
    public int hashCode() {
        return Objects.hash(country, manufacturer, model, maxSpeed, range);
    }

    /**
     * Compares this airplane to another airplane based on their maximum speed and range.
     * Airplanes are first compared by maximum speed in ascending order.
     * If their maximum speeds are equal, they are compared by range in descending order.
     *
     * @param other The other airplane to compare with.
     * @return A negative integer, zero, or a positive integer as this airplane is less than,
     * equal to, or greater than the specified airplane.
     */
    @Override
    public int compareTo(Airplane other) {
        if (this.maxSpeed != other.maxSpeed) {
            return Integer.compare(this.maxSpeed, other.maxSpeed);
        }
        return Integer.compare(other.range, this.range);
    }

    /**
     * Returns a string representation of the airplane, including the country, manufacturer, model,
     * maximum speed, and range.
     *
     * @return A string representation of the airplane's attributes.
     */
    @Override
    public String toString() {
        return "Country: " + country +
                ", Manufacturer: " + manufacturer +
                ", Model: " + model +
                ", Max Speed: " + maxSpeed +
                ", Range: " + range;
    }
}
