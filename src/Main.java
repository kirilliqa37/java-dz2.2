public class Main {
    public static void main(String[] args) {
        int amount_on_account = 100;   // сумму на счете начальная
        int replenishment_amount = 1002;  // пополнение
        int total = amount_on_account + replenishment_amount;  // сумма на стчете итоговая





        int bonus;
        if (replenishment_amount >= 1000) {
            bonus = replenishment_amount / 100;
        }else {
            bonus = 0;
        }
        System.out.println(bonus);
        System.out.println(total + bonus);


    }
}
