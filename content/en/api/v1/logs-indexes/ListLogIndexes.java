import com.datadog.api.v1.client.api.LogsIndexesApi;

public class LogsIndexesApiExample {

    public static void main(String[] args) {
        LogsIndexesApi apiInstance = new LogsIndexesApi();
        try {
            LogsIndexListResponse result = apiInstance.listLogIndexes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsIndexesApi#listLogIndexes");
            e.printStackTrace();
        }
    }
}