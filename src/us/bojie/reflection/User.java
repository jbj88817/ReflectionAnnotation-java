package us.bojie.reflection;

/**
 * Created by bojiejiang on 6/26/17.
 */
public class User {

    private String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(String eat, int age) {
        System.out.println(eat + "very tasty " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
