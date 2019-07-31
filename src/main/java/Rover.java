public class Rover {
    private Direction direction;
    private int y = 0;

    public Rover() {
        this.direction = Direction.NORTH;
    }

    public Rover(Direction direction) {
        this.direction = direction;
    }


    public String execute(String commands) {
        for (char command : commands.toCharArray()) {

            if ('L' == command) {

                this.direction = direction.toLeft();
            }

            if ('R' == command) {

                this.direction = direction.toRight();
            }

            if ('M' == command) {

                if (direction.equals(Direction.NORTH)) {
                    y++;
                }

                if (direction.equals(Direction.SOUTH)) {
                    y--;
                }
            }
        }
        return "0:" + y + ":" + direction.getName();
    }
}
