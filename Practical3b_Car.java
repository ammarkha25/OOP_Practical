class Practical3b_Car {
    String model;
    int year;

    Practical3b_Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Practical3b_Car myCar = new Practical3b_Car("Toyota", 2005); 
        myCar.display();
    }
}
