class students
{
    int id;
    String name;
    int age;
    students(int i,String n)
    {
        id=i;
        name=n;
    }
    students(int i, String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
}
class Student 
{
    public static void main(String[] args)
    {
        students s1= new students(12,"rama",20);
        students s2= new students(13,"Shyam");
        s1.display();
        s2.display();
    }
}