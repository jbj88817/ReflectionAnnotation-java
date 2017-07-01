package us.bojie.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by bojiejiang on 6/30/17.
 */

@Target(ElementType.FIELD)
//@Target(ElementType.METHOD)
//@Retention(RetentionPolicy.SOURCE) // in source but clear when compiled to binary code
//@Retention(RetentionPolicy.CLASS) // also in binary code
@Retention(RetentionPolicy.RUNTIME) // in the jvm


public @interface BindView {
//    int value();
    int age();
    String name();
}
