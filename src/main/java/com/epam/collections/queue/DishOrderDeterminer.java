package com.epam.collections.queue;



import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayList<Integer> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= numberOfDishes; i++){
            list.add(i);
        }
        int counter = 1;
        while (list.size() > 0){
            if(counter % everyDishNumberToEat == 0){
                counter = 1;
                result.add(list.poll());
            }else {
                list.add(list.poll());
                counter++;
            }
        }

        return result;
    }
}
