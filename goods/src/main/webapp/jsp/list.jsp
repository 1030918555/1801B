<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<script>
	function fenye(cpage){
		$("[name='cpage']").val(cpage);
		$("form").submit();
	}

</script>
</head>
<body>

	<form action="/list" method="post">
		<input type="hidden" name="cpage">
	商品名称：<input type="text" name="mohu1" value="${map.mohu1 }">
		<input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>尺寸</td>
			<td>价格</td>
			<td>数量</td>
			<td>标签</td>
			<td>图片</td>
			<td>商品品牌</td>
			<td>商品种类</td>
		</tr>
		<c:forEach items="${list }" var="goods">
				<tr>
					<td>${goods.id }</td>
					<td>${goods.goodsName }</td>
					<td>${goods.englishName }</td>
					<td>${goods.goodsSize }</td>
					<td>${goods.goodsMoney }</td>
					<td>${goods.goodsNumber }</td>
					<td>${goods.goodsTaglib }</td>
					<td>
						<img alt="图片无法展示" src="${goods.goodsPic }">
					
					</td>
					<td>${goods.brand.brandName }</td>
					<td>${goods.type.typeName }</td>
				</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
				<input type="button" value="首页" onclick="fenye(1)">
				<input type="button" value="上一页" onclick="fenye(${pi.isIsFirstPage()?1:pi.getPrePage()})">
				<input type="button" value="下一页" onclick="fenye(${pi.isIsLastPage()?pi.getPages():pi.getNextPage()})">
				<input type="button" value="尾页" onclick="fenye(${pi.getPages()})">
			</td>
		</tr>
	</table>
</body>
</html>