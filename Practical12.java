public class Practical12 {
    public static void main(String[] args) {
        cls obj = new cls("Private");
    }
}

class cls {
    private cls() {
        System.out.println("Private Constructor Called!");
        int count = 0;
        count = count + 1;
        System.out.println("Count: " + count);
    }

    public cls(String str) {
        this();
    }
}