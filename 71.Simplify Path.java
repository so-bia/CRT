 

public String simplifyPath(String path) {
   
    String[] parts = path.split("/");
    Stack<String> stack = new Stack<>();

    for (String part : parts) {
    
        if ("..".equals(part)) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } 
    
        else if (!".".equals(part) && !part.isEmpty()) {
            stack.push(part);
        }
    }

    StringBuilder result = new StringBuilder();
 
    for (String dir : stack) {
        result.append("/").append(dir);
    }
    
    return result.length() == 0 ? "/" : result.toString();
}
