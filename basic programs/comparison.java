public class comparison
{
    public static void main(String[] args) {
        Double x=new Double(234.686);
        Long y=new Long(766454);
        System.out.println("objects are not equal, hence it returns "+x.equals(y));
        System.out.println(("objects are equal,hence it returns "+x.equals(234.686)));
    }
}
