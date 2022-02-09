import java.util.*;
class FoodItem implements Comparable<FoodItem>{
    String name;
    List<Integer> customers;
    
    @Override
    public int compareTo(FoodItem other){
        return this.customers.size() - other.customers.size();
    }
}
public class IntelligentChef {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
        s.nextLine(); //moving to the nextline as the next input is given in the next line
        Map<String,FoodItem> foodItemMap = new HashMap<>(); //fooditem is a class above
        List<Integer> remainingCustomers = new ArrayList<>();
        for(int customer = 1; customer <= N; customer++){
            remainingCustomers.add(customer);
            String preferences[] = s.nextLine().split("\\s+");//splitting using spaces
            for(String item:preferences){
                if(!foodItemMap.containsKey(item)){
                    FoodItem fi = new FoodItem(); 
                    fi.name = item;
                    fi.customers = new ArrayList<>();
                    foodItemMap.put(item, fi);
                }
                foodItemMap.get(item).customers.add(customer);
            }
        }
        int count = 0;
        while(!remainingCustomers.isEmpty()){
            List<FoodItem> items = new ArrayList<>(foodItemMap.values()); 
            Collections.sort(items, Collections.reverseOrder()); //sorting in descending order as the food item having the highest no of customers preference will be on the top
            FoodItem mostPreferred = items.get(0);
            count++;
            foodItemMap.remove(mostPreferred.name);
            remainingCustomers.removeAll(mostPreferred.customers);
            for(String foodItem:foodItemMap.keySet()){
                foodItemMap.get(foodItem).customers.removeAll(mostPreferred.customers);
            }
        }
        System.out.println(count);
	}
}
