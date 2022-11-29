package evaluationtask;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumeApi {
	
	
	public void ConsumA() throws IOException, InterruptedException {
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create("https://official-joke-api.appspot.com/jokes/ten")).build();
	HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

	String Myfile = response.body();
	System.out.println(Myfile);


}
	}
