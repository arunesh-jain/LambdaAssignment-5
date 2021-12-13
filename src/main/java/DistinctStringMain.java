import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctStringMain {

    public static List<String> getDistinctStrings(List<String> stringList){

        Function<List<String>, List<String>> distinctStrings = string -> string.stream()
                .distinct()     // It is used to getting distinct elements
                .sorted()       // It is used for sorting the list
                .collect(Collectors.toList()); // collecting as a list
        return distinctStrings.apply(stringList);
    }
    public static void main(String[] arguments) {

        List<String> list= new ArrayList<>();
        System.out.println("Enter a String : ");
        Scanner input =new Scanner(System.in);
        String line = input.nextLine();

        String[] lineArray= line.split("\\s");
        Collections.addAll(list, lineArray);

        System.out.println("Distinct Values are : " + DistinctStringMain.getDistinctStrings(list));
    }
}
