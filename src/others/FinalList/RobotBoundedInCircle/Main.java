package others.FinalList.RobotBoundedInCircle;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String instructions = "GLRLLGLL";
        System.out.println(isRobotBounded(instructions));
    }

    private static boolean isRobotBounded(String instructions) {
        int l = instructions.length();
        int x = 0;
        int y = 0; // initial points of the robot
        String directions = "North"; // initial direction of robot
        for (int i = 0 ; i < l; i ++) {
            char ch = instructions.charAt(i);
            if (ch == 'G') {
                if (directions == "North") {
                    y += 1;
                } else if (directions == "West") {
                    x -= 1;
                } else if (directions == "South") {
                    y -= 1;
                } else {
                    x += 1;
                }
            }
            if (ch == 'L') {
                if (directions == "North") {
                    directions = "West";
                } else if (directions == "West") {
                    directions = "South";
                } else if (directions == "South") {
                    directions = "East";
                } else {
                    directions = "North";
                }
            }
            if (ch == 'R') {
                if (directions == "North") {
                    directions = "East";
                } else if (directions == "West") {
                    directions = "North";
                } else if (directions == "South") {
                    directions = "West";
                } else {
                    directions = "South";
                }
            }
        }
        if (x == 0 && y == 0) return true; //don't miss this line!
        if (directions.equals("North")) return false;
        return true;
    }
}
