package cts.sandulescu.razvan.g1086.pattern.singleton.program;

import cts.sandulescu.razvan.g1086.pattern.singleton.clase.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = Robot.getInstance("Robot1", 100, 1);
        Robot robot2 = Robot.getInstance("Robot2", 200, 2);

        // Testare Singleton - va afisa primul robot
        System.out.println(robot1.toString());
        System.out.println(robot2.toString());

        // Compar adresele
        if(robot1 == robot2) {
            System.out.println("Aceeasi instanta");
        }

        // Va afisa acelasi id
        System.out.println(robot1.getIdRobot());
        System.out.println(robot2.getIdRobot());
    }
}
