// Создайте абстрактный класс "Animal" с полями "name" и "age".
// Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
// Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
// Выведите на экран информацию о каждом объекте.
// Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main{
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException, NoSuchMethodException {
//    Class<?>anClass =Animal.class;
//    //Class<?>aClass=Class.forName("Animal");
//    //Field[]fields=anClass.getDeclaredFields();
// //    for(Field field : fields){
// //     System.out.println("Имя " + field.getName());
// //    }

//    //Constructor[] constructors=anClass.getConstructors();
//    Object anInstance=constructors[0].newInstance("Animal");
//    System.out.println(anInstance);

//    // Field dognameField=anClass.getDeclaredField("name");
//    // dognameField.set(anInstance,"Sasha");

//    // Field dogageFiled=anClass.getDeclaredField("age");
//    // dogageFiled.setAccessible(true);
//    // dogageFiled.set(anInstance, 4);
//    // Method dogdisplayMethod=anClass.getDeclaredMethod("displayInfo");
   // dogdisplayMethod.invoke(anInstance);


   // Method displayInfoMethod = anClass.getDeclaredMethod("displayInfo");
   // displayInfoMethod.invoke(anInstance);
   
    }
}