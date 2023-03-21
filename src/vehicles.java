import java.util.Objects;
import java.util.Scanner;

public class vehicles {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public vehicles(String model, String brand, int year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }
    Scanner input = new Scanner(System.in);
    public String getModel() {return model;}
    String getModel = input.nextLine();
    public void setModel(String model) { this.model = model;}

    public String getBrand(){return brand;}
    String getBrand = input.nextLine();
    public void setBrand(String brand) {this.brand = brand;}
    public  int getYear(){return year;}
    String setYear = input.nextLine();
    public void setYear(int year){this.year = year;}
    public String getColor(){return color;}
    String getColor = input.nextLine();
    public void setColor(String color){this.color = color;}
    public int getPrice() {return price;}
    String getPrice = input.nextLine();
    public void setPrice(int price) {this.price = price;}
    public int getQuantity() {return quantity;}
    String getQuantity = input.nextLine();
    public void setQuantity(int quantity) {this.quantity = quantity;}

//    public getUserData(){
//
//    }


    @Override
    public String toString(){
        return "Car{" +
                "model='" + model + '\'' +
                ",brand='" + brand + '\'' +
                ",year=" + year +
                ",price=" + price +
                ",color=" + color +
                ",quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;vehicles car = (vehicles) o;
        return year == car.year && price == car.price && quantity == car.quantity && Objects.equals(model,car.model) && Objects.equals(brand,car.brand) && Objects.equals(color,car.color);
    }

    @Override
    public int hashCode(){return Objects.hash(model,brand,year,price,color,quantity);}

    void sell(int sold) {quantity -=sold;}

    void delivery (int delivery) {quantity += delivery;}
}
