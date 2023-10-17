<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Деталі новини</title>
</head>
<body>
<h1>Деталі новини</h1>

    <h2>${news.title}</h2>
    <img src="${news.imageUrl}" alt="${news.title} Image" width="400" height="300">
    <p>${news.fullText}</p>

<p><a href="manufacturer-news">Повернутися до списку новин</a></p>
</body>
</html>
