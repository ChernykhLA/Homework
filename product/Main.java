package product;

public class Main {
    public  static void main(String [] args) {
        Product[] productsArray = new Product[5];
        productsArray[0]=new Product ("Samsung s25 Ultra","01.02.2025", 
        "Samsunf Corp.", "Korea", 5599, true);
        productsArray[1]=new Product ("Samsung s25 Plus","01.02.2025", 
        "Samsunf Corkkkkp.", "Korea", 4999, true);
        productsArray[2]=new Product ("Samsung s25","01.02.2025", 
        "Samsunf Corp.", "Korea", 4499, true);
        productsArray[3]=new Product ("Samsung s24 Ultra","30.01.2024", 
        "Samsunf Corp.", "Korea", 4999, true);
        productsArray[4]=new Product ("Samsung s24 Plus","30.01.2024", 
        "Samsunf Corp.", "Korea", 4599, true);

        for (int i = 0; i < 5; ++i) {
            productsArray[i].Print();
            System.out.println();
        }
        
        Product p = new Product ("Samsung s25 Ultra","01.02.2025", 
        "Samsunf Corp.", "Korea", 5599, true);
        p.Print();

    }
}

