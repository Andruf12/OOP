
public class Main {
    public static void main(String[] args) {
    Array arr=new Array(3);
    arr.SetElement(0,"Viktor");
    arr.SetElement(1,"Evgeniy");
    arr.SetElement(2,"Sasha");
    Array arr2=new Array (3);
    arr2.SetElement(0,"Masha");
    arr2.SetElement(1,"Natasha");
    arr2.SetElement(2,"Sasha");

    arr.Print();
    arr2.Print();

    Array Clutch = arr.СlutchArray(arr2);
    Clutch.Print();
    Array Merge = arr.Merge(arr2);
    Merge.Print();

    ExtendedArray newArray = new ExtendedArray(3);
    newArray.SetElement(0,"masha");
    newArray.SetElement(1,"petya");
    newArray.SetElement(2,"georgiy");
    System.out.println("Изначальный массив");
    newArray.Print();
    newArray.Reverse();
    System.out.println("Реверсивный массив");
    newArray.Print();















    }
}