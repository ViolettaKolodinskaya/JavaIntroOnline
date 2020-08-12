package module4;

//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
//инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {
    private String name;
    private int age;

    public Test2(){
        name=null;
        age=0;
    }

    public Test2(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
}
