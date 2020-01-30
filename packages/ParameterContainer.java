package packages;
import java.util.*;

public class ParameterContainer {
	protected static HashMap<String, String> optionsHashMap = new HashMap<String, String>();
	private static List<String> allowedOptions = null;
	protected static HashMap<String, String> defaultOptionsHashMap = null;
	private static final String[] allowed = new String[] {
		"one","two","three"	
	};
	
	public ParameterContainer() {
		if(allowedOptions == null) {
			allowedOptions = new ArrayList<String>();
			Collections.addAll(allowedOptions, allowed);
		}
		InitDefaults();
	}
	
	public static void main(String[] args) {
//		ParameterContainer param = new ParameterContainer();
//		param.setParameterValue("two","2");
//		String value = param.getParameterValue("two");
//		System.out.println(optionsHashMap);
	}
	
//	public String s(Agent a)
//	{
//	    try
//	    {
//	        if (AgentsPool.getAgentByName(a.getName()) == null)
//	            AgentsPool.addAgent(a);
//	        return a.getName();
//	    } catch (NullPointerException e)
//	    {
//	        System.err.println("ERROR: Agent Not Found");
//	        return "";
//	    }
//	}
//
//	public Agent a(String s)
//	{
//	    return AgentsPool.getAgentByName(s);
//	}
	
	public String getParameterValue(String param) {
		String ret = optionsHashMap.get(param);
		return ret;
	}
	
	public static void InitDefaults() {
		if(defaultOptionsHashMap == null) {
			defaultOptionsHashMap = new HashMap<String,String>();
			defaultOptionsHashMap.put("one","1");
			defaultOptionsHashMap.put("two","5");
			defaultOptionsHashMap.put("three","3");
		}
	}
	
	public void setParameterValue(String param,String value) {
		try {
	        if (allowedOptions.contains(param)) {
	            optionsHashMap.put(param, value);
	        } else {
	            throw new IllegalArgumentException("Parameter " + param + " is not valid. Typo?");
	        }
	    } catch (IllegalArgumentException e) {
	        System.err.println("Error");
	    }
	}

	public int i(String s) {
	    return Integer.parseInt(s);
	}

	public float f(String s) {
	    return Float.parseFloat(s);
	}

	public boolean b(String s) {
	    if ("on".equals(s))
	        return true;
	    else if ("off".equals(s))
	        return false;
	    else
	        throw new Error("Error");
	}
	
	public String s(boolean b) {
	    return b ? "on" : "off";
	}
	
	public String s(Object i) {
	    return String.valueOf(i);
	}

	public static int getTotalNumberOfOptions() {
	    return defaultOptionsHashMap.size();
	}

	public static int getNumberOfAllowedOptions() {
	    return allowed.length;
	}

	public static String getDefaultParameterValue(String param) {
	    if (allowedOptions.contains(param)) {
	        assert (defaultOptionsHashMap.get(param) != null);
	        return defaultOptionsHashMap.get(param);
	    } else {
	        System.err.println("Error");
	        return null;
	    }
	}
}
