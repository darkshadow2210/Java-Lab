class Data {
    int data1;
    int data2;
}

class SetData {
    void setData(Data da, int d1, int d2) {
        da.data1 = d1;
        da.data2 = d2;
    }

    void getData(Data da) {
        System.out.println("data1 : " + da.data1);
        System.out.println("data2 : " + da.data2);
    }
}

public class Javaapp {
    public static void main(String[] args) {
        Data da = new Data();
        SetData sd = new SetData();
        sd.setData(da, 50, 100);
        sd.getData(da);
    }
}
