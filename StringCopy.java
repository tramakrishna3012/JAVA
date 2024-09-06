public class StringCopy {
    String str;
    public StringCopy(String str) {
        this.str = str;
    }
    public StringCopy(StringCopy sc) {
        this.str = sc.str;
    }
    public static void main(String[] args) {
        StringCopy s1 = new StringCopy("Hello");
        StringCopy s2 = new StringCopy(s1);
        System.out.println(s1.str);
        System.out.println(s2.str);
    }
}