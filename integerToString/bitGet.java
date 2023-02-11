public class bitGet {
    public static void main(String[] args) {
        int n = 56;
        int pos = 5;
        int bitMask = 1<<pos;
        if((bitMask & n)==0){
            System.out.println("The bie was zero");
        }
        else {
            System.out.println("The bit was one");
        }
    }
}