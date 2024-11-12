import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList Tasks below: ");
        System.out.println("Task Number 1:");
        System.out.println("a) Using ArrayList, add seven colors and print them");
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Turquoise");
        colorList.add("Beige");
        colorList.add("Navy");
        colorList.add("Taupe");
        colorList.add("Ivory");
        colorList.add("Silver");
        colorList.add("Coral");

        for (String color : colorList) {
            System.out.println(color);
        }

        System.out.println("b) Change the first element of colorList into another value");
        colorList.set(0, "White");
        colorList.forEach(color->{
            System.out.println(color);
        });

        System.out.println("c) Make a program for printing elements of an ArrayList and their size");
        colorList.forEach(color->{
            System.out.println(color + " and size is " + color.length());
        });

        System.out.println("\nTask Number 2:");
        System.out.println("a) Create an ArrayList filled with any data of your choice. Then, search for an element in " +
                "the collection based on a specific value. Display a message on the console indicating whether the " +
                "searched element was found or not.");

        ArrayList<Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(3.2);
        doubleNumbers.add(4.5);
        doubleNumbers.add(7.6);
        doubleNumbers.add(8.8);
        doubleNumbers.add(4.4);

        double searchNumber = 199.99;
        if(doubleNumbers.contains(searchNumber)){
            System.out.println("Yes, the searchNumber " + searchNumber + " is in list");
        }
        else{
            System.out.println("Nope, the searchNumber " + searchNumber + " is not in the list");
        }
        System.out.println("Given the list below: ");
        doubleNumbers.forEach(number ->{
            System.out.println(number);
        });

        System.out.println("B) Make a copy of the ArrayList");
        ArrayList<Double> doubleNumbersForClone = new ArrayList<>(doubleNumbers);
        System.out.println("Given the cloned list below: ");
        doubleNumbersForClone.forEach(numbersOnClonedArrayList ->{
            System.out.println(numbersOnClonedArrayList);
        });

        System.out.println("C) Write a program to shuffle the elements of the ArrayList");
        Collections.shuffle(doubleNumbersForClone);
        doubleNumbersForClone.forEach(shuffledNumbersOfClonedArrayList->{
            System.out.println(shuffledNumbersOfClonedArrayList);
        });
        System.out.println("\nTask Number 3:");
        System.out.println("a) Write a method to arrange the elements of an ArrayList in reverse order.");
        ArrayList<Integer> integerNumbers = new ArrayList<>();
        integerNumbers.add(1);
        integerNumbers.add(2);
        integerNumbers.add(3);
        integerNumbers.add(4);
        integerNumbers.add(5);
        integerNumbers.add(6);
        integerNumbers.add(7);

        System.out.println("Given below non-reversed ArrayList:");
        integerNumbers.forEach(nonReversed ->{
            System.out.println(nonReversed);
        });

        System.out.println("Given below reversed ArrayList:");
        Collections.reverse(integerNumbers);
        integerNumbers.forEach(reversed ->{
            System.out.println(reversed);
        });

        System.out.println("\nb) Write a method to extract a portion of the ArrayList based on given parameters " +
                "(int firstIndex, int lastIndex).");
        ArrayList<String> listOfString = new ArrayList<>();
        listOfString.add("Serikpay");
        listOfString.add("Qazaqpay");
        listOfString.add("Uzbekpay");
        listOfString.add("Qirgizpay");
        listOfString.add("Turkmenpay");
        List<String> subList = portionExtraction(listOfString, 2, 5);
        subList.forEach(subListElement->{
            System.out.println(subListElement);
        });

        System.out.println("\nTask number 4:");
        System.out.println("a) Write a method that compares two ArrayList collections element by element and writes " +
                "the result to another collection. " +
                "Example: [\"Green\", \"Red\"] & [\"Green\", \"Black\"] -> result: [\"Yes\", \"No\"];");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Tuzikpay");
        list1.add("Trotrsky");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Qonday eee");
        list2.add("Sheshengdi balasi");

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < (Math.max(list1.size(), list2.size())); i++)
        {
            if(list1.get(i).equals(list2.get(i))){
                result.add("Yes");
            }else{
                result.add("No");
            }
        }
        System.out.println(result);

        System.out.println("\nTask number 5:");
        System.out.println("a) Write a method to swap two elements in an ArrayList.");
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ferrari La Ferrari");
        cars.add("Lambo");
        System.out.println("Before swap:");
        System.out.println(cars);
        Collections.swap(cars, 0,1);
        System.out.println("After swap:");
        System.out.println(cars);
        System.out.println("b) Write a method to merge two ArrayList collections.");
        ArrayList<String> houses = new ArrayList<>();
        houses.add("House Rubin");
        houses.add("House Baldoro");
        System.out.println(mergeThat(cars, houses));
        System.out.println("\nc) Create an ArrayList with a capacity to hold only 3 elements, and after adding 3 elements, " +
                "increase the size of the collection to hold 6 elements.");
        ArrayList<Float> floatNumbers = new ArrayList<>();
        floatNumbers.ensureCapacity(3);
        floatNumbers.add(21f);
        floatNumbers.add(32f);
        floatNumbers.add(55f);
        System.out.println("Before increasing capacity");
        System.out.println(floatNumbers);
        System.out.println(floatNumbers.size());
        floatNumbers.ensureCapacity(6);
        floatNumbers.add(241f);
        floatNumbers.add(241f);
        floatNumbers.add(241f);
        System.out.println("After increasing capacity");
        System.out.println(floatNumbers);
        System.out.println(floatNumbers.size());
    }

    public static List<String> portionExtraction(ArrayList<String> list, int firstIndex, int lastIndex){
        if(firstIndex < 0 || lastIndex > list.size() || firstIndex > lastIndex){
            throw new IllegalArgumentException("Invalid index range");
        }
        return new ArrayList<>(list.subList(firstIndex, lastIndex));
    }

    public static List<String> mergeThat(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
}