package Interface;

public class Triangle implements Figure{
    private int sideA;
    private int sideB;
    private int sideC;
    private String FillColor;
    private String BorderColor;
     public Triangle (int sideA, int sideB, int sideC, String FillColor, String BorderColor) {
         this.sideA=sideA;
         this.sideB=sideB;
         this.sideC=sideC;
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
        float P=(sideA+sideB+sideC);
        return P;
    }

    public float square(){
        float p=(sideA+sideB+sideC)*0.5f;
        float S=p*(p-sideA)*(p-sideB)*(p-sideC);
        return S;
    }

    public void print(){
        System.out.println("Цвет заливки треугольника: " + FillColor);
        System.out.println("Цвет границы треугольника: " + BorderColor);
        System.out.println("Длина треугольника: " + perimeter());
        System.out.println("Площадь треугольника: " + square());
    }
}
