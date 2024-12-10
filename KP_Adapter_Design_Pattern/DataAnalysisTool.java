public class DataAnalysisTool{

    String jsonData;
    DataAnalysisTool(){};
    DataAnalysisTool(String jsonData)
    {
        this.jsonData = jsonData;
    }

    public void analyseData()
    {
        System.out.println("Analyzing the data..." + jsonData);
    }
}