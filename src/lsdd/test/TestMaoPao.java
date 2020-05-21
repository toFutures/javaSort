package lsdd.test;

import lsdd.sorts.MaoPaoSort;

public class TestMaoPao {
    public static void main(String[] args) {
        int[] array= {7,4,8,6,1,9};
        MaoPaoSort maoPaoSort=new MaoPaoSort();
        int[] new_array=maoPaoSort.sort(array);
        for (int i:new_array
             ) {
            System.out.println(i);
        }
    }
}
