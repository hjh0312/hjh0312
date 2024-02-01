<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="admin.jsp"%>

<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

div.center {
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

table {
	width: 67%;
	border-collapse: collapse;
	margin: auto;
}

table, th, td {
	border: 1px solid #ddd;
}

th, td {
	padding: 12px;
	text-align: left;
	font-weight: bold;
	margin-bottom: 20px;
	text-align: center; /* 가운데 정렬 */
}

th {
	background-color: #f2f2f2;
}

input[type="text"], input[type="file"], textarea {
	width: calc(100% - 20px);
	padding: 10px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

input[type="submit"], input[type="reset"] {
	background-color: #4CAF50;
	color: #fff;
	padding: 10px 15px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	border-radius: 3px;
}

input[type="submit"]:hover, input[type="reset"]:hover {
	background-color: #45a049;
}

form {
	margin-top: -340px; /* 필요한 만큼 조절하세요 */
}

/* 추가된 스타일 */
.outline {
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius: 8px;
	background-color: #fff;
}

caption {
	font-size: 24px;
	font-weight: bold;
	margin-bottom: 20px;
}

td[colspan="2"] {
	text-align: center;
}

th {
	padding: 1px;
	text-align: left;
	font-weight: bold;
	margin-bottom: 20px;
	text-align: center;
}

td {
	padding: 5px;
	text-align: left;
	font-weight: initial;
	margin-bottom: 20px;
	text-align: center;
}

.flex-container {
	display: flex;
	justify-content: space-around; /* 요소들 간의 간격을 조절합니다 */
}

table {
	width: 100%; /* 테이블의 너비를 100%로 설정 */
}
</style>

<script type="text/javascript">
	function mdelete(no) {
		var isDel = window.confirm("정말로 탈퇴 하시겠습니까?")
		if (isDel) {
			location.href = "deleteAdmin.do?no=" + no
		}
	}
</script>

<body>
	<div class="flex-container">
		<div align="center">
			<form name="f" action="" method="post" enctype="multipart/form-data">
				<table border="0" class="outline" width="100%">
					<tr>
						<th style="font-size: 20px;" colspan="10">회원 목록</th>
					</tr>
					<tr>
						<th>아이디</th>
						<th>비밀번호</th>
						<th>이름</th>
						<th>이메일</th>
						<th>전화번호</th>
						<th>주민번호</th>
						<th>가입 날짜</th>
						<th>사업번호</th>
						<th>수 정 | 삭 제</th>
					</tr>
					<c:if test="${empty Lmember}">
						<tr>
							<td colspan="4">등록된 카테고리가 없습니다.</td>
						</tr>
					</c:if>
					<c:forEach var="dto" items="${Lmember}">
						<tr>
							<td>${dto.id}</td>
							<td>${dto.pw}</td>
							<td>${dto.name}</td>
							<td>${dto.email1}@${dto.email2}</td>
							<td>${dto.tel1}-${dto.tel2}-${dto.tel3}</td>
							<td>${dto.ssn1}-${dto.ssn2}</td>
							<td>${dto.joindate}</td>
							<td>${dto.bnr}</td>
							<c:if test="${dto.id == 'admin'}">
								<td colspan="2"><a style="text-decoration: none;" href="admin_mypage.do?id=${dto.id}">수
										정</a></td>

							</c:if>
							<c:if test="${dto.id != 'admin'}">
								<td colspan="2"><a style="text-decoration: none;" href="javascript:mdelete(${dto.no})">삭
										제</a></td>

							</c:if>

						</tr>
					</c:forEach>

				</table>
			</form>
		</div>
	</div>
</body>