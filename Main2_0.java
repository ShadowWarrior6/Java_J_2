// Создайте абстрактный класс "Animal" с полями "name" и "age".
// Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
// Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
// Выведите на экран информацию о каждом объекте.
// Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
 



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class Main2_0 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> anClass=Class.forName("Dog");
        Class<?> aClass=Class.forName("Cat");
        Constructor<?>[]constructors=anClass.getConstructors();
        Constructor<?>[] constructor=aClass.getConstructors();        

        Object DOG=constructors[0].newInstance("Petya");
        Object CAT=constructor[0].newInstance("Vanya");
         System.out.println(DOG);
         System.out.println(CAT);
        Field []fields=DOG.getClass().getFields();
       Field []fields2=CAT.getClass().getFields();
        int tmp=fields[fields.length-1].getInt(DOG);
        fields[fields.length-1].setInt(DOG,tmp *2);
        int tmp2=fields2[fields2.length-1].getInt(CAT);
        fields2[fields2.length-1].setInt(CAT,tmp2 *2);
        System.out.println(DOG);
        System.out.println(CAT);
    }
    
}
