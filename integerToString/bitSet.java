public class bitSet {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMass = 1<<pos;
        n = n | bitMass;
        System.out.println(n);
    }
}
