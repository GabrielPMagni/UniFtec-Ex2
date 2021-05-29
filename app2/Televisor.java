public class Televisor {
    private int volume;
    public Televisor(){
        this.volume = 0;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public void aumentaVolume(){
        int volumeAux = getVolume() + 1;
        if (volumeAux <= 40) {
            setVolume(volumeAux);
        }
    }

    public void diminuiVolume(){
        int volumeAux = getVolume() - 1;
        if (volumeAux >= 0) {
            setVolume(volumeAux);
        }
    }

    public int retornaVolume(){
        return getVolume();
    }
    

}