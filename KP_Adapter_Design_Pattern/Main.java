public class Main {
    public static void main(String[] args) {
        XMLdata xmlDataObject = new XMLdata("This is a sample XML file");
        
        DataAnalysisTool tool = new Adapter(xmlDataObject);
        // tool.analyseData();

        Client client = new Client();
        client.analyse(tool);
    }
}
