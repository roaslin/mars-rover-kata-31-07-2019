public class Rover {
    private char direction;

    public Rover() {
        this.direction = 'N';
    }

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {


            if ('L' == command) {

                if ('N' == direction) {

                    direction = 'W';
                } else if ('W' == direction) {

                    direction = 'S';
                } else if ('S' == direction) {

                    direction = 'E';
                } else if ('E' == direction) {

                    direction = 'N';
                }
            }
        }
        return "0:0:" + direction;

    }
}
