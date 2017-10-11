<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>  
    <meta charset="UTF-8">  
    <title>Document</title>  
    <!-- <script type="text/javascript" src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>  -->
    <script type="text/javascript" src="${ctx}/static/js/jquery/jquery-1.11.1.min.js"></script>  
    
    </head>  
    <body>  
        <form enctype="multipart/form-date" method="post">  
            <input type="file" class="file">  
            <input type="submit" class="sub">  
        </form>  
        <img src="" class="fileImg">  
    </body>  
    
    <script type="text/javascript">  
	    $(function(){  
	        $(".file").change(function(){  
	            var fileImg = $(".fileImg");  
	            var explorer = navigator.userAgent; 
	            var imgSrc = $(this)[0].value;  
	            if (explorer.indexOf('MSIE') >= 0) {  
	                if (!/\.(jpg|jpeg|png|JPG|PNG|JPEG)$/.test(imgSrc)) {  
	                    imgSrc = "";  
	                    fileImg.attr("src","/img/default.png");  
	                    return false;  
	                }else{  
	                    fileImg.attr("src",imgSrc);  
	                }  
	            }else{  
	                if (!/\.(jpg|jpeg|png|JPG|PNG|JPEG)$/.test(imgSrc)) {  
	                    imgSrc = "";  
	                    fileImg.attr("src","/img/default.png");  
	                    return false;  
	                }else{  
	                    var file = $(this)[0].files[0];  
	                    var url = URL.createObjectURL(file);  
	                    fileImg.attr("src",url);  
	                }  
	            }  
	        })  
	    });
    </script>  
</html>