package com.animax.demo.constants.old.IBMcode;

public class IbmFindMinMax {

    public static void main(String[] args) {

        int[] arr = new int[] {-1,0,-1,2,3,-1,99,86};
        int length = arr.length;
        int temp =0;
        for(int i=0; i<length-1;i++) {
            for(int j=i+1; j<length;j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Min element =" +arr[0]);
        System.out.println("Max Element = "+arr[length-1]);

    }

    /*List<Employee> empList;

    String name, float salary;

    descList = empList.stream().sorted(Comparator.comparing(Employee::salary), Comparator.reverseOrder())
    .collect(Collectors.toList());


    Program to find the minimum (or maximum) element of an array
        */
}
