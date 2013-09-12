package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employeeInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-1.7.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-ui-1.8.16.custom.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery.tablesorter.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/style.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/blue/style.css\" />\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/jquery-ui-1.8.16.custom.css\" />\n");
      out.write("\t\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar contextPath=\"");
      out.print(request.getContextPath());
      out.write("\";\n");
      out.write("\t\n");
      out.write("\tfunction validateEmail(email){\n");
      out.write("\t\tvar filter =/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;\n");
      out.write("\t\tif(filter.test(email)){\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction validatePhone(phone) {\n");
      out.write("\t\t    var filter = /^[0-9-+]+$/;\n");
      out.write("\t\t    if (filter.test(phone)) {\n");
      out.write("\t\t        return true;\n");
      out.write("\t\t    } else {\n");
      out.write("\t\t        return false;\n");
      out.write("\t\t    }\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t$(\"#myDummyTable\").tablesorter();\n");
      out.write("\t\tvar rowsize_str ='<div id=\"tableRowSize\" style=\"float: right;\"><input type=\"text\" class=\"row_size\" class=\"small-txt-footer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"><input class=\"tableFooter row_size_submit\" type=\"button\" value=\"Go\" style=\"cursor:pointer;font-size:12px;padding: 3px; margin: 5px;\"></div>';\n");
      out.write("\t\t$(rowsize_str).insertBefore($('.pagebanner'));\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#newEmployee\").live('click', function(){\n");
      out.write("\t\t\t$(\".mc-title\").html(\"New Employee\");\n");
      out.write("\t\t\t$(\"#new-employee\").show();\n");
      out.write("\t\t\t$(\"#employees\").hide();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t url = contextPath+'/emp/create.htm';\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\".employee-edit\").live('click', function(){\n");
      out.write("\t\t\t$(\".mc-title\").html(\"Edit Employee\");\n");
      out.write("\t\t\tvar id = $(this).attr(\"pkey\");\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#firstName\").val($(this).attr(\"firstName\"));\n");
      out.write("\t\t\t$(\"#lastName\").val($(this).attr(\"lastName\"));\n");
      out.write("\t\t\t$(\"#phone\").val($(this).attr(\"phone\"));\n");
      out.write("\t\t\t$(\"#email\").val($(this).attr(\"email\"));\n");
      out.write("\t\t\t$(\"#new-employee\").show();\n");
      out.write("\t\t\t$(\"#employees\").hide();\n");
      out.write("\t\t\t url = contextPath+'/emp/update.htm?employeeId='+id;\n");
      out.write("\t\t\t \n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\".employee-del\").live('click', function(){\n");
      out.write("\t       if(confirm('Do you want to delete Employee??')) {\n");
      out.write("\t\t\tvar id = $(this).attr(\"pkey\");\n");
      out.write("\t\t\t url = contextPath+'/emp/delete.htm?employeeId='+id;\n");
      out.write("\t\t\t $.ajax({\n");
      out.write("\t\t\t\t\turl: url,\n");
      out.write("\t\t\t\t\ttype: 'GET',\n");
      out.write("\t\t\t\t\tasync:false,\n");
      out.write("\t\t\t\t\tsuccess: function( result ) {\n");
      out.write("\t\t\t\t\t\tif(result == 'success'){\n");
      out.write("\t\t\t\t\t\t\t$(\"#saving-img\").hide();\n");
      out.write("\t\t\t\t\t\t\talert('Employee Record marked as deleted');\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\twindow.location.reload(true);\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tfailure: function(data){\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t});\n");
      out.write("\t       }\n");
      out.write("\t\t\t \n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#emp-save\").live('click', function(){\n");
      out.write("\t\t\tvar firstName = $(\"#firstName\").val();\n");
      out.write("\t\t\tvar lastName = $(\"#lastName\").val();\n");
      out.write("\t\t\tvar phone = $(\"#phone\").val();\n");
      out.write("\t\t\tvar email = $(\"#email\").val();\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\tif(firstName!=null && firstName.length==0)\n");
      out.write("\t\t\t{\t\n");
      out.write("\t\t\t\talert(\"First Name is required field\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(lastName!=null && lastName.length==0)\n");
      out.write("\t\t\t{\t\n");
      out.write("\t\t\t\talert(\"lastName is required field\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(phone!=null && phone.length==0)\n");
      out.write("\t\t\t{\t\n");
      out.write("\t\t\t\talert(\"Contact Key is required field\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(!validatePhone(phone) || phone.length!=10)\n");
      out.write("\t\t\t{\t\n");
      out.write("\t\t\t\talert(\"Contact is in valid\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(email!=null && email.length==0)\n");
      out.write("\t\t\t{\t\n");
      out.write("\t\t\t\talert(\"Email Key is required field\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(!validateEmail(email)){\n");
      out.write("\t\t\t\talert('Email is not valid');\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#saving-img\").show();\n");
      out.write("\t\t\tvar post_data=\"firstName=\"+firstName+'&lastName='+lastName+'&phone='+phone+'&email='+email;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl: url,\n");
      out.write("\t\t\t\ttype: 'POST',\n");
      out.write("\t\t\t\tdata:post_data,\n");
      out.write("\t\t\t\tasync:false,\n");
      out.write("\t\t\t\tsuccess: function( result ) {\n");
      out.write("\t\t\t\t\tif(result=='success'){\n");
      out.write("\t\t\t\t\t\t$(\"#saving-img\").hide();\n");
      out.write("\t\t\t\t\t\talert(\"Employee record Created/Updated Successfully\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\twindow.location.reload(true);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tfailure: function(result){\n");
      out.write("\t\t\t\t\t$(\"#saving-img\").hide();\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t}); \n");
      out.write("\t\t\t$(\"#saving-img\").hide();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t$(\"#mp-cancel\").live('click', function(){\n");
      out.write("\t\t\t$(\"#saving-img\").hide();\n");
      out.write("\t\t\t$(\"#new-employee\").hide();\n");
      out.write("\t\t\t$(\"#employees\").show();\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body class=\"wm-page\">\n");
      out.write("\t<div class=\"main-cont\">\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<div class=\"mc-rounded \">\n");
      out.write("\t\t\t\t<div id=\"employees\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"mc-header hidden\">\n");
      out.write("\t\t\t\t\t\t\t<form id=\"searchSeller\" action=\"");
      out.print( request.getContextPath() );
      out.write("/emp/fetchEmpAll.htm?t=con\" method=\"GET\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"tab\" value=\"con\">\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"search\" name=\"words\" class=\"tgf-textbox tgf-group-title flt-left\" type=\"text\" placeholder=\"Search Keywords\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"go-btn custom-btn-1\" type=\"submit\" value=\"Go\">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"padding:8px;right:5px;top:5px;float:right;position:relative;border:1px solid #ddd;\">\n");
      out.write("\t\t\t\t\t\t\t\t<img id=\"newEmployee\" style=\"margin-right:5px;\" title=\"Add Employee\"  src=\"");
      out.print(request.getContextPath());
      out.write("/images/plus-green.png\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div style=\"width:100%;\" id=\"table-results\">\n");
      out.write("\t\t\t\t\t");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          // /jsp/employeeInfo.jsp(177,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datasize!=0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
          if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t<table id=\"myDummyTable\" class=\"tablesorter\">\n");
              out.write("\t\t\t\t\t\t\t\t<thead>\t\n");
              out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>Employee Id</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>First Name</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>Last Name</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>Contact</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>Email</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>Is Active</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\"> Actions</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\t\t\t</thead>\n");
              out.write("\t\t\t\t\t\t\t\t<tbody>\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
              // /jsp/employeeInfo.jsp(191,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
              _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/employeeInfo.jsp(191,8) '${data}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${data}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
              // /jsp/employeeInfo.jsp(191,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fforEach_005f0.setVar("emp");
              int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
              try {
                int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\n");
                    out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t<td>");
                    if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("</td>\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t<td>");
                    if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("</td>\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t<td>");
                    if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("</td>\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t<td>");
                    if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("</td>\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t<td>");
                    if (_jspx_meth_c_005fout_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("</td>\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t<td>");
                    if (_jspx_meth_c_005fout_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("</td>\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"alloc actions\">\n");
                    out.write("\t\t\t\t\t               \t\t \t\t<img title=\"Edit\" pkey=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\" firstName=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\" lastName=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\" phone=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\" email=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\" class=\"employee-edit\" src=\"");
                    out.print(request.getContextPath());
                    out.write("/images/pencil.png\"/>\n");
                    out.write("\t\t\t\t\t               \t\t \t\t<img  title=\"Delete\" pkey=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\" class=\"employee-del\" src=\"");
                    out.print(request.getContextPath());
                    out.write("/images/bin-img.png\"/>\n");
                    out.write("\t\t\t\t                \t\t\t</div>\t\t\t\t\t\t\t\t\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t</td>\t\n");
                    out.write("\t\t\t\t\t\t\t\t\t</tr>\t\t\t       \t\t\t\n");
                    out.write("\t\t\t\t\t\t         ");
                    int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_005fforEach_005f0.doFinally();
                _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
              }
              out.write("\n");
              out.write("\t\t\t\t\t            </tbody>    \n");
              out.write("\t\t\t\t\t\t\t</table>\t\n");
              out.write("\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"new-employee\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t<div class=\"mc-header\">\n");
      out.write("\t\t\t\t\t\t<h1 class=\"mc-title\">Configure New Employee</h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"general-form\">\n");
      out.write("\t\t\t\t\t\t<div class=\"mc-header\">\n");
      out.write("\t\t\t\t\t\t\t<input id=\"key\" value=\"\" type=\"hidden\"/>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"gf-div\" style=\"display: inline-block;width:45%;padding-top:0px!important;\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"label-2\">First Name</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"firstName\" class=\"tgf-textbox\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"First Name\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"gf-div\" style=\"display: inline-block;width:45%;;padding-top:0px!important;\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"label-2\">Last Name</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"lastName\" class=\"tgf-textbox\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Last Name\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"gf-div\" style=\"display: inline-block;width:45%;;padding-top:0px!important;\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"label-2\">Contact</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"phone\" class=\"tgf-textbox\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Contact\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"gf-div\" style=\"display: inline-block;width:45%;;padding-top:0px!important;\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"label-2\">email</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"email\" class=\"tgf-textbox\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Email\" required=\"required\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div style=\"margin:10px -5px;padding-top:0px!important;float:left;\" class=\"gf-div\">\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" id=\"emp-save\" class=\"custom-btn-2\" value=\"Save\"> \n");
      out.write("\t\t\t\t\t\t<input type=\"button\" id=\"mp-cancel\"\tclass=\"custom-btn-1\" value=\"Cancel\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"saving-img\" style=\"display: none;float:left;\" class=\"message-label\">\n");
      out.write("\t\t\t\t\t\t<span class=\"loading\"></span><label>Saving the data...</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"access-img\" style=\"display: none;float:left;\" class=\"message-label\">\n");
      out.write("\t\t\t\t\t\t<span class=\"loading\"></span><label>Requesting Access..</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/employeeInfo.jsp(194,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/employeeInfo.jsp(195,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.firstName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/employeeInfo.jsp(196,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.lastName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/employeeInfo.jsp(197,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.phone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/employeeInfo.jsp(198,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /jsp/employeeInfo.jsp(199,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.isDeleted}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<h3 class=\"label-4\">Please click on plus symbol to add new employee</h3>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /jsp/employeeInfo.jsp(215,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(false);
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
