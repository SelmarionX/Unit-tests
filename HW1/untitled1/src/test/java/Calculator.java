public class Calculator {
    public static void main(String[] args) {
        float sum = calculateDiscount(400, 10);
        System.out.println("Сумма покупки: " + sum);
    }

    public static float calculateDiscount(float sum, int percent) {
        assert sum >= 0 : "Ошибка! Сумма не может быть отрицательной";
        assert percent >= 0 : "Ошибка! Скидка не может быть отрицательной";
        if (sum < 0) {
            throw new ArithmeticException();
        }
        if (percent < 0) {
            throw new ArithmeticException();
        }
        float result = (sum / 100) * (100 - percent);
        return result;
    }
}