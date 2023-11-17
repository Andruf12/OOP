public class ExtendedArray extends Array {

    public ExtendedArray(int length) {
        super(length);
    }
    public void Reverse() {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    @Override
    public void Print() {
        super.Print();
    }
}
