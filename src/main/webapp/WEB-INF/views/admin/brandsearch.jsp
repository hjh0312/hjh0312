<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        width: 60%;
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

    input[type="text"],
    input[type="file"],
    textarea {
        width: calc(100% - 20px);
        padding: 10px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    input[type="submit"],
    input[type="reset"] {
        background-color: #4CAF50;
        color: #fff;
        padding: 10px 15px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        border-radius: 3px;
    }

    input[type="submit"]:hover,
    input[type="reset"]:hover {
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
    
</style>
<body>
   <div align="center">
   <form name="f" action="" 
                     method="post" enctype="multipart/form-data">
      <table border="0" class="outline" width="60%">
          <tr>
                <th style="font-size:20px;" colspan="2">브랜드 찾기</th>
            </tr>
         <tr>
            <th>브랜드 제목</th>
            <td><input type="text" name="pname" class="box"></td>
         </tr>
         <tr>
      
         <tr>
            <th>브랜드 이미지</th>
            <td><input type="file" name="pimage" class="box"></td>
         </tr>
         <!--   -->
                <tr>
            <th> ??? ??? ???</th>
            <td><input type="text" name="pname" class="box"></td>
         </tr>
         
         <tr>
            <th>브랜드 내용</th>
            <td>
               <textarea name="pcontents" maxlength="1000" rows="5" cols="30"></textarea>
            </td>
         </tr>

         <tr>
            <td align="center" colspan="2">
               <input type="submit" value="등록">
               <input type="reset" value="취소">
            </td>
         </tr>
      </table>   
   </form>
</div>
</body>