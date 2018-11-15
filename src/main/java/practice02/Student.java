package practice02;



class Student extends Person{
    public int Klass;
    public Student(String N,int A,int K)
    {
        super(N,A);
        Klass=K;
    }

    public int getklass(){return Klass;}
    public String introduce (){
        return String.format("I am a Student. I am at Class %d.",Klass);
    }
}
