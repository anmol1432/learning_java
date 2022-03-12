package com.company;

public class Cwh_27_Array {
    public static void main(String[] args) {
        String[] name = {"Anmol", "Singh", "Buttar", "dhardeo"};
        int[] num = {1, 2, 4, 3, 5};
        int[][] flats = {{1, 2, 3}, {4, 5, 6}};
        float[] mark = {25.4f, 25.3f, 2.2f, 25.1f,3.3f};

//        Array traverasl
//        for (int i=0; i<name.length; i++){
//            System.out.println("name in db : " + name[i]);
//            System.out.println("name in db : " + name[i]);
//        }

//        displaying array using (for each loop)
//        int totalFalts = 0;
//        for (int[] item : flats) {
//            for (int i = 0; i < item.length; i++){
//            totalFalts = item[i] + totalFalts;
//            System.out.println( " the current total ius  "+totalFalts);
//        }
//    }
//   the sum of marks
//        float total=0.0f;
//        for (int i =0; i<mark.length; i++){
//            total += mark[i];
//        }
//        float avg = total / mark.length;
//        System.out.println("the total is :" + total + "& average is : " + avg);

//   find element in array
//        int finding =2;
//        int[] list={1, 2, 3, 4};
//
//        for (int j = 0; j<list.length; j++){
//            if (list[j]==finding) {
//                System.out.println("Element finded : " + finding);
//            }
//        }


//      progarm to reverse an array
//         float[] mark = {25.4f, 25.3f, 2.2f, 25.1f,3.3f};
//        float[] revrseArr = new float[mark.length];
//        for (int i=mark.length; i!=0;i--){
//            revrseArr[mark.length-i] =  mark[i-1];
//        }
//        for (float item: revrseArr) {
//            System.out.println("revrseArr { " +item + "}");
//        }

//       program to find maximum in arr
        int max=0;
        for (int n:num){
            if (n>max){
                max=n;
            }
        }
        System.out.printf("The max num in arr : %d",max );
//      program to sort element in array
//        int[] num = {1, 2, 5, 3, 4};
//        int[] newNum = new int[num.length];
//        int temp;
//        for (int i = 0; i < num.length-1; i++) {
//            if (num[i] > num[i+1] ){
//                temp=num[i]; //num[i] 5
//                num[i]=num[i+1]; //  num[i] = 3
//                num[i+1] = temp; // num[i+1] = 5
//            }
//        }
//        for (int item: num) {
//            System.out.println("arr { " +item + "}");
//        }
    }
}
