package Project2;

public class Cuboid extends Shape {
    private double height;
    private double length;
    private double width;

    public Cuboid() {
        super();
        this.height = 0.0;
        this.width = 0.0;
        this.length = 0.0;
    }

    public Cuboid(double height, double length, double width) {
        super();
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHieght() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double surfaceArea() {
        return 2.0 * (height * length + length * width + width * length);
    }

    @Override
    public double surfaceAre() {
        return 0;
    }

    public double volume() {
        return height * length * width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuboid {");
        sb.append("length=").append(length);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

