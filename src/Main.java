public class Main {
    public static void main(String[] args) {
        //задание 1
        int currentYear = 2022;
        System.out.println("Задание 1");
        calculateLeapYear(currentYear);

        //задание 2
        System.out.println("Задание 2");
        int clientOS = 1;
        getYourVersion(clientOS, currentYear);

        //задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        calculateDeliveryDays(deliveryDistance);


    }

    public static void calculateLeapYear(int year) {
        if ((year % 4 == 0) && (year % 400) == 0) {
            System.out.println("Год " + year + " високосный");
        } else if (year % 100 != 0) {
            System.out.println("Год " + year + " не високосный");
        }

    }

    public static int getYourVersion(int clientOS, int deviceYear) {
        if (clientOS == 0) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }


        }
        return clientOS;
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;

        if (deliveryDistance > 20) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        return deliveryDistance;

    }
}



