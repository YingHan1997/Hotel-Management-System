<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>会员中心</title>
  <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
  <script type="text/javascript" src="bootstrap/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
  <meta name=”viewport” content=”width=device-width, initial-scale=1″ />
	<style type="text/css">
	/*背景图*/
	  body{
	  	background-image: url(sucai/beijing.png);
        background-repeat:no-repeat;
        background-size:auto;
       }
       /*导航栏*/
       *{
           margin: 0px;
           padding:0px;
        }
        .topbody{
           width:900px;
           margin: 0 auto;
        }
        .topbar{
           width:100%;
           background-color: #000;
           display: inline-block;
        }

        .topbar li{
           float:left;
        }
        .toplist{
           display: inline-block;
           list-style-type:none;
        }
        .toplist a{
           color:#FFF;
           text-decoration: none;
        }
        .title,.toplist a{
           display:block;
           display: block;
           float: left;
        }
        .toplist a{
           padding:15px 20px 15px 20px;
        }
        .title{
           color:#FFF;
           text-decoration: none;
           padding:15px 30px 15px 30px;
        }
        .logo{
           width: 80px;
           height: 50px;
           float: left;
           position: relative;
           left: 16%;
           padding-top: 6px;
        }
        .content{
        	position: absolute;left:16%;top:20%; 
        }
        .div-b{ 
        	width:1025px;height:600px;padding:5px;
        	filter: alpha(opacity=60);background-color:rgba(255, 255, 255, 0.5)
        }
        /*侧边栏*/
        .rectangle{
          position: relative;
          float: left;
          top: 30px;
          left: 10px;
        }
        .rejest{
          width: 200px;
          height: 40px;
          position: relative;
          left: 10px;
          margin-top: 12px;
          top: 12px;
          background-color: #171814;
          border: none;
          color: white;
          font-family: 微软雅黑；
        }
        /*内容*/
        .title1{
          position: relative;
          margin-top: 30px;
          left:27%;
          color: #8A6538;
          font-family:微软雅黑;
          font-weight: bold;
          font-size: 24px;
        }
        #table1{
          position: relative;
          right: 5px;
          float: right;
          top: 15px;
         filter: alpha(opacity=60);background-color:rgba(255, 255, 255, 0.5);
        }
        .btn-danger{
          float: left;
        }
        .btn-success{
          margin-right: 80px;
        }
        .btn-info{
          margin-top: -33px;
          float: right;
         }
         .login-button-box button{
          float: right;
          position: relative;
          right: 150px;
          margin-top: 12px;
          background-color: #ff7d0a;
          color: #ffffff;
          font-size: 16px;
          width: 386px;
          height: 40px;
          margin-left: 18px;
          border: 1px solid #ff7d0a;
          border-radius: 4px;
          position: relative;
          right:21%;
          }
        .checkbox{
          padding-left:10px; 
        }
    </style>
</head>
<body>
	<!--导航-->
	<div class="nav">
	  <div class="topbar">
	  	<img src="sucai/logo.png" class="logo">
        <div class="topbody"> 
           <a class="title" href="">腾达宾馆</a>
            <ul class="toplist">
             <li><a href="">首页</a></li>
             <li><a href="">设施与价格</a></li>
             <li><a href="">会员中心</a></li>
             <li><a href="">帮助</a></li>
             <li><a href="">登陆</a></li>             
             <li><a href="">注册</a></li>             
            </ul>
       </div>
    </div>
  </div>

	<!--内容-->
	<div class="content">
	   <div class="div-b">
	   	    <!--侧边栏-->
          <div class="rectangle" style="width: 220px;height: 300px; background-color: #2A231C;" >
            <form>
               <button class="rejest">客房预订</button>
               <button class="rejest">历史订单</button>
               <button class="rejest">修改信息</button>
               <button class="rejest">修改密码</button>
               <button class="rejest">退出系统</button>
            </form>         
          </div>
          <div class="title1">
            预订房间
          </div>
          <div >
            <div class="checkbox">
             <label class="checkbox-inline">
             <input type="checkbox" id="inlineCheckbox1" value="option1"> 101
             </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <label class="checkbox-inline">
             <input type="checkbox" id="inlineCheckbox2" value="option2"> 102
             </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <label class="checkbox-inline">
             <input type="checkbox" id="inlineCheckbox3" value="option3"> 103
             </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <label class="checkbox-inline">
             <input type="checkbox" id="inlineCheckbox3" value="option3"> 104
             </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <label class="checkbox-inline">
             <input type="checkbox" id="inlineCheckbox3" value="option3"> 105
             </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <label class="checkbox-inline">
             <input type="checkbox" id="inlineCheckbox3" value="option3"> 106
             </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           </div>
           <div class="login-button-box">
               <button>新建信息</button>
          </div>
         </div>
      </div>
   </div>

</body>
</html>