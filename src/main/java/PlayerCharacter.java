public class PlayerCharacter {
    public static int x = 0;
    public static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int move(String direction) {
        if (direction.equals("W")) {
            y++;
            return getY();
        } else if (direction.equals("S")) {
            y--;
            return getY();
        } else if (direction.equals("D")) {
            x++;
            return getX();
        } else if (direction.equals("A")) {
            x--;
            return getX();
        }
        return -1;
    }
}
