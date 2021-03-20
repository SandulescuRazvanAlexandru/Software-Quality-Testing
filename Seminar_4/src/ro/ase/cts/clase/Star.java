package ro.ase.cts.clase;

public class Star {
    private String numeStar;
    private int netWorth;
    private float inaltime;

    private static Star star = null;
    public static synchronized Star getInstance(String numeStar, int netWorth, float inaltime) {
        if (star == null) {
            star = new Star(numeStar, netWorth, inaltime);
        }
        return star;
    }

    private Star() {
        this.numeStar = "Default";
        this.netWorth = 0;
        this.inaltime = 0.0f;
    }

    private Star(String numeStar, int netWorth, float inaltime) {
        this.numeStar = numeStar;
        this.netWorth = netWorth;
        this.inaltime = inaltime;
    }

    public void setNumeStar(String numeStar) {
        this.numeStar = numeStar;
    }

    public void setNetWorth(int netWorth) {
        this.netWorth = netWorth;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Star{");
        sb.append("numeStar='").append(numeStar).append('\'');
        sb.append(", netWorth=").append(netWorth);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }
}
