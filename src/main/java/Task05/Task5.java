package Task05;

public class Task5 {

    public int totalPaths(int x, int y) {
        if (x < 0) x = -x;
        if (y < 0) y = -y;
        if (x == 0 || y == 0) {
            return 1;
        }
        int left = totalPaths(x - 1, y);
        int down = totalPaths(x, y - 1);
        return left + down;
    }

}
