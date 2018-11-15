package practice01;

public class Person{
    private String Name;
    private int Age;

    public Person(String N, int A)
    {
        Name=N;
        Age=A;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String introduce (){
        return String.format("My name is %s. I am %d years old.",Name,Age);
    }
}
