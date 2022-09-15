public class Practical15 {
    public static void main(String[] args) {
        ClassTwo c2 = new ClassTwo();
        ClassThree c3 = new ClassThree();
        ClassFive c5 = new ClassFive();
    }
}

class ClassOne {
}

class ClassTwo extends ClassOne {
    public ClassTwo() {
        System.out.println("Single Inheritance.");
    }
}

class ClassThree extends ClassTwo {
    public ClassThree() {
        System.out.println("Multilevel Inheritance.");
    }
}

class ClassFive extends ClassTwo {
    public ClassFive() {
        System.out.println("Hierarchical Inheritance.");
    }
}