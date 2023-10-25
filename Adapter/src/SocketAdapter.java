public class SocketAdapter implements NorthAmericanSocket {
    private EuropeanSocket europeanSocket;

    public SocketAdapter(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }
    public void plugIntoNorthAmericanOutlet() {
        System.out.println("Using adapter to connect to the North American socket.");
        europeanSocket.plugIntoEuropeanOutlet();
    }
}