package armnum;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class java11Que6
{
    public static void main(String[] args)
    {
        String uri = "http://httpbin.org/get";
        HttpRequest request=HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .version(HttpClient.Version.HTTP_2).build();
        HttpClient client=HttpClient.newBuilder().build();
        try
        {
            HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println(response.toString());
            System.out.println(response.body());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
