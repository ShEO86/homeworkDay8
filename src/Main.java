public class Main {
    public static void main(String[] args) {
    int deliveryDistance = 95;
    int days = deleveryDays(deliveryDistance);
        if (days != 0) {
            System.out.printf("Потребуется дней: %d", days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static int deleveryDays(int dist) {
        int day = 1;
        if (dist > 80) {
            day = 0;
            return day;
        } else {
            for (; dist >= 20; dist -= 20) {
                day++; // Перенес внутрь цикла, из скобок, т.к ругался, мол цикл пустой
            }
        }
    return day;
    }
}