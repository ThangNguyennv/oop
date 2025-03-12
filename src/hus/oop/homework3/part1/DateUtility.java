package hus.oop.homework3.part1;

public class DateUtility {
    public static final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Bảng giá trị theo thế kỷ: 1700, 1800, 1900, 2000, 2100, 2200, 2300, 2400, ...
    // Giá trị theo bảng lặp lại: 4, 2, 0, 6,...
    private static int getCenturyCode(int year) {
        int century = year / 100;
        // Tính vị trí trong bảng (với 17, 18, 19, 20,...)
        // Các giá trị: 17->4, 18->2, 19->0, 20->6, 21->4, 22->2, 23->0, 24->6,...
        int mod = (century - 17) % 4;
        int[] centuryCodes = {4, 2, 0, 6};
        return centuryCodes[mod];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int maxDay = daysInMonths[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        // Sử dụng bảng tháng tùy thuộc vào năm nhuận hay không
        int[] monthCodes;
        if (isLeapYear(year)) {
            // Bảng tháng cho năm nhuận
            monthCodes = new int[]{6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        } else {
            // Bảng tháng cho năm không nhuận
            monthCodes = new int[]{0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        }
        int centuryCode = getCenturyCode(year);
        int lastTwoDigits = year % 100;
        int quotient = lastTwoDigits / 4;
        int sum = centuryCode + lastTwoDigits + quotient + monthCodes[month - 1] + day;
        return sum % 7;
    }

    public static String printDate(int year, int month, int day) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayOfWeek = getDayOfWeek(year, month, day);
        return weekDays[dayOfWeek] + " " + day + " " + strMonths[month - 1] + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2011)); // false
        System.out.println(isLeapYear(2012)); // true

        System.out.println(isValidDate(2012, 2, 29)); // true
        System.out.println(isValidDate(2011, 2, 29)); // false
        System.out.println(isValidDate(2099, 12, 31)); // true
        System.out.println(isValidDate(2099, 12, 32)); // false

        System.out.println(getDayOfWeek(1982, 4, 24)); // 6: Saturday
        System.out.println(getDayOfWeek(2000, 1, 1));  // 6: Saturday
        System.out.println(getDayOfWeek(2054, 6, 19)); // 5: Friday
        System.out.println(getDayOfWeek(2012, 2, 17)); // 5: Friday

        System.out.println(printDate(2012, 2, 14)); // Tuesday 14 Feb 2012
    }
}
