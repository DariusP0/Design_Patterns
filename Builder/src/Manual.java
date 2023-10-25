public class Manual {
    private String manualContent ="";

    public void addManualContent(String content) {
        if(content!=null)
            this.manualContent += content;
    }

    public void showManual() {
        System.out.println("Car Manual: " + this.manualContent);
    }
}