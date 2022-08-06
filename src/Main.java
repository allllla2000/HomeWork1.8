import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //задание 1
        int currentYear = 2011;
        System.out.println("Задание 1");
        calculateLeapYear(currentYear);


        //задание 2
        System.out.println("Задание 2");
        int clientOS = 0;
        int deviceYear = 2022;
        getYourVersion(clientOS, deviceYear);

        //задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        calculateDeliveryDays(deliveryDistance);


    }

    public static void calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }

    }

    public static int getYourVersion(int clientOS, int deviceYear) {
        if (clientOS == 0 && deviceYear < 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && deviceYear == 2022) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && deviceYear < 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && deviceYear == 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша OS не обслуживается");
        }
        return clientOS;
    }


    public static int calculateDeliveryDays(int deliveryDistance) {
        
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет 3 дня");
        } else {
            System.out.println("Доставка на это расстояние не прозводится");
        }
        return deliveryDistance;
    }
}



