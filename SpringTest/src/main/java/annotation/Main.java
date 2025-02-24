package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        Class<TestClass> clazz = TestClass.class;
        Constructor<TestClass> constructor = clazz.getConstructor();
        TestClass testClass = constructor.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            MyAnnotation[] annotation = method.getAnnotationsByType(MyAnnotation.class);
            for (MyAnnotation notification : annotation) {
                System.out.println(notification.value());
            }

        }
        System.out.println("-------------------------");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            field.set();
            MyAnnotation[] annotation = field.getAnnotationsByType(MyAnnotation.class);
            for (MyAnnotation notification : annotation) {
                System.out.println(notification.value());
            }

        }

    }
}
