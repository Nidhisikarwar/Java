
  class OuterNew {
    int outer_x = 100;
    void test() {
    Inner inner = new Inner();
    inner.display(); }
    // this is an inner class
    static class Inner {
    void display() {
        OuterNew o1=new OuterNew();
    System.out.println("display: outer_x = " + o1.outer_x);
    }}}
    class InnerClassDemoNew {
    public static void main(String args[]) {
    Outer outer = new Outer();
    outer.test();
    }}
    