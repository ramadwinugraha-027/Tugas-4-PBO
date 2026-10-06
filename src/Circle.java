// public class Circle {
//     private double radius;
//     private String color;

//     public Circle() {
//         radius = 1.0;
//         color = "red";
//     }

//     public Circle(double radius) {
//         //System.out.println("Circle(double) dipanggil");
//         this.radius = radius;
//         color = "red";
//     }

//     public double getRadius() {
//         return radius;
//     }
    
//     public double getArea() {
//         return radius * radius * Math.PI;
//     }

//     // public static void main(String[] args) {
//     //     Circle c1 = new Circle();
//     //     System.out.println("c1 radius : " + c1.getRadius());
//     //     System.out.println("c1 area   : " + c1.getArea());
//     //     System.out.println("c1 object : " + c1); // Memanggil toString()

//     //     System.out.println("--------------------");

//     //     Circle c2 = new Circle(2.5);
//     //     System.out.println("c2 radius : " + c2.getRadius());
//     //     System.out.println("c2 area   : " + c2.getArea());
//     //     System.out.println("c2 object : " + c2); // Memanggil toString()
//     // }

//     @Override
//     public String toString() {
//         return "Circle[radius=" + radius + ", color=" + color + "]";
//     }

//     public Circle(double radius, String color) {
//         this.radius = radius;
//         this.color = color;
//     }

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public String getColor() {
//         return color;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }

//     public static void main(String[] args) {
//         // Membuat objek Circle
//         Circle c1 = new Circle(3.0, "blue");

//         System.out.println("Sebelum diubah:");
//         System.out.println(c1);

//         // Mengubah radius dan color melalui setter
//         c1.setRadius(5.0);
//         c1.setColor("red");

//         System.out.println("\nSetelah diubah:");
//         System.out.println(c1);
//     }
    
// }

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() { return Math.PI * radius * radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
    
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}