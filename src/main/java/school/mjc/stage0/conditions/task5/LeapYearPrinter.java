package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
       int sum = year % 400 == 0 || year %4 == 0 && year % 100 != 0 ? 1 : 0;
        switch (sum) {
            default:
                System.out.println("out of range");
                break;
            case 0:
                System.out.println("not leap");
                break;
            case 1:
                System.out.println("leap");
                break;
        } 
    }
}
