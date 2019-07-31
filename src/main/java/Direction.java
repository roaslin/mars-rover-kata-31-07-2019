public enum Direction {
    NORTH('N', 'W', 'E'), WEST('W', 'S', 'N'), SOUTH('S', 'E', 'W'), EAST('E', 'N', 'S');
    private char name;
    private char left;
    private char right;

    Direction(char current, char left, char right) {
        this.name = current;
        this.left = left;
        this.right = right;
    }

    public char getName() {
        return name;
    }

    public Direction toLeft() {
        if (this.name == 'N') {
            return WEST;
        } else if (this.name == 'W') {
            return SOUTH;
        } else if (this.name == 'S') {
            return EAST;
        } else {
            return NORTH;
        }
    }

    public Direction toRight() {
        if (this.name == 'N') {
            return EAST;
        } else if (this.name == 'E') {
            return SOUTH;
        } else if (this.name == 'S') {
            return WEST;
        } else {
            return NORTH;
        }
    }
}