package annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnotation.MyNotifications.class)
public @interface MyAnnotation {
    String value() default "";

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD})
    @interface MyNotifications {
        MyAnnotation[] value();
    }
}
