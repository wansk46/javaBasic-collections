package practice03;

class Worker extends Person{
    public int Klass;
    public Worker(String N,int A)
    {
        super(N,A);
    }

    public String introduce (){
        return String.format("I am a Worker. I have a job.");
    }
}
