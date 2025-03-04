package product;

public class Product {
    private String name;
    private String productDate;
    private String manufacturer;
    private String country;
    private float price;
    private Boolean bookStatus;

    public Product (String name, String productDate, String manufacturer,
                    String country, float price, Boolean bookStatus) {
        this.name = name;
        this.productDate=productDate;
        this.manufacturer=manufacturer;
        this.country=country;
        this.price=price;
        this.bookStatus=bookStatus;
    }
  
    public void Print() {
        System.out.println("Name: " + name);
        System.out.println("Data: " + productDate);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Price: " + price);
        System.out.println("BookStatus: " + bookStatus);
    }
}