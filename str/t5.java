package str;

import java.util.Scanner;

public class t5 {
    //ט.כניסה: הפעולה קולטת שמות
    //ט.יציאה: הפעולה מחברת את כל השמות למחרוזת
    public static String inputNames() {
        Scanner reader = new Scanner(System.in);
        String str = "";
        System.out.println("Enter Names:");
        for (int i = 0; i < 7; i++) {
            String name = reader.next();
            str = str + name;
        }
        return str;
    }

    //ט.כניסה: הפעולה מקבלת מחרוזת
    //ט.יציאה: הפעולה מחזירה מחרוזת חדשה עם רווחים בין השמות
    public static String spaceStr(String str) {
        String newStr = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') { 
                newStr = newStr + " ";
            }
            newStr = newStr + currentChar;
        }
        return newStr;
    }

    public static void main(String[] args) {
        String connectedNames = inputNames();
        String spaceNames = spaceStr(connectedNames);

        System.out.println(connectedNames);
        System.out.println(spaceNames);
    }
}