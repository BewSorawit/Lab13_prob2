import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("D:/sell.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String data;

        ArrayList<Item> items = new ArrayList<>();
        while ((data = bufferedReader.readLine()) != null) {
            Item item = new Item();
            String[] str = data.split(",");
            String strName = str[0].trim();
            String strPrice = str[1].trim();
            String strQuantity = str[2].trim();
            item.setName(strName);
            item.setPrice(Double.parseDouble(strPrice));
            item.setQuantity(Integer.parseInt(strQuantity));

            items.add(item);

        }
        int count = 0;
        for (Item i : items) {
            System.out.println(++count + " " + i.getName());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose :");

        try {
            System.out.println(items.get(sc.nextInt() - 1));

        } catch (Exception e) {
            System.out.println("Wrong please enter number");
        }

        bufferedReader.close();
        reader.close();

    }
}
