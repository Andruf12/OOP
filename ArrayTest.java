import static org.junit.Assert.*;
import org.junit.Test;
public class ArrayTest {

    @org.junit.Test
    public void Test_getElement() {
        Array arr = new Array(3);
        arr.SetElement(0,"Element 0");
        arr.SetElement(1,"Element 1");
        arr.SetElement(2,"Element 2");
        int validIndex = 1;
        String result = arr.GetElement(validIndex);
        assertEquals("Element 1", result);
    }
    @org.junit.Test
    public void Test_setElement() {
        Array arr = new Array(3);
        arr.SetElement(0,"Element 0");
        arr.SetElement(1,"Element 1");
        arr.SetElement(2,"Element 2");
        assertEquals("Element 0",arr.GetElement(0));
        assertEquals("Element 1",arr.GetElement(1));
        assertEquals("Element 2",arr.GetElement(2));
    }

    @org.junit.Test
    public void Test_сlutchArray() {
        Array arr=new Array(3);
        arr.SetElement(0,"1");
        arr.SetElement(1,"2");
        arr.SetElement(2,"3");
        Array arr2=new Array (3);
        arr2.SetElement(0,"4");
        arr2.SetElement(1,"5");
        arr2.SetElement(2,"6");
        Array Clutch = arr.СlutchArray(arr2);
        Array arr3=new Array (6);
        arr3.SetElement(0,"1");
        arr3.SetElement(1,"2");
        arr3.SetElement(2,"3");
        arr3.SetElement(3,"4");
        arr3.SetElement(4,"5");
        arr3.SetElement(5,"6");

        assertArrayEquals(arr3.arr, Clutch.arr);

    }

    @org.junit.Test
    public void Test_print() {
        Array arr=new Array(3);
        arr.SetElement(0,"1");
        arr.SetElement(1,"2");
        arr.SetElement(2,"3");
        arr.Print();
        String[] arr1={"1","2","3"};
        assertEquals(arr.arr,arr1);
    }
    @org.junit.Test
    public void Test_getElementOut() {
        Array arr = new Array(3);
        arr.SetElement(0,"Element 0");
        arr.SetElement(1,"Element 1");
        arr.SetElement(2,"Element 2");
        int validIndex = 6;
        String result = arr.GetElement(validIndex);
        String excepted=null;
        assertEquals(excepted, result);
    }
}