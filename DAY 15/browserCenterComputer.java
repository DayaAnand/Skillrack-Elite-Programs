import java.util.*;

public class browserCenterComputer {

    public static void main(String[] args) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine(); //for bypassing
        List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();
        for (int counter = 0; counter < N; counter++) {
            String slot[] = in.nextLine().split("\\s+"); //splitting using spaces
            start.add(toMins(slot[0]));
            end.add(toMins(slot[1]));
        }
        int computerneeded = 0, startIndex = 0, endIndex = 0;
        Collections.sort(start);
        Collections.sort(end);
        while (startIndex < start.size() && endIndex < end.size()) {
            int currReq = Math.abs(startIndex - endIndex) + 1;
            if (currReq > computerneeded) {
                computerneeded = currReq;
            }
            if (start.get(startIndex) < end.get(endIndex)) {
                startIndex++;
            } else {
                endIndex++;
            }
            while (startIndex < start.size() && endIndex < end.size() && start.get(startIndex) >= end.get(endIndex)) {
                endIndex++;
            }
        }
        System.out.println(computerneeded);
    }

    private static int toMins(String time) { //coverting the given time to mins //General Info for any sum - always covert the time to minutes or seconds for easy calculation
        String hourMins[] = time.split(":");
        int hours = Integer.parseInt(hourMins[0]);
        int minutes = Integer.parseInt(hourMins[1]);
        return (hours * 60) + minutes;
    }
}