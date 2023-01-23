package mentor;


import com.google.gson.*;

public class SimpleJson {

	public static void main(String[] args) {
		
		String SimpleJson
        = "{\"fruit\" : \"Apple\", \"size\" : \"Large\", \"color\" : \"Red\"}";
		Gson gson = new Gson();
		
		Simple simple=new Gson().fromJson(SimpleJson, Simple.class);
		System.out.println(simple);
		
	}

	
}
