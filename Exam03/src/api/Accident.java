package api;

public class Accident {
    private String occrrncDt;

    private String occrrncDayCd;

    private int dthDnvCnt;

    public String getOccrrncDt() {
        return occrrncDt;
    }

    public void setOccrrncDt(String occrrncDt) {
        this.occrrncDt = occrrncDt;
    }

    public String getOccrrncDayCd() {
        return occrrncDayCd;
    }

    public void setOccrrncDayCd(String occrrncDayCd) {
        this.occrrncDayCd = occrrncDayCd;
    }

    public int getDthDnvCnt() {
        return dthDnvCnt;
    }

    public void setDthDnvCnt(int dthDnvCnt) {
        this.dthDnvCnt = dthDnvCnt;
    }

    public int getInjpsnCnt() {
        return injpsnCnt;
    }

    @Override
    public String toString() {
        return "Accident{" +
                "occrrncDt='" + occrrncDt + '\'' +
                ", occrrncDayCd='" + occrrncDayCd + '\'' +
                ", dthDnvCnt=" + dthDnvCnt +
                ", injpsnCnt=" + injpsnCnt +
                '}';
    }

    public void setInjpsnCnt(int injpsnCnt) {
        this.injpsnCnt = injpsnCnt;
    }

    private int injpsnCnt;

}
