package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int changer;
        String curr_name;
        int curr_id;
        //Student[] arr = new Student[];
        List<Student> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1 - Add new object to array");
            System.out.println("2 - Sort array");
            System.out.println("3 - Merge sort");
            System.out.println("4 - Show array");
            System.out.println("0 - Exit");
            changer = sc.nextInt();
            switch (changer) {
                case 1:
                    System.out.println("Enter name");
                    curr_name = sc.next();
                    System.out.println("Enter ID");
                    curr_id = sc.nextInt();
                    Student obj = new Student(curr_name, curr_id);
                    arr.add(obj);
                    break;
                case 2:
                    if(arr.size() != 0){
                        bubble_sort_array(arr, arr.size());
                    }
                    else{
                        System.out.println("Array is empty");
                    }
                    break;
                case 3:
                    if(arr.size() !=0){
                        mergeSort(arr, arr.size());
                    }
                    else{
                        System.out.println("Array is empty");
                    }
                    break;
                case 4:
                    if(arr.size() != 0) {
                        for (int i = 0; i < arr.size(); i++) {
                            arr.get(i).show();
                            System.out.println();
                        }
                    }
                    else{
                        System.out.println("Array is empty");
                    }
                    break;

                case 0:
                    System.out.println("See you later");
                    System.exit(0);
            }
        }
    }

    public static void bubble_sort_array(List<Student> arr, int size){
        Student temp;
        for(int i = 0; i < size-1; i++){
            for(int j = i+1; j < size; j++){
                if(arr.get(i).getId() > arr.get(j).getId()){
                    temp = arr.get(i);
                    arr.set(i, (arr.get(j)));
                    arr.set(j, temp);
                }
            }
        }
    }

    public static void mergeSort(List<Student> arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = (n / 2);

        List<Student> l = new ArrayList<>(mid);
        List<Student> r = new ArrayList<>(n - mid);

        for (int i = 0; i < mid; i++) {
            l.add(arr.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(arr.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    public static void merge(
            List<Student> arr, List<Student> l, List<Student> r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i).getId() < r.get(j).getId()) {
                arr.set(k++, l.get(i++));
            }
            else {
                arr.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            arr.set(k++, l.get(i++));
        }
        while (j < right) {
            arr.set(k++, r.get(j++));
        }
    }
}
