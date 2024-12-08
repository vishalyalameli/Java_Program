
class ClassA {

    void meth1() {
        ClassA obj1 = new ClassA();
        obj1.meth5();
        int a = 10;
        System.out.println(10);
        System.out.println(54 + a);
    }

    void meth2() {
        int a = 20;
        System.out.println(78 - a);

    }

    void meth3() {
        int a = 30;
        ClassA obj1 = new ClassA();
        System.out.println(89 + 1);
        obj1.meth1();
        System.out.println(10);
    }

    void meth4() {
        int a = 10;
        System.out.println(89);
        System.out.println(85);
    }

    void meth5() {
        System.out.println(77);
        ClassA obj1 = new ClassA();
        obj1.meth2();
        System.out.println(99);
    }

    public static void main(String args[]) {
        System.out.println("Start");
        ClassA aobj = new ClassA();
        aobj.meth3();
        System.out.println("End");
    }
}
