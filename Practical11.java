public class Practical11 {
    public static void main(String[] args) {
        clsOvr obj1 = new clsOvr(10);
        String str = "Copy!";
        clsOvr obj2 = new clsOvr(str);
        clsOvr obj3 = new clsOvr(obj2);
    }
}

class clsOvr {
    int var = 10;

    public clsOvr(int a) {
        System.out.println("Hello, A: " + a);
    }

    public clsOvr(String str) {
        System.out.println(str);
    }

    public clsOvr(clsOvr obj) {
        this.var = obj.var;
        System.out.println(var);
    }
}