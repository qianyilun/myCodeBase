// uglyJsonString --> pretty Json String (Human readable)
// https://stackoverflow.com/questions/4105795/pretty-print-json-in-java
public static String prettyJsonFormat(String uglyJsonString) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    JsonParser jp = new JsonParser();
    JsonElement je = jp.parse(uglyJsonString);
    return gson.toJson(je);
}