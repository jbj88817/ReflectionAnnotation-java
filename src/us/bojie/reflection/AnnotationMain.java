package us.bojie.reflection;

import java.lang.reflect.Field;

/**
 * Created by bojiejiang on 6/30/17.
 */
public class AnnotationMain {

    public static void main(String[] args) throws Exception {

        // 1. Create object
        User user = new User();

        // 2. get user's binary
        Class clazz = user.getClass();

        // 3. get name via reflection
        Field fieldName = clazz.getDeclaredField("name");
        Field fieldAge = clazz.getDeclaredField("age");
        fieldName.setAccessible(true);
        fieldAge.setAccessible(true);

        BindView annotation = fieldName.getAnnotation(BindView.class);
        if (annotation != null) {
            String name = annotation.name();
            int age = annotation.age();

            System.out.println(user);
            fieldName.set(user, name);
            fieldAge.set(user, age);
            System.out.println(user);

        } else {
            System.out.println("empty annotation");
        }
    }
}
