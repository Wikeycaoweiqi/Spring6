import com.wikeystudy.spring6.bean.Car;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ Author：Wikey Cao
 * @ Date：30-10-2024
 * @ Description：
 */
public class Spring604Test {

    @Test
    public void getClassObject() throws Exception {
        Class carClass1 = Car.class;

        Class carClass2 = new Car().getClass();

        Class carClass3 = Class.forName("com.wikeystudy.spring6.bean.Car");
    }

    @Test
    public void getConstructorsByClass() throws Exception {
        Class carClass = Car.class;

        Constructor[] constructors = carClass.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor.getParameterCount());
        }

        Constructor[] declaredConstructors = carClass.getDeclaredConstructors();

        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.getParameterCount());
        }

//        Constructor constructor = carClass.getConstructor(String.class, int.class, String.class);
//        Car car1= (Car) constructorOne.newInstance("BMW", 10, "red");
//        System.out.println(car1);

        Constructor declaredConstructor = carClass.getDeclaredConstructor(String.class, int.class, String.class);
        declaredConstructor.setAccessible(true);
        Car car2 = (Car) declaredConstructor.newInstance("BENZ", 1, "BLACK");
        System.out.println(car2);
    }

    @Test
    public void getFieldsByReflect() throws Exception {
        Class carClass = Car.class;
        Car car = (Car) carClass.getDeclaredConstructor().newInstance();
        Field[] fields = carClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals("brand")) {
                field.setAccessible(true);
                field.set(car, "BENZ");
            }

            if (field.getName().equals("age")) {
                field.setAccessible(true);
                field.set(car, 2);
            }

            if (field.getName().equals("color")) {
                field.setAccessible(true);
                field.set(car, "Black");
            }
        }
        System.out.println(car);
    }

    @Test
    public void getMethodsByReflect() throws InvocationTargetException, IllegalAccessException {
        Car car = new Car();
        car.setAge(2);
        car.setBrand("benz");
        car.setColor("black");

        Class carClass = car.getClass();

        Method[] methods = carClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("run")) {
                method.setAccessible(true);
                method.invoke(car);
            }
        }
    }

}