
public class JavaTest {
    public static void main(String[] args) {
        Base sub_instance = new Sub();
        System.out.println(sub_instance.var);
        sub_instance.method();
    }
}
class Base{
    String var = "Base var";
    public void method(){
        System.out.println("Base method");
    }
}
class Sub extends Base{
    String sub_var = super.var;
    @Override
    public void method() {
        super.method();
    }
}