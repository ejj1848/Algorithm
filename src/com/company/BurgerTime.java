package com.company;

/**
 * Created by ericjohn1 on 11/3/2016.
 */

//BigBurger Inc. wants to see if having a single person at the counter both to take orders and to serve them is feasible. At each BigBurger, customers will arrive and get in line. When they get to the head of the line they will place their order, which will be assembled and served to them. Then they will leave the BigBurger and the next person in line will be able to order.
//We need to know how long a customer may be forced to wait before he or she can place an order. Given a script that lists each customer for a typical day, we want to calculate the maximum customer waiting time. Each customer in the script is characterized by an arrival time (measured in minutes after the store opened) and a service duration (the number of minutes between ordering and getting the food).
//Create a class BigBurger that contains method maxWait that is given a int[] arrival and a int[] service describing all the customers and returns the maximum time spent by a customer between arriving and placing the order. Corresponding elements of arrival and service refer to the same customer, and they are given in the order in which they arrive at the store (arrival is in non-descending order).
//If multiple customers arrive at the same time they will all join the line at the same time, with the ones listed earlier ahead
//of ones appearing later in the list.

//Examples
//{3,3,9}
//{2,15,14}
//Returns: 11
//Two customers arrive at time 3. The first one waits 0 time, orders, and is served after 2 minutes, leaving at time 5.
// The second one then orders and is served at time 20. Meanwhile a customer arrives at time 9 and waits until the second customer leaves.
// This last customer then orders at time 20, and is served and leaves at time 20+14 = 34.
// The first customer waited 0 minutes, the second waited 2 minutes (from time 3 to time 5), and the last customer waited 11 minutes (from time 9 to time 20).


public class BurgerTime {



    public static void main(String[] args) {
       int[]arrival = {3,3,9};
       int[]service = {2,15,14};


        System.out.println(maxWait(arrival, service));
    }

    private static int maxWait(int[] arrival, int[] service){

        int maxWait = 0;
        int lastServed = 0;

        for(int i = 0; i <arrival.length; i++){
            int newOrderTime = Math.max(lastServed, arrival[i]);
            lastServed = newOrderTime + service[i];
            int wait = newOrderTime - arrival[i];
            if(maxWait < wait)
                maxWait = wait;
        }

        return maxWait;
    }
}
