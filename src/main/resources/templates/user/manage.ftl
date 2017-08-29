<!DOCTYPE html>
<html lang="zh">

<head>
	<title>hello ${loginUser.name}</title>
	<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="/css/user/manage.css" />
</head>
<body>
	<div class="container">
		<h1>用户管理</h1>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>性别</th>
				</tr>
			</thead>
			<tbody>
				
			</tbody>
		</table>
		
		<div class="row">
			<ul id="pagination-bar" class="pagination"></ul>
		</div>
	</div>
</body>
<script type="text/javascript" src="/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/js/popper.js"></script>
<script type="text/javascript" src="/js/bootstrap.js"></script>
<script type="text/javascript" src="/js/jquery.twbsPagination.js"></script>
<script type="text/javascript" src="/js/user/manage.js"></script>
</html>