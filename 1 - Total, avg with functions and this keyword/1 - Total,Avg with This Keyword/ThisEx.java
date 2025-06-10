class ThisEx {
  int a, b;

  public void ThisEx1(int a, int b) {
    this.a = a;
    this.b = b;
    int c = a + b;
    int avg = c / 2;
    System.out.println("THE SUM OF TWO NUMBER IS " + c);
    System.out.println("THE AVERAGE OF TWO NUMBER IS " + avg);
  }

  public static void main(String args[]) {
    int x, y;
    x = Integer.parseInt(args[0]);
    y = Integer.parseInt(args[1]);

    ThisEx S = new ThisEx();
    S.ThisEx1(x, y);
  }
}
