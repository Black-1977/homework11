public class Main {
    public static void main(String[] args) {

        // Part 1
        System.out.println("Задание 1");
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        // Part 2
        System.out.println("Задание 2");
        int yearOfIssue = 2015;
        int clientOS = 0;
        System.out.println(appVersion(clientOS, yearOfIssue));
        System.out.println();

        // Part 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int deliveryTime = daysToDeliver(deliveryDistance);

        if (deliveryTime == 0) {
            System.out.println("Доставкв не осуществляется");
        } else {
            System.out.println("Для доставки потребуется дней: " + deliveryTime);
        }
        System.out.println();

    }

    // Part 1
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year > 1584) {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        leapYear = true;
                    } else {
                        leapYear = false;
                    }
                } else {
                    leapYear = true;
                }
            } else {
                leapYear = false;
            }
        } else {
            leapYear = false;
        }
        return leapYear;
    }

    // Part 2
    public static String appVersion(int clientOS, int year) {
        String version = "";
        if ((year >= 2015) && (clientOS == 0)) {
            version = "Установите версию приложения для iOS по ссылке";
        }
        if ((year >= 2015) && (clientOS == 1)) {
            version = "Установите версию приложения для Android по ссылке";
        }
        if ((year < 2015) && (clientOS == 0)) {
            version = "Установите упрощённую версию приложения для iOS по ссылке";
        }
        if ((year < 2015) && (clientOS == 1)) {
            version = "Установите упрощённую версию приложения для Android по ссылке";
        }
        return version;
    }

    // Part 3
    public static int daysToDeliver(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance <= 100) {
            deliveryTime++;
            if (deliveryDistance > 20) {
                deliveryTime++;
                if (deliveryDistance > 60) {
                    deliveryTime++;
                }
            }
        }
        return deliveryTime;
    }
}