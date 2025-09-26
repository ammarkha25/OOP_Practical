public class Practical1b_swappinwithout {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        System.out.println("Before swapping: a = " + x + ", b = " + y);

        x = x + y; 
        y = x - y; 
        x = x - y; 

        System.out.println("After swapping: a = " + x + ", b = " + y);
    }
}