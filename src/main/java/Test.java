import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int requestLimit = 10;

        try (CrptApi api = new CrptApi(timeUnit, requestLimit)) {

            CrptApi.Document document = api.loadDocumentFromJson();
            String signature = "signature";

            api.createDocument(document, signature);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
