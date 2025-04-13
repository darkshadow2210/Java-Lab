class Bike9 {
    final int speedlimit = 90;// final variable

    void run() {
        speedlimit = 400; // error
    }
}

class FinalVariable {
    public static void main(String a[]) {
        Bike9 s1 = new Bike9();
        s1.run();
    }
}
