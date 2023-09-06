package holiday;

public class Destination {
    private Main.Continent country;
    private double price;
    private Main.Sites site;

    public Destination(Main.Continent country, double price, Main.Sites site) {
        this.country = country;
        this.price = price;
        this.site = site;
    }

    public Main.Continent getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }

    public Main.Sites getSite() {
        return site;
    }
}
