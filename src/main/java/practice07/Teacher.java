package practice07;

class Teacher extends Person{
    public Teacher(String N,int A,Klass)
    {
        super(N,A, Klass);

    }

    public int getKlass(){return Klass;}

    public String introduce (){
        if( Klass>0)
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.",Name,Age,Klass);
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.",Name,Age);
    }
}
