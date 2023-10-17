<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Загальна інформація</title>
</head>
<body>
<h1>Загальна інформація</h1>
<p><b>Назва виробника:</b> ${manufacturer.manufacturerName}</p>
<p><b>Місцезнаходження штаб-квартири:</b> ${manufacturer.headquarters}</p>
<p><b>Кількість співробітників:</b> ${manufacturer.employeesCount}</p>
<p><b>Коротка інформація:</b> ${manufacturer.description}</p>
<img src="${manufacturer.logoUrl}" alt="Логотип виробника">
<h1>Task2</h1>
<div id="menu">
    <ul>
        <li><a href="manufacturer-history.jsp">Історія розвитку виробника</a></li>
        <li><a href="manufacturer-news">Новини</a></li>
        <li><a href="manufacturer-laptops.jsp">Моделі ноутбуків</a></li>
    </ul>
</div>
</body>
</html>
