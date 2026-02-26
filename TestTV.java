import java.security.PublicKey;

public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();   
        tv2.chanelUp();
        tv2.chanelUp();
        tv2.volumeUp();
        System.out.printf("tv1: %s\ntv2: %s", tv1.toString(), tv2.toString());
    }
}
class TV{
    int channel;
    int volumeLevel;
    boolean on = false;

    public TV() {
        this.channel = 1;
        this.volumeLevel = 1;
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 120) {
            this.channel = channel;
        }
    }
    public void setVolume(int volumeLevel) {
        if (on && volumeLevel >= 1 && volumeLevel <= 7) {
            this.volumeLevel = volumeLevel;
        }
    }
    public void chanelUp(){
        if (on && channel < 120) {
            channel++;
        }
    }
    public void chanelDown(){
        if (on && channel > 1) {
            channel--;
        }
    }
    public void volumeUp(){
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }
    public void volumeDown(){
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
    public String toString() {
        return "TV(" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                ')';
    }
}