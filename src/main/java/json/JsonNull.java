package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 */

public class JsonNull extends Json {
    //    private final JsonNull jsonNull;
//
//    public JsonNull(JsonNull jsonNull) {
//        this.jsonNull = jsonNull;
//    }
//
//   @Override
//    public String toJson() {
//        return jsonNull.toJson();
//    }
//}
    @Override
    public String toJson() {
        return "null";
    }
}