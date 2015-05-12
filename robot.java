public class robot {
        public int sensor;
        public int servo;
        public int power;

    public robot(){
        sensor=4;
        System.out.println("Jumlah sensor robot : " +sensor);
    }
}
class Asimo13 extends robot{
    public int kamera;
    public Asimo13(int a1, int a2, int a3, int a4){
        sensor=a1;
        servo=a2;
        power=a3;
        kamera=a4;
    }
    public void CetakSpesifikasi(){
        System.out.println("jumlah sensor asimo13 = "+sensor);
        System.out.println("jumlah servo = "+servo);
        System.out.println("kapasitas power = "+power);
        System.out.println("jumlah kamera ="+kamera);
    }
    public void Upgrade(int a){
        sensor = a;
        System.out.println("asimo13 di upgrade dengan sensor = "+ sensor);
    }
}
