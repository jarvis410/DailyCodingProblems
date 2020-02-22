package hard;

enum Direction {
    CLOCKWISE, ANTICLOCKWISE
}

/**
 * Can we reach the given combination avoiding dead lock?
 */
public class Problem313 {
    public static void main(String[] args) {
        Combination c = new Combination();
        c.setGoal(new int[]{3, 7, 9});
        c.setDeadlock(new int[]{4, 7, 6});
        c.calculateMoves();
    }
}

class Combination {
    private int deadlock[];
    private int goal[];

    public void setDeadlock(int[] deadlock) {
        this.deadlock = deadlock;
    }

    public void setGoal(int[] goal) {
        this.goal = goal;
    }

    public void calculateMoves() {
        int minimumMoves = 0;
        int goalDigit;
        int deadlockDigit;
        Direction move;

        for (int i = 0; i < 3; i++) {
            goalDigit = goal[i];
            deadlockDigit = deadlock[i];

            if (goalDigit < 5) {
                if (goalDigit == deadlockDigit) {
                    printDeadlock(i + 1);
                } else if (deadlockDigit > goalDigit) {
                    move = Direction.ANTICLOCKWISE;
                    printMove(i + 1, goalDigit, move);
                    minimumMoves += goalDigit;
                } else {
                    move = Direction.CLOCKWISE;
                    printMove(i + 1, 10 - goalDigit, move);
                    minimumMoves += 10 - goalDigit;
                }
            } else if (goalDigit >= 5) {
                if (goalDigit == deadlockDigit) {
                    printDeadlock(i + 1);
                } else if (deadlockDigit < goalDigit) {
                    move = Direction.CLOCKWISE;
                    printMove(i + 1, 10 - goalDigit, move);
                    minimumMoves += 10 - goalDigit;
                } else {
                    move = Direction.ANTICLOCKWISE;
                    printMove(i + 1, goalDigit, move);
                    minimumMoves += goalDigit;
                }
            }
        }

        System.out.println(minimumMoves);
    }

    private void printMove(int wheelNo, int times, Direction direction) {
        System.out.println("Move wheel " + wheelNo + ", " + times + " times " + direction);
    }

    private void printDeadlock(int wheelNo) {
        System.out.println("Deadlock on wheel " + wheelNo);
    }
}