package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import play.*;
import play.libs.Json;
import play.mvc.*;
import utils.ControllerUtils;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class TestController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        //return ok(index.render("Your new application is ready."));
        return ok("index");
    }
    
    @BodyParser.Of(BodyParser.Json.class)
    public static Result sayHello() {
        JsonNode json = request().body().asJson();
        if(json == null) {
            return badRequest("Expecting Json data");
        } else {
            String name = json.findPath("name").textValue();
            if(name == null) {
                return badRequest("Missing parameter [name]");
            } else {
                return ok("Hello " + name);
            }
        }
    }
    
    @BodyParser.Of(BodyParser.Json.class)
    public Result getMessages() {

        //List<Message> messages;

        JsonNode json = ControllerUtils.getBodyAsJson();
        if (json == null) {
            return badRequest("Expecting json data");
        }

//        JsonNode idNode = json.findValue("id");
//        if (idNode == null) {
//            messages = chatQuery.getMessages();
//        } else {
//            int id = idNode.asInt(-1);
//            if (id < 0) {
//                return badRequest("Expecting positive integer");
//            }
//            messages = chatQuery.getMessagesAfter(id);
//        }

        //JsonNode result = Json.toJson(messages);
        JsonNode result = Json.toJson("messages");
        return ok(result);
    }

}
