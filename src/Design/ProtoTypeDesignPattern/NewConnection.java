package Design.ProtoTypeDesignPattern;

public class NewConnection implements Cloneable{
    private String ip;
    private String importantData;

    public NewConnection(String ip, String importantData) {
        this.ip = ip;
        this.importantData = importantData;
    }

    public NewConnection() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
    public  void loadVeryVeryImpotandData(){
        System.out.println("Data is getting Load ");
        this.importantData="data Load ho gaya jo ki kaafi important he";
    }

    @Override
    public String toString() {
        return "NewConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';

        }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public  void settingFrequency(){
        System.out.println("Ivsetting");
    }
}
