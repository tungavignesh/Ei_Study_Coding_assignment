class CollectData implements Command {
    private Satellite satellite;

    public CollectData(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.collectData();
    }
}
