public class Adapter extends DataAnalysisTool{

    XMLdata xmlDataObject;

    Adapter(XMLdata xmlDataObject)
    {
        // super(xmlDataObject.getXMLData());
        this.xmlDataObject = xmlDataObject;
    }

    @Override
    public void analyseData() {
        System.out.println("Converting XML data to json");
        super.analyseData();
    }

}
