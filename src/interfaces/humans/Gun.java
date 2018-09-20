package interfaces.humans;

public class Gun {

    private int caliber;

    private String mark;

    public Gun(int caliber, String mark) {
        this.caliber = caliber;
        this.mark = mark;
    }

    public Gun() {
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
