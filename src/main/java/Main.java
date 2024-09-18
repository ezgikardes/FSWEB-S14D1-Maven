import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.*;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //cylinder test
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        //pool test
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        //Employee test-----------------------------------------------
        // Junior Developers
        JuniorDeveloper junior1 = new JuniorDeveloper(1, "Alice", 50000);
        JuniorDeveloper junior2 = new JuniorDeveloper(2, "Bob", 50000);

        // Mid Developers
        MidDeveloper mid1 = new MidDeveloper(3, "Charlie", 70000);
        MidDeveloper mid2 = new MidDeveloper(4, "David", 70000);

        // Senior Developers
        SeniorDeveloper senior1 = new SeniorDeveloper(5, "Eve", 100000);
        SeniorDeveloper senior2 = new SeniorDeveloper(6, "Frank", 100000);

        // HR Manager & employee arrays
        JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
        MidDeveloper[] midDevelopers = new MidDeveloper[5];
        SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];
        HRManager hrManager = new HRManager(7, "Grace", 120000, juniorDevelopers, midDevelopers, seniorDevelopers);

        // Employees add to HR Manager
        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1, junior2);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, senior1);
        hrManager.addEmployee(1, senior2);

        // Exception test:
        hrManager.addEmployee(5, junior1);
        hrManager.addEmployee(6, mid1);

        junior1.work();
        mid1.work();
        senior1.work();
        hrManager.work();

        System.out.println("HR Manager Salary: " + hrManager.getSalary());
    }
}