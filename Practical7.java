public class Practical7 {
    public static void main(String[] args) {
        int int_var = 10;
        float float_var = 10.1f;
        char char_var = 'c';
        boolean boolean_var = true;
        Integer i1 = new Integer(int_var);
        Float f1 = new Float(float_var);
        Character c1 = new Character(char_var);
        Boolean b1 = new Boolean(boolean_var);
        System.out.println(i1.intValue());
        System.out.println(f1.floatValue());
        System.out.println(c1.charValue());
        System.out.println(b1.booleanValue());
    }
}
