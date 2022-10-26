import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService1
{
    public static List<String> addElectronicsItemsToList(String electronicsItems)        //all the electronics items inside the List is added
    {
        List<String> itemList =new ArrayList<>();
        itemList.add("computer");
        itemList.add("Refrigerator");
        itemList.add("Smartphone");
        itemList.add("Printer");
        System.out.println(itemList);
        return itemList;

    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {

        return itemList.indexOf(searchItem);
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;
        Iterator<String> iterator= itemList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals(removeItem)) {
                iterator.remove();
                flag = true;
                System.out.println(" Item list after removing " + removeItem + " : " + itemList);

            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String electronicsItems="";
        System.out.println("-------------------------------------------");
        System.out.print("List of Items : ");
        List <String> itemList=addElectronicsItemsToList(electronicsItems);
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        int searchItems=searchElectronicItemInList(itemList,"Smartphone");
        System.out.println(searchItems);
        System.out.println("-------------------------------------------");
        boolean removeItem=removeElectronicsItemFromList(itemList,"TV");
        System.out.println(removeItem);
        System.out.println("-------------------------------------------");


    }

}