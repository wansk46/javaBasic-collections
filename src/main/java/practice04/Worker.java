package practice04;

class Worker extends Person{
    public int Klass;
    public Worker(String N,int A)
    {
        super(N,A);
    }

    public String introduce (){
        return String.format("My name is %s. I am %d years old. I am a Worker. I have a job.",Name,Age);
    }
}
