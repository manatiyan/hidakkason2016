package controllers;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import play.*;
import play.libs.Json;
import play.mvc.*;
import utils.ControllerUtils;
import views.html.*;

public class GetController extends Controller {

    public Result getInfo() {
        
        Map<String, Object> dataMap = Maps.newHashMap();
        dataMap.put("information", "本日のお知らせ");
        
        List<Object> data = Lists.newArrayList();
        data.add(dataMap);
        
        Map<String, Object> json = Maps.newHashMap();
        json.put("result", true);
        json.put("data", data);
        JsonNode result = Json.toJson(json);
        return ok(result);
    }

}
