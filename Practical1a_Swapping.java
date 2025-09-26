public class Practical1a_Swapping {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        System.out.println("Before swapping: a = " + x + ", b = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping: a = " + x + ", b = " + y);
        
    }
}
