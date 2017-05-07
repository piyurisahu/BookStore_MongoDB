
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>CRU operation  using mongoDB</h2>



    <form action="save" method="post"> 
<input type="hidden" name="id">
<label for="title">Book Title</label>
<input type="text" id="title" name="title"/> 
<label for="author">Book Author</label>
<input type="text" id="author" name="author"/>
<input type="submit" value="Submit"/>
</form>

 <table border="1">
<c:forEach var="book" items="${bookList}">  
<tr>
<td>${book.title}</td>
<td>${book.author}</td>
<td> <input type="button" value="delete" onclick="window.location='book/delete?id=${book.id}'"/></td>

</tr>
</c:forEach>
</table>        
</body>
</html>