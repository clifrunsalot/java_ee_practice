<%@ page import="java.util.ArrayList"%>

<%!public ArrayList<Integer> add(int[] ary) {

		ArrayList<Integer> outAry = new ArrayList<Integer>();
		for (int i : ary) {
			outAry.add(i);
		}

		return outAry;
	}%>

<%
	ArrayList<Integer> myAry = new ArrayList<Integer>();
	int[] iAry = { 1, 2, 3, 4, 5 };
	myAry = add(iAry);
	int total = 0;
%>

The content of the array is:
<br>
<%
	for (int i : myAry) {
%>
i:
<%=i%>
<%=total += i%><br>
<%
	}
%>

Sum:
<%=total%>
