class Student
{  
    int rollno;  
    String name,course;  
    float fee;  
    Student(int rollno,String name,String course)
    {  
    this.rollno=rollno;  
    this.name=name;  
    this.course=course;  
    }  
    Student(int rollno,String name,String course,float fee)
    {  
    this(rollno,name,course);
    this.fee=fee; 
    }
//Rule: Call to this() must be the first statement in constructor.
    void display()
    {
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }  
}          
class This_reuse_constructor_from_constructor 
{
    public static void main(String args[])
    {  
    Student s1=new Student(111,"ankit","java");  
    Student s2=new Student(112,"sumit","java",6000);  
    s1.display();  
    s2.display();  
    }    
}
