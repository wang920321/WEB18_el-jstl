<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %> 
<%@ page import="com.itheima.domain.*" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
       //模拟List<String> strList
       List<String> strList=new ArrayList<String>(); 
       strList.add("zhangsan");
       strList.add("lisi");
       strList.add("wangwu");
       session.setAttribute("strList", strList);
      /*  模拟List<User> userList */
       List<User> userList=new ArrayList<User>();
       User user1=new User();
       user1.setId(1);
       user1.setName("zhangsan");
       user1.setPassword("1234");
       User user2=new User();
       user2.setId(1);
       user2.setName("lisi");
       user2.setPassword("asdf");
       userList.add(user1);
       userList.add(user2);
       session.setAttribute("userList", userList);
       
       //遍历Map<String,String> 的值
       Map<String,String> strMap=new HashMap<String,String>();
       strMap.put("name", "lucy");
       strMap.put("age", "18");
       strMap.put("addr", "asdfas");
       strMap.put("email", "lucy@asdf.com");
       session.setAttribute("strMap", strMap);
       //遍历Map<String,String> 的值
       Map<String,User> userMap=new HashMap<String,User>();
       userMap.put("user1", user1);
       userMap.put("user2", user2);
       session.setAttribute("userMap", userMap);
    %>
        
        
       
       
    <c:forEach items="${strList }" var="str">
        ${str }
    </c:forEach>
    
    <c:forEach items="${userList }" var="user">
        ${user.name }
    </c:forEach>
    
    <c:forEach items="${strMap }" var="entry">
        ${entry.key }:${entry.value }
    </c:forEach>
    -------------------------------------<br>
    <c:forEach items="${userMap }" var="entryUser">
        ${entryUser.key }:${entryUser.value.name }
    </c:forEach>
</body>
</html>