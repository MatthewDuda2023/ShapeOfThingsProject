package Project2;
import java.util.ArrayList;
import java.util.List;

public class Project {
    public static void main(String[] args) {
        ThreeDimensionalShape sphere = new Sphere (2.0);
        ThreeDimensionalShape cube = new Cube (5.0);
        ThreeDimensionalShape cylinder = new Cylinder (4.0, 1.0);
        ThreeDimensionalShape cubiod = new Cuboid (4.0, 1.0, 2);
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add (sphere);
        shapes.add (cube);
        shapes.add (cylinder);
        shapes.add (cubiod);
        shapes.forEach (System.out :: println);
        Sphere sphere1 = new Sphere (2.0);
        System.out.println (sphere1);

    }
}
