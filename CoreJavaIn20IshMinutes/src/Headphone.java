public class Headphone {
    String hpBrand;
    String hpColor;
    int hpType;

    boolean hpHasANC;

    public Headphone(String hpBrand, String hpColor, int hpType, boolean hpHasANC) {
        this.hpBrand = hpBrand;
        this.hpColor = hpColor;
        this.hpType = hpType;
        this.hpHasANC = hpHasANC;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Headphone{");
        sb.append("Brand='").append(hpBrand).append('\'');
        sb.append(", Color='").append(hpColor).append('\'');
        sb.append(", Type=").append( ((hpType==1)? "Wireless" : "Wired") );
        sb.append(", HasANC=").append(hpHasANC);
        sb.append('}');
        return sb.toString();
    }
}
