package com.animax.demo.constants.old.amex;

// i am a fox
// I Am A Fox
public class Problem {
    public static void main(String[] args) {
        String input = "hello world, i am a fox.";
        String output;
        String[] splitArray = input.split(" ");

        for (int i = 0; i < splitArray.length; i++) {
            splitArray[i] = Character.toUpperCase(splitArray[i].charAt(0)) + splitArray[i].substring(1);

        }
        output = String.join(" ", splitArray);
        System.out.println(output);


        main2();
    }

        public static void main2() {
            String input = "hello world, i am a fox.";
            String capitalized = capitalizeFirstLetter(input);
            System.out.println(capitalized); // Output: Hello World, I Am A Fox.
        }

        public static String capitalizeFirstLetter(String input) {
            StringBuilder result = new StringBuilder();
            boolean capitalizeNext = true;

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (capitalizeNext) {
                        result.append(Character.toUpperCase(c));
                        capitalizeNext = false;
                    } else {
                        result.append(Character.toLowerCase(c));
                    }
                } else {
                    result.append(c);
                    if (c == ' ') {
                        capitalizeNext = true;
                    }
                }
            }

            return result.toString();
        }
}


/*
DB Concepts
empid empname depid salary
1		A		X	5000
2		B		Y	80000
3		C		Z	50000
4		D		X	50000
5		E		Y	80000
6		F		Z	50000
7		G		X	80000
8		H		Y	50000
9		I		Z	80000
 */
//find sal by each dept


// SELECT SUM(SAL) from EMPLOYEE GROUP BY deptid















