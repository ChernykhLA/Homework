package Interface;

public class Rectangle implements Figure{
    private int sideA;
    private int sideB;
    private String FillColor;
    private String BorderColor;
     public Rectangle (int sideA, int sideB, String FillColor, String BorderColor) {
         this.sideA=sideA;
         this.sideB=sideB;
         this.BorderColor=BorderColor;
         this.FillColor=FillColor;
     }
    public void setFillColor(String color){
        this.FillColor=color;
    }
    public void setBorderColor(String color){
        this.BorderColor=color;
    }
    public float perimeter() {
        float P=(sideA+sideB)*2;
        return P;
    }
    public float square(){
        float S=sideA*sideB;
        return S;
    }
    public void print(){
        System.out.println("Цвет заливки прямоугольника: " + FillColor);
        System.out.println("Цвет границы прямоугольника: " + BorderColor);
        System.out.println("Длина прямоугольника: " + perimeter());
        System.out.println("Площадь прямоугольника: " + square());
    }
}
