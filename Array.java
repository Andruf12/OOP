import java.util.Objects;

public class Array {
    String[] arr;

    public Array(int length) {
        arr = new String[length];
    }

    public String GetElement(int k) {
        if (k >= 0 && k <= arr.length) {
            return arr[k];
        } else {
            return null;
        }
    }

    public void SetElement(int k, String m) {
        if (k >= 0 && k < arr.length) {
            arr[k] = m;
        }
    }

    public Array СlutchArray(Array arr2) {
        int length = arr.length + arr2.arr.length;
        Array arr3 = new Array(length);
        for (int i = 0; i < arr.length; i++) {
            arr3.SetElement(i, arr[i]);
        }
        for (int i = 0; i < arr2.arr.length; i++) {
            arr3.SetElement(i + arr.length, arr2.arr[i]);
        }
        return arr3;

    }

    public Array Merge(Array arr2) {
        int length = arr.length + arr2.arr.length;
        Array arr3 = new Array(length);
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(arr2.arr[i])) {
                arr3.SetElement(i, arr[i]);
            }
            for (int l = 0; l < arr.length; l++){
                arr3.SetElement(l + arr.length, arr2.arr[l]);
            }

        }
        return arr3;
    }

    public void Print() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                System.out.print(GetElement(i) + " ");
            }

        }
        System.out.print("\n");
    }
}





