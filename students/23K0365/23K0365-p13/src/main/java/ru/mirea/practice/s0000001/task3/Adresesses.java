package ru.mirea.practice.s0000001.task3;

public class Adresesses {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String korpus;
    private String appart;

    public Adresesses(String a) {
        String[] q = a.split(",");
        this.country = q[0];
        this.city = q[1];
        this.street = q[2];
        this.house = q[3];
        this.korpus = q[4];
        this.region = q[5];
        this.appart = q[6];
    }

    @Override
    public String toString() {
        return "Adresess:\n"
                + "country='" + country + '\n'
                + "region='" + region + '\n'
                + "city='" + city + '\n'
                + "street='" + street + '\n'
                + "house='" + house + '\n'
                + "korpus='" + korpus + '\n'
                + "appart='" + appart + '\n';
    }
}
