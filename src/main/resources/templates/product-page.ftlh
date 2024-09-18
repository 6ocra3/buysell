<!DOCTYPE html>
<html>
<head>
<title>Buysell</title>
</head>
<body>
<h1>Информация о товаре</h1>
<h3>${product.title}</h3>
<p>${product.description}</p>
<p>${product.price}</p>
<p>${product.city} | ${product.author}</p>

<h4>Удалить товар</h4>
<form action="/product/delete/${product.id}" method="post">
    <button type="submit">Удалить товар</button> 
</form>

</body>
</html>
