import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        PlayerPosition playerPosition = new PlayerPosition(initialTx, initialTy);
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            System.out.println(new Chooser().getChoose(playerPosition, lightX, lightY));
        }
    }
}

class PlayerPosition {

    private int x;
    private int y;

    public PlayerPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void increaseX() {
        x += 1;
    }

    public void increaseY() {
        y += 1;
    }

    public void decreaseX() {
        x -= 1;
    }

    public void decreaseY() {
        y -= 1;
    }
}

class Chooser {
    public String getChoose(PlayerPosition playerPosition, int lightX, int lightY) {
        if (playerPosition.getX() < lightX && lightY < playerPosition.getY()) {
            playerPosition.increaseX();
            playerPosition.decreaseY();
            return "NE";
        }
        if (playerPosition.getX() < lightX && lightY > playerPosition.getY()) {
            playerPosition.increaseX();
            playerPosition.increaseY();
            return "SE";
        }
        if (playerPosition.getX() > lightX && lightY > playerPosition.getY()) {
            playerPosition.increaseY();
            playerPosition.decreaseX();
            return "SW";
        }
        if (playerPosition.getX() > lightX && lightY < playerPosition.getY()) {
            playerPosition.decreaseX();
            playerPosition.decreaseY();
            return "NW";
        }
        if (lightX < playerPosition.getX()) {
            playerPosition.decreaseX();
            return "W";
        }
        if (lightX > playerPosition.getX()) {
            playerPosition.increaseX();
            return "E";
        }
        if (lightY > playerPosition.getY()) {
            playerPosition.increaseY();
            return "S";
        }
        if (lightY < playerPosition.getY()) {
            playerPosition.decreaseY();
            return "N";
        }
        throw new IllegalStateException("No possible step");
    }
}