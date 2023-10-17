<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Новини</title>
    <style>
        .news-container {
            display: flex;
            flex-wrap: wrap;
        }
        .news-item {
            width: 300px;
            border: 1px solid #ccc;
            margin: 10px;
            padding: 10px;
        }
        .news-image {
            max-width: 100%;
        }
    </style>
</head>
<body>
<h1>Новини</h1>
<div class="news-container">
    <c:forEach items="${newsList}" var="news">
        <div class="news-item">
            <h2>${news.title}</h2>
            <img src="${news.imageUrl}" alt="${news.title} Image" width="200" height="150">
            <p>${news.description}</p>
            <a href="news-detail?id=${news.id}">Детальніше</a>
        </div>
    </c:forEach>
</div>
</body>
</html>
