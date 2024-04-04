public class Dog extends Animal {
      

   


    public Dog(String name, int age) {
        super(name, age);
        this.age=4;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }


   
       
}
