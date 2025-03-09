package Interface;

public class Circle implements Figure{
    private int radius;
    private String FillColor;
    private String BorderColor;
     public Circle (int radius, String FillColor, String BorderColor) {
         this.radius=radius;
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
        float C=(2*3.14f*radius);
        return C;
    }
    public float square(){
        float S=3.14f*radius*radius;
        return S;
    }
    public void print(){
        System.out.println("Цвет заливки окружности: " + FillColor);
        System.out.println("Цвет границы окружности: " + BorderColor);
        System.out.println("Длина окружности: " + perimeter());
        System.out.println("Площадь окружности: " + square());
    }
}
