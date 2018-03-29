<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="Keywords" content="">
		<meta name="Description" content="">
		<title>聊天室</title>
		<link rel="shortcut icon" href="img/favicon.png" type="image/x-icon"> 
		<link href="css/bootstrap.css" rel="stylesheet" />
		<link href="css/bootstrap-theme.min.css" rel="stylesheet" />
		<!-- Begin emoji-picker Stylesheets -->
		<link href="css/emoji.css" rel="stylesheet">
		<!-- End emoji-picker Stylesheets -->
		<link href="css/my.css " rel="stylesheet " />

		<script src="js/jquery.min.js "></script>
		<script src="js/emoji.js"></script>
		<script src="js/bootstrap.min.js "></script>

	</head>

	<body>
		<div class="container center">

			<div class="row box-center">
				<div class="box-img-center">
					<img width="50%" height="50%" src="img/box.png" alt="网络似乎有点问题">
				</div>
				<div class="box-text-center">
					<input id="username" type="text" value="请输入昵称" maxlength="12" />
					<!--
						跳转修改头像界面
                    -->
					<a href="">
						<div id="userPicture">
							<img width="100%" height="100%" style="border-radius: 100%" src="img/box.png" alt="网络似乎有点问题">
						</div>
					</a>
					<div id="message">
						
						
						<div id="messInfo">
							<div class="messUserPicture left">
								<img width="100%" height="100%" style="border-radius: 100%" src="img/box.png" alt="网络似乎有点问题">
							</div>
							<div id="userInfo">hahahahahah</div>
							<div id="mess">
								<p class="triangle-right left">他们的消息他们的消息他们的消息他们的消息他们的消息他们的消息他们的消息</p>
							</div>
							
						</div>
						
						<div id="messInfo">
							<div class="messUserPicture right">
								<img width="100%" height="100%" style="border-radius: 100%" src="img/box.png" alt="网络似乎有点问题">
							</div>
							<div id="userInfo">hahahahahah</div>
							<div id="mess">
								<p class="triangle-right right">他们的消息他们的消息他们的消息他们的消息他们的消息他们的消息他们的消息</p>
							</div>
							
						</div>

						<div id="messInfo">
							<div class="messUserPicture left">
								<img width="100%" height="100%" style="border-radius: 100%" src="img/box.png" alt="网络似乎有点问题">
							</div>
							<div id="userInfo">hahahahahah</div>
							<div id="mess">
								<p class="triangle-right left">他们的消息他们的消息他们的消息他们的消息他们的消息他们的消息他们的消息</p>
							</div>
							
						</div>

					</div>
					<textarea id="editor" class="" data-emojiable="true"></textarea>
					<button id="font-btn" class="btn btn-sm "></button>
					<div id="font-controller">
						<div class="btn-group" data-toggle="buttons">
							<label class="btn btn-primary" id="bold">
    							<input type="checkbox" autocomplete="off">B
  							</label>
							<label class="btn btn-primary" id="italics">
    							<input type="checkbox" autocomplete="off">I
  							</label>
							<label class="btn btn-primary" id="underline">
    							<input type="checkbox" autocomplete="off">U
  							</label>
						</div>
						<div class="msg_caption">
							<button class="bigger">放大</button>
							<button class="smaller">缩小</button>
						</div>
					</div>
					<button id="send" type="button" class="btn btn-xs btn-success">发&nbsp;&nbsp;&nbsp;送</button>
					<button id="exit" type="button" class="btn btn-xs btn-danger">关&nbsp;&nbsp;&nbsp;闭</button>
				</div>
			</div>

		</div>
		<!-- Begin emoji-picker JavaScript -->
		<script src="js/config.js"></script>
		<script src="js/util.js"></script>
		<script src="js/jquery.emojiarea.js"></script>
		<script src="js/emoji-picker.js"></script>
		<!-- End emoji-picker JavaScript -->
		
		<script src="js/my.js "></script>

		<script>
			var root = "<%=request.getContextPath()%>";﻿﻿
			$(document).ready(function() {
				getInfo()

			});
			/**
			 * 使用消息推送服务EventSource获取后台消息
			 */
			function getInfo() {
				if (typeof(EventSource) !== "undefined") {
					var imUrl = root + "/" + "room/getInfo";
					var eventSource = new EventSource(imUrl);

			        //只要和服务器连接，就会触发open事件
			        eventSource.addEventListener("open",function(){
			           console.log("和服务器建立连接");
			        });

			        //处理服务器响应报文中的load事件
			        eventSource.addEventListener("load",function(e){
			        	var result = JSON.parse(e.data);
			            console.log("服务器发送给客户端的数据为:" + result);
			        });


				} else {
					alert("该浏览器不支持数据推送服务，请更换浏览器打开（推荐：Firefox、Chrome、Opera、Safari）");
				}
			}

			$("#send").click(function() {
				var info = $("#editor").val();
				$.ajax({
					url: root + "/room/send",
					type: "post",
					cache: false,
					data: {
						info: info
					},
					dataType: "json",
					error: function() {
						alert("网络出错！");
					},
					success: function(result) {
						$('#message').emoji();
					}
				});
			});
		</script>
	</body>

</html>
