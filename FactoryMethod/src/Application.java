
public class Application {
        public static void main(String[] args) {
                // Instantiate a dialog based on your desired platform.
                Dialog dialog = new WindowsDialog(); // Or use WebDialog for web
                Dialog dialog1 = new WebDialog();
                // Use the dialog to create and render a button.
                dialog.render();
                dialog1.render();
        }
}
