class shape 
{
     void draw() 
     {
         System.out.println("Can,t say");
     }
}
 class square extends shape 
 { 
    void draw()
     {
         System.out.println("Square"); 
        } 
    } 
    class demo 
    { 
        public static void main(String[] agrs)   
        { 
            shape re=new square(); 
            shape S=new shape();
            S.draw();
            re.draw();
        } 
    }