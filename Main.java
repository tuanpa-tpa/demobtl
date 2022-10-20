import org.json.JSONObject;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean withCookies = true;
        HttpRequest http = new HttpRequest(withCookies);

        // POST file upload:
        Map<String, Object> formdata = new HashMap<>();
        formdata.put("test-string", "hello");
        formdata.put("test-file", new File("/text.txt"));
//        byte[] response = http.post("http://loalhost:8080/api", formdata);
        // GET:
        byte[] response = http.get("https://dummyjson.com/products/1");
        String json=new JSONObject(new String(response)).toString();
        System.out.println(json);
        // string
        System.out.println(new String(response, StandardCharsets.UTF_8));
    }
}
