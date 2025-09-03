// Last updated: 03/09/2025, 10:08:59
class Solution {
  public String simplifyPath(String path) {
    final String[] dirs = path.split("/");
    Stack<String> stack = new Stack<>();

    for (final String dir : dirs) {
      if (dir.isEmpty() || dir.equals("."))
        continue;
      if (dir.equals("..")) {
        if (!stack.isEmpty())
          stack.pop();
      } else {
        stack.push(dir);
      }
    }

    return "/" + String.join("/", stack);
  }
}