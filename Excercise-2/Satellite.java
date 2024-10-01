class Satellite {
    private String orientation;
    private String panelStatus;
    private int collectedData;

    public Satellite() {
        this.orientation = "North";
        this.panelStatus = "Inactive";
        printMessage("Satellite initialized with default state.");
    }

    public void rotate(String direction) {
        String upperDirection = direction.toUpperCase(); // Convert the input direction to uppercase
        switch (upperDirection) {
            case "NORTH":
            case "SOUTH":
            case "EAST":
            case "WEST":
                this.orientation = upperDirection;
                printMessage("Satellite rotated to " + upperDirection + ".");
                break;
            default:
                printError("Invalid rotation direction: " + direction + ". Must be North, South, East, or West.");
                throw new IllegalArgumentException("Invalid direction. Use North, South, East, or West.");
        }
    }

    public void activatePanels() {
        this.panelStatus = "Active";
        printMessage("Solar panels activated");
    }

    public void deactivatePanels() {
        this.panelStatus = "Inactive";
        printMessage("Solar panels deactivated");
    }

    public void collectData() {
        if ("Active".equals(this.panelStatus)) {
            this.collectedData += 10;
            printMessage("Total data collected: " + this.collectedData);
        } else {
            throw new IllegalStateException("Cannot collect data. Solar panels are inactive.");
        }
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private void printError(String message) {
        System.out.println("Error: " + message);
    }

    @Override
    public String toString() {
        return "Orientation: " + orientation + "\n" +
               "Solar Panels: " + panelStatus + "\n" +
               "Data Collected: " + collectedData;
    }
}
