<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html lang="ja">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>成功</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

    <!-- Bootstrap theme -->
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
  </head>

 </head>

<body>

    <div class="jumbotron">
        <h3>AWSのRDSに登録されている内容です</h3>
    </div>

    <table class="table table-striped table-hover table-bordered ">
        <thead>
            <tr>
                <th>書籍番号</th>
                <th>書籍名</th>
                <th>価格(円)</th>
                <th>著者</th>
            </tr>
        </thead>

        <tbody>
        <c:forEach var="testbean" items="${testbean}">
          <tr>
              <td>${testbean.id}</td>
              <td>${testbean.name}</td>
              <td>${testbean.price}</td>
              <td>${testbean.authorname}</td>
          </tr>
      </c:forEach>
        </tbody>

    </table>

</body>
</html>