public class Conversor {

    private int num;

    public Conversor(int num) {
        this.num = num;
    }

    public String toBinary() {
        return Integer.toBinaryString(num);
    }

    public String toOctal() {
        return Integer.toOctalString(num);
    }

    public String toHex() {
        return Integer.toHexString(num);
    }

    public String toBase(int base) {
        return Integer.toString(num, base);
    }
}
