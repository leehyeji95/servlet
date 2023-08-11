<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="java.util.List" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%
  MemberRepository memberRepository = MemberRepository.getInstance();
  List<Member> members = memberRepository.findAll();
%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
  <thead>
  <th>id</th>
  <th>username</th>
  <th>age</th>
  </thead>
  <tbody>
  <%
    for (Member member : members) {
      out.write("    <tr>\n");
      out.write("        <td>" + member.getId() + "</td>\n");
      out.write("        <td>" + member.getUsername() + "</td>\n");
      out.write("        <td>" + member.getAge() + "</td>\n");
      out.write("    </tr>\n");
    }
  %>
  </tbody>
</table>

</body>
</html>
<%--
1. <% ~ %> : 자바코드 입력
2. <%= ~ %> : 자바코드 출력

서블릿과 JSP의 한계
서블릿으로 개발할 때는 뷰(View) 화면을 위한 HTML 만드는 작업이 자바코드에 섞여있어서 지저분하고 복잡했다.
JSP를 사용해서 뷰를 생성하는 HTML 작업을 깔끔하게 할 수 있지만 JSP 가 너무 많은 역할을 하기 때문에 유지보수가 어렵다.
=> MVC 패턴이 등장
비즈니스 로직은 서블릿 처럼 다른 곳에서 처리하고 JSP는 화면 View 그리는 일에 집중하도록 하자.
MVC 패턴 : 하나의 서블릿이나 JSP로 처리하던 것을 컨틀롤러, view 라는 영역으로 서로 역할을 나눈 것.
Controller: HTTP 요청을 받아서 파라미터를 검증하고, 비즈니스 로직을 실행한다. View에 전달할 결과 데이터를 조회해서 모델에 담는다
Model: View에 출력할 데이터를 담아둔다.
View: 모델에 담겨있는 데이터를 사용해서 화면을 그리는 일에 집중. HTML 생성. 비즈니스 로직이나 데이터 접근을 몰라도 된다.

--%>