public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int year = 2000;
        checkYear(year);

        // Задача 2
        System.out.println("Задача 2");
        int clientOS = 1;
        installOS(year, clientOS);

        // Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 15;
        informTime(deliveryDistance);


    }
    private static void checkYear (int year){

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year+ " год является високосным");

        }else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void installOS (int clientDeviceYear, int clientOS){
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    private static void informTime (int deliveryDistance){
        int time = 1;
        if (deliveryDistance > 20){
            time++;
        }
        if (deliveryDistance > 60){
            time++;
        }
        System.out.println("Потребуется дней: " + time);
    }
}