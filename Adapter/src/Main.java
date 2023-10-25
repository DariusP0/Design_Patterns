
public class Main {
    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new EuropeanSocket();
        NorthAmericanSocket adapter = new SocketAdapter(europeanSocket);

        adapter.plugIntoNorthAmericanOutlet();
    }
}
