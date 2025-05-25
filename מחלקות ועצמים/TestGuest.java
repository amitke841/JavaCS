public class TestGuest {
    public static int totalGuest(Guest[] arr, int floor, int nights) {
        Guest g;
        int currentFloor = 0;
        int aboveNights = 0;
        for (int i = 0; i < arr.length; i++) {
            g= arr[i];
            currentFloor = g.getRoomNum()%10;
            if (currentFloor == floor && g.getNights() > nights) {
                aboveNights++;
            }
        }
        return aboveNights;
    }

    public static void mostPopularFloor(Guest[] arr) {
        Guest g;
        int[] poolUseFloors = new int[10];
        int currentFloor = 0;

        for (int i = 0; i < poolUseFloors.length; i++) {
            poolUseFloors[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            g = arr[i];
            if (g.getPool() == 'Y') {
                currentFloor = g.getRoomNum()%10;
                poolUseFloors[currentFloor]++;
            }
        }

        int maxUse = poolUseFloors[0];;
        for (int i = 1; i < poolUseFloors.length; i++) {
            if (poolUseFloors[i] > maxUse) {
                maxUse = poolUseFloors[i];
            }
        }

        for (int i = 0; i < poolUseFloors.length; i++) {
            if (poolUseFloors[i] == maxUse) {
                System.out.println("Floor " + i + "Was used max on pool.");
            }
        }
    }
}
