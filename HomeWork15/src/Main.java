import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SearchEngineImpl searchEngine = new SearchEngineImpl();
        List<ITextProvider> textProviderList = new ArrayList<>();

        textProviderList.add(new SimpleTextProviderImpl("сегодня не было дождя"));
        textProviderList.add(new SimpleTextProviderImpl("сегодня был снег"));
        textProviderList.add(new SimpleTextProviderImpl("вчера не было снега"));
        textProviderList.add(new SimpleTextProviderImpl("был дождь"));

        ITextProvider query = new SimpleTextProviderImpl("был снег");

        List<ITextProvider> sortList = searchEngine.getSortedByRelevanceList(new CosineSimilarityImpl(), query, textProviderList);
        for (ITextProvider textProvider: sortList) {
            System.out.println(textProvider.getText());
        }
    }
}