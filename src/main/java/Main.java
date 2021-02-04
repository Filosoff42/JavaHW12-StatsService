import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int total = service.calculateTotal(salesByMonth);
        int average = total / salesByMonth.length;
        int monthMaxSales = service.calculateMonthMaxSales(salesByMonth);
        int monthMinSales = service.calculateMonthMinSales(salesByMonth);
        int belowAverageSales = service.calculateBelowAverageSales(salesByMonth);
        int aboveAverageSales = service.calculateAboveAverageSales(salesByMonth);
        System.out.println("Сумма всех продаж: " + total);
        System.out.println("Средняя сумма продаж в месяц: " + average);
        System.out.println("Месяц пика продаж: " + monthMaxSales);
        System.out.println("Месяц минимума продаж: " + monthMinSales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + belowAverageSales);
        System.out.println("Количество месяцев с продажами выше среднего: " + aboveAverageSales);
    }
}
