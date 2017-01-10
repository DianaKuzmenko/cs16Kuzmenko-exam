package json;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    public JsonObject(JsonPair... jsonPairs) {
       JsonObject jsonObject = new JsonObject();
    }

    @Override
    public String toJson() {
        return null;
    }

    public void add(JsonPair jsonPair) {
        Collection<JsonObject> objects = new ArrayList<JsonObject>();
        JsonObject object1 = new JsonObject();
        objects.add(object1);
    }

    public Json find(String name) {
        JsonObject findel = new JsonObject();

        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
