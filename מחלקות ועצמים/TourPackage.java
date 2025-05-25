public class TourPackage {
    private int id;
    private int price;
    private int maxTime;
    private int maxData;
    private int extra;

    public TourPackage(int id, int price, int maxTime, int maxData) {
        this.id = id;
        this.price = price;
        this.maxTime = maxTime;
        this.maxData = maxData;
        this.extra = 0;
    }

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMaxTime() {
        return this.maxTime;
    }

    public int getMaxData() {
        return this.maxData;
    }

    public int getExtra() {
        return this.extra;
    }

    public void setExtra(int minutes, int usage) {
        int ext = 0;
        if (minutes > maxTime) {
            ext += (minutes-this.maxTime);
        }
        if (usage > maxData) {
            ext += 2*(usage-this.maxData);
        }
        this.extra = ext;
    }
}
