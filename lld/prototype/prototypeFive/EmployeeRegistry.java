package prototype.prototypeFive;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRegistry {
    Map<String, Employee> map = new HashMap<>();

    public void registry(String key, Employee e){
        map.put(key,e);
    }

    public Employee get(String key){
        return map.get(key);
    }
}
