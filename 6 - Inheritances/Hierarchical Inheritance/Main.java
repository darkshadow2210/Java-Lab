class BaseClass {
    int parentNum = 10;
}

class SubClass1 extends BaseClass {
    int childNum1 = 1;
}

class SubClass2 extends BaseClass {
    int childNum2 = 2;
}

class SubClass3 extends BaseClass {
    int childNum3 = 3;
}

public class Main {
    public static void main(String args[]) {
        SubClass1 childObj1 = new SubClass1();
        SubClass2 childObj2 = new SubClass2();
        SubClass3 childObj3 = new SubClass3();
        System.out.println("parentNum * childNum1 = " + childObj1.parentNum * childObj1.childNum1);
        System.out.println("parentNum * childNum2 = " + childObj2.parentNum * childObj2.childNum2);
        System.out.println("parentNum * childNum3 = " + childObj3.parentNum * childObj3.childNum3);
    }
}