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
                <th>社員ID</th>
                <th>名前</th>
                <th>削除フラグ</th>
                <th>更新日時</th>
            </tr>
        </thead>

        <tbody>
        <c:forEach var="testbean" items="${testbean}">
          <tr>
              <td>${testbean.memberid}</td>
              <td>${testbean.membername}</td>
              <td>${testbean.delflg}</td>
              <td>${testbean.upddate}</td>
          </tr>
      </c:forEach>
        </tbody>

    </table>

</body>
</html>