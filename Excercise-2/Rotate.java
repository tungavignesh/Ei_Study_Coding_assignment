class Rotate implements Command {
    private Satellite satellite;
    private String direction;

    public Rotate(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() {
        satellite.rotate(direction);
    }
}
