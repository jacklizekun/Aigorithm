package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class L1436 {
	 public String destCity(List<List<String>> paths) {
	        Map<String, String> map = prepare(paths);
	        String from = paths.get(0).get(0);
	        while(true){
	            if(!map.containsKey(from))
	                return from;
	            from = map.get(from);
	        }
	    }

	    private Map<String, String> prepare(List<List<String>> paths){
	        Map<String, String> map = new HashMap<>();
	        for(List<String> path : paths)
	            map.put(path.get(0), path.get(1));
	        return map;
	    }

}
