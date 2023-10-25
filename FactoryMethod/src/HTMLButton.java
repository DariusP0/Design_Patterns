public class HTMLButton implements Button {
    public void render() {
        System.out.println("Rendering an HTML button.");
    }

    public void onClick() {
        System.out.println("Binding a web browser click event.");
    }
}
