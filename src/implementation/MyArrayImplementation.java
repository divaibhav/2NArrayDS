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
}
