Create class Person with fields id, name, age and a method named introduce. Id is used to identify persons.
Method introduce should return string like this:

>My name is Tom. I am 21 years old.

Then create class Student to inherit class Person. There are fields id, name, age, klass and a method named introduce in class Student. Method introduce should return string like this:

>My name is Tom. I am 21 years old. I am a Student. I am at Class 2.

But field klass is an object rather than a number. Create class Klass with fields number and leader. But leader doesn't get assigned in the constructor. Then pass a Klass instance into the constructor of Student. Please refer to test cases.

Klass has a assignLeader method which receive a Student instance to assign the leader of the Klass. If Tom if the leader of the Klass, then calling return of method introduce to Tom should look like this:

>My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.

otherwise the method introduce should just bahave like before.

Klass also has a appendMember method which receive a Student instance to add a  student to this Klass.
If a student is not in the Klass, then assignLeader to the student will fail and return:

>It is not one of us.

and if so, the method introduce of Student should just bahave like before.

Then create class Teacher to inherit class Person. There are fields id, name, age, klass and a method named introduce in class Teacher. Method introduce should return string like this:

>My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.

If klass is null, then it will like this:

>My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.

This text from all subclasses of class Person

>My name is Tom. I am 21 years old.

should be returned by calling method introduce from class Person.
