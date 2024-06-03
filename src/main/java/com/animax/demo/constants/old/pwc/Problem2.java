package com.animax.demo.constants.old.pwc;

//// Input str = "applepen"
//// Input arr = ["apple", "pen", "sea", "car"]
//// Find if the string can be formed by a combination of a given array
public class Problem2 {
    public static void main(String[] args) {
        String str = "carpen1"; //applepen, seacar
        String[] strArray = {"apple", "pen", "sea", "car"};
        System.out.println(stringComb(str, strArray));
    }

    public static boolean stringComb(String str, String[] strArray) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                sb.append(strArray[i]);
                sb.append(strArray[j]);
                if (sb.toString().equals(str)) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}
