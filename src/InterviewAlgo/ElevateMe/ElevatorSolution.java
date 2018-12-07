package InterviewAlgo.ElevateMe;


public class ElevatorSolution {

    static int[] peopleWeight = {60, 80, 40};
    static int[] floor = {2, 3, 5};
    static int capacity = 2;  //capacity
    static int maxWeight = 200; // weight

    public static void main(String[] args) {

        System.out.println(solution(peopleWeight, floor, capacity, maxWeight));

    }

    private static int solution(int[] peopleWeight, int[] floor, int capacity, int maxWeight) {

        Elevator elevator = new Elevator();
        elevator.setCapacity(capacity);
        elevator.setMaxWeight(maxWeight);

        int stops = 0;
        int i = 0;

        while (i < peopleWeight.length) {
            int currentWeight = 0;
            int currentRiderPosition = 0;

            while (i + currentRiderPosition < peopleWeight.length && currentRiderPosition < capacity) {
                currentWeight = currentWeight + peopleWeight[currentRiderPosition + 1];

                currentRiderPosition++;
            }


        }
        return stops;
    }


}
