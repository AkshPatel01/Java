public class Practical10 {
    public static void main(String[] args) {
        cls obj = new cls();
        obj.mthd(100);
    }
}

class cls {
    private int var = 10;

    public void mthd(int var) {
        System.out.println("Method's Variable: " + var);
        System.out.println("Class's Private Variable: " + this.var);
    }
}