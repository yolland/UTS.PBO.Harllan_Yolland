public class Testrobot {
    public static void main(String[] args)
    {
        Asimo13 unit = new Asimo13(30, 150, 1000, 5);
        unit.CetakSpesifikasi();
        unit.Upgrade(20);
        unit.Upgrade(25);
    }
}
