public class Foo {

    private Integer myPrivateInt = null;

    public Foo(int myPrivateInt) {
        this.myPrivateInt = myPrivateInt;
    }

    private String myPrivateMethod() {
        return "Inside my private method.";
    }
}
