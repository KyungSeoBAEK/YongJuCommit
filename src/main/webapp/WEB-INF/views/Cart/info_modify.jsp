<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 주문목록</title>
</head>
<body>
	<%@ include file="../include/header.jsp"%>

	<div
		style="width: 100%; height: 80%; padding: 0px; background-color: #f3f3f3">
		<div
			style="width: 20%; height: auto; padding: 50px 0px 0px 130px; float: left;"
			class="inside-header">
			<%@ include file="../include/inside_header.jsp"%>
		</div>
		<form>
			<div
				style="width: 80%; height: auto; padding: 50px 40px; float: left;">
				<div
					style="width: 100%; height: 185px; margin: 0px 0px 40px; padding: 50px 0px 20px 45px; background-color: #ffffff;">
					<div
						style="width: 50%; height: 85px; margin: 0px 0px 0px 24px; color: #212121; float: left;">
						<div
							style="width: 85px; height: 85px; float: left; margin-right: 25px;">
							<img style="width: 85px; height: 85px;"
								src="${pageContext.request.contextPath}/resources/img/default_profile.png">
						</div>
						<span
							style="width: 60%; height: 25px; font-size: 22px; text-align: center;">
							ID값으로Name/님 안녕하세요 </span>
					</div>
				</div>

				<div
					style="width: 100%; height: 50px; margin: 0px 0px 40px; padding: 25px 0px 20px 0px; font-size: 22px; font-weight: bold;">
					정보수정</div>

				<div align="center"
					style="width: 70%; height: auto; margin: 0px 0px 40px; padding: 25px 0px 20px 0px;">

					<div>
						<span>아이디</span>
						<input title="아이디" type="id" name="mId" readonly="readonly"
							value="" required="required">
					</div>
					<div>
						<span style="padding-left: 50px;">비밀번호 변경</span> <input title="비밀번호" type="password" name="mPw" value=""
							autocomplete="off" placeholder="비밀번호 변경">
					</div>
					<div>
						<span style="padding-left: 50px;">비밀번호 확인</span> <input title="비밀번호 확인" type="password" name="mPw" value=""
							autocomplete="off" placeholder="비밀번호 확인">
					</div>
					<div>
						<span style="margin-left: -20px;">이름</span> <input title="이름" type="text" name="mName" readonly="readonly"
							value="">
					</div>
					<div>
						<span style="padding-left: 13px;">전화번호</span> <input title="전화번호" type="text" name="mPhone" value=""
							placeholder="전화번호">
					</div>
					<div>
						<span style="margin-left: -20px;">주소</span> <input title="주소" type="text" name="mAddr" value=""
							placeholder="주소">
					</div>
					<div>
						<span style="padding-left: 5px;">이메일</span> <input style="padding-left: 10px;" title="e-mail" type="text" name="mEmail" value=""
							placeholder="이메일">
					</div>

				</div>

			</div>

		</form>
	</div>
</body>
<footer>
	<%@include file="../include/footer.jsp"%>
</footer>
</html>