public class Practical14_2 {
    public static void main(String[] args) {
        cls obj = new cls();
        System.out.println("Before Swappng: " + "A: " + obj.a + ", B: " + obj.b);
        swap(obj);
        System.out.println("After Swappng: " + "A: " + obj.a + ", B: " + obj.b);
    }

    public static void swap(cls objr) {
        int var = objr.a;
        objr.a = objr.b;
        objr.b = var;
    }
}

class cls {
    int a = 10;
    int b = 20;
}