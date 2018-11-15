package practice07;

class Student extends Person{
    public int Klass;
    public Student(String N,int A,int K)
    {
        super(N,A);
        Klass=K;
    }

    public int getKlass(){return Klass;}
    public String introduce (){
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.",Name,Age,Klass);
    }
    public String introduceWith(){
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Jerry.",Name,Age,Klass);
    }
}