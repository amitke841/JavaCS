package str;

public class t3 {
    //ט.כניסה: הפעולה מקבלת מחרוזת
    //ט.יציאה: הפעולה מורידה את כל הרווחים
    public static String removeSpaces(String str) {
        String newStr = "";
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != ' ') {
                newStr += currentChar;
            }
        }
        
        return newStr;
    }

}
