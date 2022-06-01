
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.3) {
            heartyMeals++;
            card.takeMoney(4.3);
            return true;
        } else {
            return false;
        }
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            this.affordableMeals = affordableMeals + 1;
            this.money = money + 2.5;
            return payment - 2.5;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            this.heartyMeals = heartyMeals + 1;
            this.money = money + 4.3;
            return payment - 4.3;
        } else {
            return payment;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
