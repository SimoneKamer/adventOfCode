package demo.findHq;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.valueOf;
import static java.lang.Math.abs;

public class AbstractCalculator {
    protected Walker walker = new Walker();
    protected Location locationOfHQ;
    private Set<Location> visitedLocations = new HashSet<>();

    protected void followInstruction(String instruction) {
        doTurn(instruction);
        takeSteps(instruction);
    }

    private void doTurn(String instruction) {
        char turn = instruction.charAt(0);
        switch (turn) {
            case 'L':
                walker.turnLeft();
                break;
            case 'R':
                walker.turnRight();
                break;

        }
    }

    private void takeSteps(String instruction) {
        for (int i = 0; i < (determineLength(instruction)); i++) {
            walker.walk();
            Location currentLocation = new Location(walker.getX(), walker.getY());
            Boolean dejaVu = visitedLocations.contains(currentLocation);
            if (dejaVu) {
               locationOfHQ = currentLocation;
            }
            visitedLocations.add(currentLocation);
        }
    }

    private Integer determineLength(String instruction) {
        return valueOf(instruction.substring(1));
    }

    protected int calculateDistance(Location location) {
        return abs(location.getX()) + abs(location.getY());
    }
}
