public class Cat extends Animal {
    

   


    public Cat(String name, int age) {
        super(name, age);
        this.age=8;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }


   
      
}
