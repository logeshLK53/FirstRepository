package JavaCore;

import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;

import javax.sql.rowset.Predicate; 
 interface def{
    public default void meow() {
        System.out.println("Meow Meow");
    }
}
public class DefaultDemo implements def{
    IntPredicate predicate = (value) -> {
        if(value % 2 == 0) {
            return true;
        }
        return false;
    };
    static DoubleFunction<Hello> df = new DoubleFunction<Hello>() {

        @Override
        public Hello apply(double value) {
            if(value == 0) {
                return null;
            }
            return new Hello();
        } 
    };
    public static void main(String[] args) {
        Hello c = df.apply(10);
        System.out.println(c.h);
    }
}
class Hello
{
    static def h= new DefaultDemo();
}