package implementation;

import myinterface.MyArray;

public class MyArrayImplementation
        implements MyArray {
    private int[] arr;
    private int index;

    public int[] getArr() {
        return arr;
    }

    public int getIndex() {
        return index;
    }
    public MyArrayImplementation(int size){
        arr = new int[size];
        index = 0;
    }
    @Override
    public void traverse(){
        System.out.println("printing elements");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    @Override
    public boolean insert(int element){
        boolean response = false;
        if(index != arr.length){
            arr[index] = element;
            index++;
            response = true;
        }
        return response;
    }
    @Override
    public boolean delete(){
        boolean response = false;
        if(index != 0){
            index--;
            response = true;
        }
        return response;
    }
    @Override
    public boolean search(int element){
        boolean response = false;
        for (int i = 0; i < index; i++) {
            if(arr[i] == element){
                response = true;
                break;
            }
        }
        return response;
    }
}
