public class Practical14_4 {
    public static void main(String[] args) {
        cls obj1 = new cls(10, 10);
        cls obj2 = new cls(10, 10);
        cls obj3 = new cls(5, 6);
        System.out.println("OBJ1 Equals OBJ2: " + obj1.equal_to(obj2));
        System.out.println("OBJ1 Equals OBJ3: " + obj1.equal_to(obj3));
    }
}

class cls {
    int x, y;

    public cls(int a, int b) {
        x = a;
        y = b;
    }

    boolean equal_to(cls obj) {
        return (obj.x == x && obj.y == y);
    }
}