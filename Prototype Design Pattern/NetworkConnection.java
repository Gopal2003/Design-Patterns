public class NetworkConnection implements Cloneable{
    private String host;
    private String IPAddress;
    private String ImportantAction;


    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getIPAddress() {
        return IPAddress;
    }
    public void setIPAddress(String iPAddress) {
        IPAddress = iPAddress;
    }
    public String getImportantAction() {
        return ImportantAction;
    }
    public void setImportantAction(String importantAction) {
        ImportantAction = importantAction;
    }

    public void setNetworkConnection() throws InterruptedException{
        Thread.sleep(5000);
    }
    @Override
    public String toString() {
        return "NetworkConnection [host=" + host + ", IPAddress=" + IPAddress + ", ImportantAction=" + ImportantAction
                + "]";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    
    
}