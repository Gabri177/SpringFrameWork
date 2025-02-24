package annotation;

public class TestClass {

    @MyAnnotation("private String name")
    private String name;

    @MyAnnotation("Hi")
    @MyAnnotation("Hi2")
    @MyAnnotation("Hi3")
    public void sayHello() {
        System.out.println("Hello");
    }

    @MyAnnotation("Hello")
    public void sayHi() {
        System.out.println("Hi");
    }
}
