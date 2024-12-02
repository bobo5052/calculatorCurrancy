package InternetData;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;


public class Main3 {
	static List < Post > post;

	public static void main(String[] args) {

		Gson gson = new Gson();
		Type type = new TypeToken < List < Post > >() {
		}.getType();
		String body = InternetSetting.setCurrency();
		post = gson.fromJson(body, type);
		Menu.startMenu();
	}


}
