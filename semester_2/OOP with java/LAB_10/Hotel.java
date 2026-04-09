class HotelRoom {
    private String roomCode;

    public HotelRoom(String roomCode) {
        this.roomCode = roomCode;
    }

    public void display() {
        System.out.println("Room Code: " + roomCode);
    }

    public double nightlyRate() {
        return 3000.0; // base rate
    }
}

class StandardRoom extends HotelRoom {

    public StandardRoom(String roomCode) {
        super(roomCode);
    }

    @Override
    public double nightlyRate() {
        return 5500.0;
    }
}

class Suite extends HotelRoom {

    public Suite(String roomCode) {
        super(roomCode);
    }

    @Override
    public double nightlyRate() {
        return 12000.0;
    }
}

class Main {
    public static void main(String[] args) {
        HotelRoom h = new HotelRoom("101");
        StandardRoom s = new StandardRoom("205");
        Suite su = new Suite("501");

        System.out.println("=== Hotel Room ===");
        h.display();
        System.out.println("Rate: " + h.nightlyRate());

        System.out.println("\n=== Standard Room ===");
        s.display();
        System.out.println("Rate: " + s.nightlyRate());

        System.out.println("\n=== Suite ===");
        su.display();
        System.out.println("Rate: " + su.nightlyRate());
    }
}