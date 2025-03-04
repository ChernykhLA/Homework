package park;
public class Main {
  public static void main(String[] args) {
    Park park = new Park();
    Park.Attractions attraction1 = park.new Attractions("slide", 10, "18:00" );
    Park.Attractions attraction2 = park.new Attractions("karusel", 10, "18:00" );
    attraction1.Print();
    attraction2.Print();
  }
}