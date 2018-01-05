import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Awesome Events! How many guests will you have for your party");
            String guests = bufferedReader.readLine();
            System.out.println("Great! What kinds of food will you have?");
            String food = bufferedReader.readLine();
            System.out.println("Great! What kinds of beverages will you have?");
            String beverages = bufferedReader.readLine();
            System.out.println("Great! What kinds of entertainment would you like?");
            String entertainment = bufferedReader.readLine();
            System.out.println("Great! Do you have any coupons?");
            String coupons = bufferedReader.readLine();
            Integer guestsInteger = Integer.parseInt(guests);
            ArrayList<String> foodList = new ArrayList<String>();
            String[] foodArr = food.split(" ");
            for (String item : foodArr) {
                foodList.add(item);
            }
            String[] beveragesArr = beverages.split(" ");
            ArrayList<String> beveragesList = new ArrayList<String>();
            for (String item : beveragesArr) {
                beveragesList.add(item);
            }
            String[] entertainmentArr = entertainment.split(" ");
            ArrayList<String> entertainmentList = new ArrayList<String>();
            for (String item : entertainmentArr) {
                entertainmentList.add(item);
            }
            String[] couponArr = coupons.split(" ");
            ArrayList<String> couponList = new ArrayList<String>();
            for (String item : couponArr) {
                couponList.add(item);
            }
            EventPlanner eventPlanner = new EventPlanner(guestsInteger, foodList, entertainmentList, beveragesList, couponList);
            int price = eventPlanner.getPrice();
            System.out.println(String.format("Great, your price is %d. We hope to see you soon!", price));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
