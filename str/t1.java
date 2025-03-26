package str;

public class t1 {
    //ט.כניסה: הפעולה מקבלת מחרוזת - משפט
    //ט.יציאה: הפעולה מחזירה כמה אותיות סיום של מילה הן אותיות פתיחה של מילה אחרי
    public static int countMatchingPairs(String sentence) {
        int count = 0;
        for (int i = 1; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ') {
                if (sentence.charAt(i - 1) == sentence.charAt(i + 1)) {
                    count++;
                }
            }
        }
        return count;
    }
}
