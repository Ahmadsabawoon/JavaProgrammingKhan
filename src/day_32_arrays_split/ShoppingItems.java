package day_32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("----------------Find the first index of 'Gloves' in item array-----------");
        //int index =0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at the index " + i);
                break;
               // System.out.println(i + " - " + items[i]);

            }
        }


        System.out.println("-----Set boolean to true if first 'iPad' is found");
        boolean iPadExists = false;
        for(String item : items) {
            if(item.equalsIgnoreCase("iPad")) {
                iPadExists =  true;
                break;
            }
        }

        System.out.println("iPadExists = " + iPadExists);


//        for (int i = 0; i < items.length; i++) {
//            if (items[i].equals("ipad")) {
//                iPadExists = true;
//                break;
//            }
//        }
//        System.out.println("Item exists = " + iPadExists);


        System.out.println("---------Print a report of each shopping item-------------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $ " +  prices[i] + " - " + itemIDs[i]);
        }

        System.out.println("--------- Look for 'Jacket' in items and print all details------- ");
        for (int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println(items[i] + " - $ " +  prices[i] + " - " + itemIDs[i]);
            }
        }





























    }
}
