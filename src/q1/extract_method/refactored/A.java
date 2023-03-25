

package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList, p);
      // other implementation
      return null;
   }
   
   <T extends Graph> T extractedMethod(List<T> objs, String p) {
	   for (T obj: objs) {
		   if (obj.contains(p)) {
			   System.out.println(obj);
		   }
	   }
	   return null;
   }
}

class Graph {
	String name;
	
	boolean contains(String p) {
		return name.contains(p);
	}
}


class Node extends Graph {
}

class Edge extends Graph {
}