public class Main {
    public static void main(String[] args) {
        int amountOnAccount = 100;   // сумму на счете начальная
        int replenishmentAmount = 1002;  // пополнение
        int total = amountOnAccount + replenishmentAmount;  // сумма на стчете итоговая

        int bonus;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        }else {
            bonus = 0;
        }
        System.out.println(bonus);
        System.out.println(total + bonus);


    }
}
