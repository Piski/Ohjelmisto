package tdd;

import java.util.HashMap;
import java.util.Map;

public class Template {
    private Map<String, String> values;
    private String template;

    public Template(String template) {
        this.template = template;
        values = new HashMap<String, String>();
    }

    public String getTemplate() {
        return template;
    }

    public void clear() {
        template = "";
        values.clear();
    }

    public void korvaa(String changeFromValue, String changeToValue) {
        values.put(changeFromValue, changeToValue);
    }

    public String evaluoi() {
        String result = template;
        for(Map.Entry<String, String> pair : values.entrySet()) {
            String replacable = "\\$\\{" + pair.getKey() + "\\}";
            result = result.replaceAll(replacable, pair.getValue());
        }
        return result;
    }
}
