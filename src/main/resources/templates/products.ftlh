<!DOCTYPE html>
<html>
<head>
<title>Buysell</title>
</head>
<body>
<h1>Buy sell</h1>
<h4>Товары со всей России</h4>

<#list products as product>
    <div>
        <p><b>${product.title}</b> | ${product.price}  ${product.city} | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявления: <input type="text" name="title"/> <br/><br/>
    Описание объявления: <input type="text" name="description"/> <br/><br/>
    Цена: <input type="number" name="price"/> <br/><br/>
    Автор: <input type="text" name="author"/> <br/><br/>
    Город: <input type="text" name="city"/> <br/><br/>
    <button type="submit">Добавить товар</button> 

</form>


</body>
</html