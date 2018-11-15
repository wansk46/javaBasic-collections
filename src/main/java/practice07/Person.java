package practice07;

public class Person{

    public String Name;
    public int Age;

    public Person(String N,int A)
    {
        super();
        Age=A;
        Name=N;
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