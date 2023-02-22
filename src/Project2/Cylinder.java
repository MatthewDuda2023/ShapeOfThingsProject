package Project2;

public class Cylinder extends Shape {
    private double height;
    private double radius;

    public Cylinder() {
        super();
        this.radius = 0.0;
    }

    public Cylinder(double height, double radius) {
        super();
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 2.0 * Math.PI * radius * (radius + height);
    }

    @Override
    public double surfaceAre() {
        return 0;
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
