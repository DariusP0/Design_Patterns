public class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering a Windows-style button.");
    }

    public void onClick() {
        System.out.println("Binding a native OS click event.");
    }
}