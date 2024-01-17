package money;

public class MoneyTest {
    public static void main(String[] args) {
        Money a = new Money(5, 0);
        Money b = new Money(5, 0);
        
        System.out.println(a.lessThan(b));
    }
}
