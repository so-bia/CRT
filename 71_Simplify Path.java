 

public String simplifyPath(String path) {
    // Split the path based on /
    String[] parts = path.split("/");
    Stack<String> stack = new Stack<>();

    for (String part : parts) {
        // If "..", pop a directory from stack
        if ("..".equals(part)) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } 
        // If it's not "." or empty, it's a directory, so push to stack
        else if (!".".equals(part) && !part.isEmpty()) {
            stack.push(part);
        }
    }

    StringBuilder result = new StringBuilder();
    // Construct the result from the stack
    for (String dir : stack) {
        result.append("/").append(dir);
    }
    
    // If stack is empty, return root
    return result.length() == 0 ? "/" : result.toString();
}
