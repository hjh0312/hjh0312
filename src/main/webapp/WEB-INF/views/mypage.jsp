<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ include file="top2.jsp"%>
<html lang="ko" data-bs-theme="auto">
<head>
<script src="/docs/5.3/assets/js/color-modes.js"></script>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="generator" content="Hugo 0.118.2">
<title>마이페이지</title>

<link rel="stylesheet"
   href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
<link
   href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
   rel="stylesheet"
   integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
   crossorigin="anonymous">

<!-- Favicons -->

<meta name="theme-color" content="#712cf9">
<style>

/* 기존 스타일에 추가된 부분 */
.nav-pills .nav-link {
   padding: 0.5rem 1rem; /* 버튼 크기를 늘리려면 여기의 패딩 값을 조정합니다. */
   font-size: 1.2rem; /* 버튼 안의 텍스트 크기를 조정합니다. */
}

.btn-primary {
   padding: 1rem 2rem; /* 버튼 크기를 늘리려면 여기의 패딩 값을 조정합니다. */
   font-size: 1.5rem; /* 버튼 안의 텍스트 크기를 조정합니다. */
}

body {
   border-color: white; /* 보더 그라운드 컬러를 하얀색으로 설정 */
   color: gray; /* 폰트 컬러를 회색으로 설정 */
}

h3 {
   font-size: 4.75rem;
}

.form-control {
   display: block;
   width: 105% !important;
   padding: 8px;
   font-size: 16px;
}

.form-group {
   display: flex;
   align-items: center;
   font-size: 18px;
}

.form-group label {
   margin-right: 20px;
   width: 90px;
   text-align: right;
}

.form-group .disabled-field {
   flex-grow: 1;
   margin-right: 15px;
}

.form-group button {
   align-self: flex-end;
}

.w-100 {
   width: 32% !important;
}
/* 기존 CSS 코드에 추가할 부분 */
.nav-link {
   text-decoration: none !important; /* 링크의 밑줄을 제거합니다. */
}

/* 버튼에 호버 시 스타일 */
.nav-link:hover {
   /* 여기에 원하는 호버 시 스타일을 추가할 수 있어요. */
   
}

.container {
   padding-top: 100px; /* top.jsp를 인클루드할 때 가려지는 부분을 보여줄 수 있도록 여유를 둡니다. */
}

.bd-placeholder-img {
   font-size: 1.125rem;
   text-anchor: middle;
   -webkit-user-select: none;
   -moz-user-select: none;
   user-select: none;
}

@media ( min-width : 768px) {
   .bd-placeholder-img-lg {
      font-size: 3.5rem;
   }
}

.b-example-divider {
   width: 100%;
   height: 3rem;
   background-color: rgba(0, 0, 0, .1);
   border: solid rgba(0, 0, 0, .15);
   border-width: 1px 0;
   box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em
      rgba(0, 0, 0, .15);
}

.b-example-vr {
   flex-shrink: 0;
   width: 1.5rem;
   height: 100vh;
}

.bi {
   vertical-align: -.125em;
   fill: currentColor;
}

.nav-scroller {
   position: relative;
   z-index: 2;
   height: 2.75rem;
   overflow-y: hidden;
}

.nav-scroller .nav {
   display: flex;
   flex-wrap: nowrap;
   padding-bottom: 1rem;
   margin-top: -1px;
   overflow-x: auto;
   text-align: center;
   white-space: nowrap;
   -webkit-overflow-scrolling: touch;
}

.btn-bd-primary { -
   -bd-violet-bg: #712cf9; -
   -bd-violet-rgb: 112.520718, 44.062154, 249.437846; -
   -bs-btn-font-weight: 600; -
   -bs-btn-color: var(- -bs-white); -
   -bs-btn-bg: var(- -bd-violet-bg); -
   -bs-btn-border-color: var(- -bd-violet-bg); -
   -bs-btn-hover-color: var(- -bs-white); -
   -bs-btn-hover-bg: #6528e0; -
   -bs-btn-hover-border-color: #6528e0; -
   -bs-btn-focus-shadow-rgb: var(- -bd-violet-rgb); -
   -bs-btn-active-color: var(- -bs-btn-hover-color); -
   -bs-btn-active-bg: #5a23c8; -
   -bs-btn-active-border-color: #5a23c8;
}

.bd-mode-toggle {
   z-index: 1500;
}

.bd-mode-toggle .dropdown-menu .active .bi {
   display: block !important;
}

.col-sm-6 {
   width: 48% !important;
}
</style>

</head>
<body>

   <div class="container mt-5" align="center">
      <hr class="my-2">
      <main>
      <div class="w-50 p-3 text-center">
         <h3>M Y P A G E</h3>
         <br> <br>
         <div class="row">
            <div class="col">

               <div class="tabs tabs-bottom tabs-center tabs-simple">
                  <ul class="nav nav-pills" role="tablist">
                     <br>
                     <br>
                     <br>
                     <br>
                     <li class="nav-item active" role="presentation"><a
                        class="nav-link active" href="#tabsNavigationSimple1"
                        data-bs-toggle="tab" aria-selected="true" role="tab">계정 정보</a></li>
                     <li class="nav-item" role="presentation"><a class="nav-link"
                        href="#tabsNavigationSimple2" data-bs-toggle="tab"
                        aria-selected="false" role="tab" tabindex="-1" width=400px>관심
                           브랜드</a></li>
                     <li class="nav-item" role="presentation"><a class="nav-link"
                        href="#tabsNavigationSimple3" data-bs-toggle="tab"
                        aria-selected="false" role="tab" tabindex="-1">창업 문의</a></li>

                  </ul>
                  <hr class="my-4" style="border-top: 1px solid #000;">


                  <div class="tab-content">

                     <div class="tab-pane active show" id="tabsNavigationSimple1"
                        role="tabpanel">
                        <form name="uf" action="updateMember.do"
                           onsubmit="return update()">
                           <div class="text-center">

                              <input type="hidden" name="no" value="${getMember.no}" />
                              <div class="mb-3 form-group">
                                 <label for="disabledTextInput">이름</label>
                                 <fieldset class="disabled-field">
                                    <input type="text" id="disabledTextName" name="name"
                                       class="form-control" placeholder="Disabled input"
                                       value="${getMember.name}" required disabled>
                                 </fieldset>

                                 <button type="button" class="btn btn-secondary"
                                    onclick="enableInput()">수정</button>
                              </div>
                              <br>
                              <div class="mb-3 form-group">
                                 <label for="disabledTextInput">이메일</label>
                                 <div class="row g-1">
                                    <!-- 컬럼 간격을 1로 줄임 -->
                                    <div class="col-sm-6">
                                       <fieldset class="disabled-field">
                                          <input type="text" id="disabledTextemail1" name="email1"
                                             class="form-control" placeholder="Disabled input"
                                             value="${getMember.email1}" required disabled>
                                       </fieldset>
                                    </div>
                                    @
                                    <div class="col-sm-6">
                                       <fieldset class="disabled-field">
                                          <input type="text" id="disabledTextemail2" name="email2"
                                             class="form-control" placeholder="Disabled input"
                                             value="${getMember.email2}" required disabled>
                                       </fieldset>
                                    </div>
                                 </div>

                              </div>
                              <br>
                              <!-- 핸드폰 입력 부분을 수정한 부분을 보여드립니다. -->
                              <div class="mb-3 form-group">
                                 <label for="disabledTextInput">핸드폰</label>
                                 <div class="row g-0">
                                    <!-- 컬럼 간격을 0으로 설정 -->
                                    <div class="col-sm">
                                       <fieldset class="disabled-field">
                                          <input type="text" id="disabledTextphone1" name="tel1"
                                             class="form-control" maxlength="3"
                                             placeholder="Disabled input" required value="${getMember.tel1}" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
                                             disabled>
                                       </fieldset>
                                    </div>
                                    <p class="col-sm-auto my-auto">-&nbsp;</p>
                                    <!-- "-" 추가 -->
                                    <div class="col-sm">
                                       <fieldset class="disabled-field">
                                          <input type="text" id="disabledTextphone2" name="tel2"
                                             class="form-control" maxlength="4"
                                             placeholder="Disabled input" required value="${getMember.tel2}" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
                                             disabled>
                                       </fieldset>
                                    </div>
                                    <p class="col-sm-auto my-auto">-&nbsp;</p>
                                    <!-- "-" 추가 -->
                                    <div class="col-sm">
                                       <fieldset class="disabled-field">
                                          <input type="text" id="disabledTextphone3" name="tel3"
                                             class="form-control" maxlength="4"
                                             placeholder="Disabled input" required value="${getMember.tel3}" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"
                                             disabled>
                                       </fieldset>
                                    </div>
                                 </div>

                              </div>
                              <br>
                              <!--  수정버튼이 디세이블 활성화 시키지 않는 풩션 -->
                              <script>
                                 function enableInput() {
                                    var inputField = document
                                          .getElementById('disabledTextName');
                                    var inputField1 = document
                                          .getElementById('disabledTextemail1');
                                    var inputField2 = document
                                          .getElementById('disabledTextemail2');
                                    var inputField3 = document
                                          .getElementById('disabledTextphone1');
                                    var inputField4 = document
                                          .getElementById('disabledTextphone2');
                                    var inputField5 = document
                                          .getElementById('disabledTextphone3');

                                    inputField.disabled = false;
                                    inputField.focus();
                                    inputField1.disabled = false;
                                    inputField1.focus();
                                    inputField2.disabled = false;
                                    inputField2.focus();
                                    inputField3.disabled = false;
                                    inputField3.focus();
                                    inputField4.disabled = false;
                                    inputField4.focus();
                                    inputField5.disabled = false;
                                    inputField5.focus();
                                 }

                                 function update() {
                                    var inputField = document
                                          .getElementById('disabledTextName');

                                    if (inputField.disabled) {
                                       alert("수정 후 클릭이 가능합니다.")
                                       return false
                                    }
                                    return true

                                 }
                              </script>
                              <script type="text/javascript">
                                 function mdelete() {
                                    var isDel = window
                                          .confirm("정말로 탈퇴 하시겠습니까?")
                                    if (isDel) {
                                       location.href = "delete.do"
                                    }
                                 }
                              </script>
                              <button class="w-100 btn btn-primary btn-lg" type="submit">수정
                                 완료</button>
                              <br> <br> <br> <br> <br> <br>
                              <hr class="my-4" style="border-top: 1px solid #000 !important">
                              <ul class="list-inline" text-align="right">
                                 <hr class="my-4">
                                 <li class="list-inline-item"><a
                                    href="javascript:mdelete()">탈퇴하기</a></li>
                              </ul>
                           </div>
                        </form>
                     </div>
                     <div class="tab-pane" id="tabsNavigationSimple2" role="tabpanel">
                        <div class="text-center">
                           <br> <br> <br>
                           <div class="row g-2">


                              <div class="row">
                                 <c:forEach var="brand" items="${wishlist}">
                                    <div class="col-md-6"
                                       style="flex: 0 !important; margin-bottom: 20px;">
                                       <!-- 각 카드에 data-bnum 속성을 추가하여 게시물 번호를 저장 -->
                                       <div class="card" style="width: 18rem;"
                                          data-bnum="${brand.bnum}">
                                          <img src="resources/files/${brand.bimage}"
                                             class="bd-placeholder-img card-img-top" width="100%"
                                             height="180">

                                          <ul class="list-group list-group-flush">
                                             <li class="list-group-item">${brand.storeName}</li>
                                             <li class="list-group-item">${brand.tablename}</li>

                                          </ul>
                                          <div class="card-body">
                                             <a href="bunsukDetail.do?bnum=${brand.bnum}"
                                                class="card-link">상세 정보 보기</a>
                                          </div>
                                       </div>
                                    </div>
                                 </c:forEach>
                              </div>

                              <!-- 카드 마지막 div -->

                           </div>
                        </div>
                     </div>
                     <!-- 고객센터 라인 -->
                     <div class="tab-pane" id="tabsNavigationSimple3" role="tabpanel">
                        <div class="text-center">
                           <div id="carouselExampleSlidesOnly" class="carousel slide"
                              data-bs-ride="carousel">
                              <div class="carousel-inner">
                                 <div class="carousel-item active">
                                    <img src="https://yslib.yeosu.go.kr/locker/img/prepare.png"
                                       class="d-block mx-auto w-50">
                                 </div>
                                 <div class="carousel-item">
                                    <img
                                       src="https://file.noononda.com/article/202305/20230531202524.png"
                                       class="d-block mx-auto w-50">
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>

                     <!-- 고객센터 라인 -->
                  </div>
               </div>
            </div>
         </div>
      </div>
      <script
         src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
         integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
         crossorigin="anonymous"></script>
   </div>
   <script src="checkout.js"></script>
</body>
</html>
<%@ include file="bottom.jsp"%>