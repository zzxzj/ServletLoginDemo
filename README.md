# ServletLoginDemo
Servlet用户登录示例

编写servlet步骤：
1、继承HttpServlet
2、重写doGet()或者doPost()方法
3、在web.xml中注册Servlet

Servlet中如何处理中文乱码？
在doGet()/doPost()方法中添加如下代码：
request.setCharacterEncoding("utf-8");

在Servlet中获取表单提交的数据方法：
 获取文本输入框字符串时使用：request.getParameter("表单字段名");
获取复选框多字符串数组时用：request.getParameterValues("表单字段名");

通过Session传递变量的方法：
request.getSession().setAttribute("session变量名",值);

日期类型与字符串类型的转换：
 采用SimpleDateFormat类进行转换，具体方法如下。
1、定义SimpleDateFormat对象 SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
 2、字符串转换成日期数据：Date d = sdf.parse("日期字符串");
日期数据转换成日期字符串：String sd = sdf.format(日期变量);

页面跳转方法：
 站内跳转：request.getRequestDispatcher("目标相对路径").forward(request,response);

 JSP页面通过Session传递变量
