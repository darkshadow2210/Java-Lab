final class Bike {
}

class Honda1 extends Bike// error can not be inherited
{
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Honda1 honda = new Honda1();
        honda.run();
    }
}
