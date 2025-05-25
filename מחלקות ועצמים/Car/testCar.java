package Car;

public class testCar {

    //ט.כניסה: הפעולה מקבלת מערך מכוניות
    //ט.יציאה: הפעולה מחזירה את פרטי הרכב עם הקילומטרים המינימליים
    public static void printMinKmCar(Car[] arr) {
        Car c = arr[0];
        int minKm = c.total();
        Car minKmCar = c;
        for (int i = 1; i < arr.length; i++) {
            c = arr[i];
            if (c.total() < minKm) {
                minKm = c.total();
                minKmCar = c;
            }
        }
        System.out.println("The car with the minimum km is: " + minKmCar);
    }

    //ט.כניסה: הפעולה מקבלת מערך מכוניות
    //ט.יציאה: הפעולה מחזירה את ממוצע המחיר של רכבים עם 5 מקומות
    public static void averageSeats(Car[] arr) {
        int count = 0;
        double avg = 0;
        Car c = arr[0];
        for (int i = 0; i < arr.length; i++) {
            c = arr[i];
            if (c.getSeats() == 5) {
                count++;
                avg += c.getPrice();
            }
        }
        System.out.println("avg price of 5 seats cars is: " + (avg / count));
    }

    //ט.כניסה: הפעולה מקבלת מערך מכוניות
    //ט.יציאה: הפעולה מחזירה את כל הרכבים החשמליים שהמחיר שלהם מעל הממוצע
    public static void aboveAvg(Car[] arr) {
        double avg = 0;
        Car c = arr[0];
        for (int i = 0; i < arr.length; i++) {
            c = arr[i];
            avg += c.getPrice();
        }
        avg =  avg/arr.length;
        for (int i = 0; i < arr.length; i++) {
            c = arr[i];
            if (c.getPrice() > avg && c.getIsElectric()) {
                System.out.println("electric car " + i + " is above average");
            }
        }
    }

    //ט.כניסה: הפעולה מקבלת מערך מכוניות
    //ט.יציאה: הפעולה מחזירה את מספר הרכבים שעשו יותר מ-5000 קילומטרים בחודש מסוים
    public static int aboce5000km(Car[] arr, int month) {
        int count = 0;
        Car c = arr[0];
        for (int i = 0; i < arr.length; i++) {
            c = arr[i];
            if (c.getSpecificMonthKm(month) > 5000) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Car[] carsArray = new Car[10];
        for (int i = 0; i < carsArray.length; i++) {
            carsArray[i] = new Car();
        }

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].getIsElectric()) {
                System.out.println("car " + i + " is electric");
            }
        }

        printMinKmCar(carsArray);
        averageSeats(carsArray);
        aboveAvg(carsArray);
        System.out.println("number of cars with more than 5000 km in month 1: " + aboce5000km(carsArray, 1));

        Car c = carsArray[0];
        int maxSeats = c.getSeats();
        for (int i = 1; i < carsArray.length; i++) {
            c = carsArray[i];
            if (c.getSeats() > maxSeats) {
                maxSeats = c.getSeats();
            }
        }
        for (int i = 0; i < carsArray.length; i++) {
            c = carsArray[i];
            if (c.getSeats() == maxSeats) {
                System.out.println("car " + i + " has the maximum seats");
            }
        }


    }
}
