package com.teachmeskills.lesson11.task1;

/**
 * This class contain methods for "String"-objects.
 */

public class DocumentSearcher {
    public static void main(String[] args) {
        String str1 = "2024-Doc-0209-COM-1a2b";
        System.out.println(datePrinter(str1));
        System.out.println(docPrintWithoutChar(str1));
        System.out.println(printChars(str1));
        System.out.println(letters(str1));
        checkABC(str1);
        checkPerf555(str1);
        checkPost1a2b(str1);
    }

    public static String datePrinter(String docName) {
        return docName.substring(0, 4) + " " + docName.substring(9, 13);
    }

    public static String docPrintWithoutChar(String docName) {
        return docName.replace("Doc", "***").replace("COM", "***");
    }

    public static String printChars(String docName) {
        return docName.toLowerCase().substring(5, 8) + "/" + docName.toLowerCase().substring(14, 17) + "/" +
                docName.toLowerCase().charAt(19) + "/" + docName.toLowerCase().charAt(21);
    }

    public static String letters(String docName) {
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:");
        sb.append(docName.toUpperCase().substring(5, 8)).append("/").append(docName.toUpperCase().substring(14, 17)).append("/").append(docName.toUpperCase().charAt(19)).append("/").append(docName.toUpperCase().charAt(21));
        return sb.toString();
    }

    public static void checkABC(String docName) {
        if (docName.contains("abc") || docName.contains("ABC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void checkPerf555(String docName) {
        if (docName.startsWith("555")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void checkPost1a2b(String docName) {
        if (docName.endsWith("1a2b")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
