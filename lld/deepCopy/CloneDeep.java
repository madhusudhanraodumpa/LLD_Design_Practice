package deepCopy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CloneDeep {
    public String name;
    public Map<Integer,Integer> map;
    public CloneDeep(CloneDeep c){
        this.name=new String(c.name);
        Map<Integer,Integer> m = new HashMap();
        Iterator<Integer> it = c.map.keySet().iterator();
        while(it.hasNext()){
            Integer key=it.next();
            m.put(key,c.map.get(key) );
        }
        this.map =m;
    }
    public CloneDeep(){}
}
