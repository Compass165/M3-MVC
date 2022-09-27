<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Show Product</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <link rel="stylesheet" href="css/workspace.css">
</head>
<body>
<div style="padding-right: 20px;padding-top: 10px; width: 100%">
  <a class="btn btn-secondary search-btn"
     href="/products?action=logout"
     style="float: right;">Logout</a>
</div>
<br>
<br>
<br>
<h2 align="center">Danh Sách sản phẩm</h2>
<%
  String log = "";
  if (request.getAttribute("log") != null) {
    log = (String) request.getAttribute("log");
  }
%>
<h4 align="center" id="status" style="color: green"><%=log%>
</h4>
<div>
  <br>
  <br>
  <form class="form-group search-form" action="/products" method="post">
    <input name="search" class="form-control search-input" type="text" placeholder="Type something to search">
    <input type="hidden" name="action" value="search">
    <button type="submit" class="btn btn-primary search-btn">Seacrh</button>
    <a href="/products?action=add"
       class="btn btn-primary search-btn">Add</a>
  </form>
  <table class="table table-striped table-bordered">
    <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Code</th>
      <th scope="col">Tên Sản Phẩm</th>
      <th scope="col">Giá thành</th>
      <th scope="col">Nơi sản xuất</th>
      <th scope="col">Sửa</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product" varStatus="count">
      <tr>
        <th scope="row">${count.count}</th>
        <td><a href="/products?action=view&code=${product.getCode()}">
          <c:out value="${product.getCode()}"></c:out></a></td>
        <td><c:out value="${product.getName()}"></c:out></td>
        <td><c:out value="${product.getPrice()}"></c:out></td>
        <td><c:out value="${product.getOrigin()}"></c:out></td>
        <td>
          <a href="/products?action=edit&code=${product.getCode()}"
             class="btn btn-primary">Edit</a>
          </button>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <%
    if (request.getAttribute("passStatus") != null) {
      request.setAttribute("passStatus", null);
      response.sendRedirect("/products");
    }
    ;%>
</div>
<div style="text-align: center; padding-top: 30px" id="return">
</div>
<%
  if (request.getAttribute("modified") != null) {
    out.print((String) request.getAttribute("modified"));

  }
%>
<script>
  function refresh() {
    document.getElementById("status").innerHTML = "";
  }

  setTimeout(refresh, 10000);
</script>
</body>
</html>