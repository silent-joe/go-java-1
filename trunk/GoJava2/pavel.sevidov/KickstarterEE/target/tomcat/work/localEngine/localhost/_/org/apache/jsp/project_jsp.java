package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<title>Kickstarter ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\t\t<meta name=\"generator\" content=\"Bootply\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t\t<link href=\"./css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t\t<script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t\t<link href=\"./css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("<header class=\"navbar navbar-bright navbar-fixed-top\" role=\"banner\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <nav class=\"collapse navbar-collapse\" role=\"navigation\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"http://localhost:8080/categories\" class=\"navbar-brand\">Home</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"#\">Category</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"#\">Category</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"#\">Category</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <a href=\"#\">About</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"nav navbar-right navbar-nav\">\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-search\"></i></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" style=\"padding:12px;\">\r\n");
      out.write("            <form class=\"form-inline\">\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default pull-right\"><i class=\"glyphicon glyphicon-search\"></i></button><input type=\"text\" class=\"form-control pull-left\" placeholder=\"Search\">\r\n");
      out.write("            </form>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<div id=\"masthead\">  \r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-7\">\r\n");
      out.write("        <h1>Kickstarter\r\n");
      out.write("          <p class=\"lead\"></p>\r\n");
      out.write("        </h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-5 sasha-logo\">\r\n");
      out.write("              </div>\r\n");
      out.write("    </div> \r\n");
      out.write("  </div><!-- /cont -->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-12\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div> \r\n");
      out.write("  </div><!-- /cont -->\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"col-md-12\"> \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"panel\">\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <!--/stories-->\r\n");
      out.write("          <div class=\"row\">    \r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"col-md-2 col-sm-3 text-center\">\r\n");
      out.write("              <img alt=\"\" src=\"http://m.eet.com/media/1176482/2203520-kickstarter_badge_funded.png\" style=\"width:150px;height:150px\" class=\"img-rounded\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-10 col-sm-9\">\r\n");
      out.write("              <h3>");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xs-9\">\r\n");
      out.write("                  <p>");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("                  <p>Collected already ");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write(" of ");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("\t\t\t\t  <p>Left days: ");
      if (_jspx_meth_c_005fout_005f5(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("\t\t\t\t  <p>History: ");
      if (_jspx_meth_c_005fout_005f6(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("<iframe width=\"560\" height=\"315\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.details.video}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" frameborder=\"0\" allowfullscreen></iframe>\r\n");
      out.write("                <div class=\"col-xs-3\"></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <br><br>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <!--/stories-->\r\n");
      out.write("          \r\n");
      out.write("        <br>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("          <hr>\r\n");
      out.write("          <a href=\"/payment?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-success pull-right btnNext\">Dotane <i class=\"glyphicon glyphicon-plus\"></i></a>\r\n");
      out.write("      </div>\r\n");
      out.write("                                                                                       \r\n");
      out.write("\t                                                \r\n");
      out.write("                                                      \r\n");
      out.write("   \t</div><!--/col-12-->\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("                                                \r\n");
      out.write("                                                                                \r\n");
      out.write("<!-- <hr> -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" id=\"footer\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col col-sm-12\">\r\n");
      out.write("      \r\n");
      out.write("      <h1>Follow Us</h1>\r\n");
      out.write("      <div class=\"btn-group\">\r\n");
      out.write("       <a class=\"btn btn-twitter btn-lg\" href=\"#\"><i class=\"icon-twitter icon-large\"></i> Twitter</a>\r\n");
      out.write("\t   <a class=\"btn btn-facebook btn-lg\" href=\"#\"><i class=\"icon-facebook icon-large\"></i> Facebook</a>\r\n");
      out.write("\t   <a class=\"btn btn-google-plus btn-lg\" href=\"#\"><i class=\"icon-google-plus icon-large\"></i> Google+</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!-- <hr> -->\r\n");
      out.write("\r\n");
      out.write("<!-- <hr> -->\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-sm-6\">\r\n");
      out.write("          <h3 class=\"pull-center foot\">&copy; Deuces Inc. 2014. All Rights Reserved.</a></p>      \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\t<!-- script references -->\r\n");
      out.write("\t\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /project.jsp(7,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent(null);
    // /project.jsp(100,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent(null);
    // /project.jsp(103,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.description}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent(null);
    // /project.jsp(104,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.collected}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent(null);
    // /project.jsp(104,80) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.amount}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent(null);
    // /project.jsp(105,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.days}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f6.setParent(null);
    // /project.jsp(106,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${project.details.history}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
    if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
    return false;
  }
}
