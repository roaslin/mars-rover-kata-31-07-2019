public class Rover {
    private Direction direction;

    public Rover() {
        this.direction = Direction.NORTH;
    }

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {

            if ('L' == command) {

                this.direction = direction.toLeft();
            }

            if ('R' == command) {

                this.direction = direction.toRight();
            }
        }
        return "0:0:" + direction.getName();
    }
}
