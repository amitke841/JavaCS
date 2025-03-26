package str;

public class t4 {
    //ט.כניסה: הפעולה מקבלת מחרוזת
    //ט.יציאה:מחרוזת חדשה בה החצאים של המחרוזת הפוכים
    public static String rearrangeString(String str) {
        String newStr = "";
        int length = str.length();
        int mid = length / 2;
        for (int i = mid; i < length; i++) {
            newStr += str.charAt(i);
        }

        if (length % 2 != 0) {
            newStr += str.charAt(mid);
        }

        for (int i = 0; i < mid; i++) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
}
