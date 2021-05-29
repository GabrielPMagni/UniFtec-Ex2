public class App2 {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        
        tv.aumentaVolume();

        tv.diminuiVolume();
        int vol = tv.retornaVolume();

        System.out.println(vol);
    }
}