public class Main {
    public static void main(String[] args) {
        RGB white = new RGB();
        RGB red = new RGB(255, 0, 0);

        RGBController rgbController = new RGBController();
        RGB brightRed = rgbController.mixed(white, red);

        rgbController.show(white);
        rgbController.show(red);
        rgbController.show(brightRed);
    }
}
