package park;

public class Park {
    public class Attractions {
        private String name;
        private int price;
        private String time;

        public Attractions (String name, int price, String time) {
            this.name = name;
            this.price = price;
            this.time=time;
        }

        public void Print() {
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Time: " + time);
        }
    }
}

     
   
        
