package money;
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money b) {
        if (this.cents + b.cents >= 100) {
            Money newMoney = new Money(this.euros + b.euros + 1, (this.cents + b.cents) % 100);
            return newMoney;
        }
        Money newMoney = new Money(this.euros + b.euros, this.cents + b.cents);
        return newMoney;
    }

    public Money minus(Money b) {
        if (this.cents - b.cents < 0) {
            if (this.euros - b.euros <= 0) {
                Money newMoney = new Money(0, 0);
                return newMoney;
            }
            Money newMoney = new Money(this.euros - b.euros - 1, 100 + (this.cents - b.cents));
            return newMoney;
        }
        if (this.euros - b.euros <= 0 ) {
            if (this.cents - b.cents < 0) {
                Money newMoney = new Money(0, 100 + (this.cents - b.cents));
                return newMoney;
            }
            Money newMoney = new Money(0, this.cents - b.cents);
            return newMoney;
        }
        Money newMoney = new Money(this.euros - b.euros, this.cents - b.cents);
        return newMoney;
    }

    public boolean lessThan(Money b) {
        if (this.euros <= b.euros) {
            if (this.cents < b.cents) {
                return true;
            }
            return false;
        }
        return false;
    }
}