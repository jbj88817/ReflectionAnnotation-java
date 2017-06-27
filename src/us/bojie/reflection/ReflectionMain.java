package us.bojie.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by bojiejiang on 6/26/17.
 */
public class ReflectionMain {

    public static void main(String[] args) throws Exception {

        /****************************** Get Object value ****************/

        // Got user class object

//        // 1
//        Class clazz = User.class;
//
//        // 2
//        Class<?> clazz2 = Class.forName("us.bojie.reflection.User");

        // 3
        User user = new User("Whatever", 10);
        Class<? extends User> clazz = user.getClass();

        // Got member varibles
        // getField for public, getDeclaredField for private
        Field fieldAge = clazz.getField("age");
//        Field fieldName = clazz.getField("name");
        Field fieldName = clazz.getDeclaredField("name");

        // Allow force reflection
        fieldName.setAccessible(true);
        String name = (String) fieldName.get(user);
        int age = fieldAge.getInt(user);

        System.out.println("name:" + name + ", age:" + age);

        /****************************** Modify Object value ****************/

        System.out.println("!!!!Modify Object value!!!!");
        fieldName.set(user, "Bojie");
        fieldAge.setInt(user, 20);

        System.out.println("name:" + user.getName() + ", age:" + user.getAge());

        /****************************** Method in Object ****************/

        System.out.println("!!!!Method in Object!!!!");

        // Get all methods
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//        }

        // Get eat method, 1 name of method, 2 type of params
        Method method = clazz.getMethod("eat", String.class, int.class);
        // Invoke method
        method.invoke(user, "Rice ", 10);
    }
}
