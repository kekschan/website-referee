<%--
  Created by IntelliJ IDEA.
  User: dnsbo
  Date: 25.09.2022
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Московская Федерация Судей</title>
    <link href="${pageContext.request.contextPath}/css/styleHome.css" rel="stylesheet" type="text/css">
</head>
<body class="html front not-logged-in no-sidebars page-not">
      <div class="page-wrapper">
          <div class="page">
              <div class="header">
                  <div class="section clearfix">
                      <a class="logo" href="${pageContext.request.contextPath}/home">
                          <table style="width: 400px; height: 70px; margin-left: 25px;">
                              <tbody>
                              <tr>
                                  <td style="display: inline-block;padding: 5px"><img
                                          src="${pageContext.request.contextPath}/img/logo/logo.png" height="58px" width="58"></td>
                                  <td STYLE="display: inline-block; padding: 5px"><font
                                          style="font-size: 40px; font-family: Verdana; font-weight: bold; color: #f1f2e6;">МФС</font>
                                  </td>
                                  <td style="display: inline-block; padding: 5px 0;"><font
                                          style="font-size:14px; font-family: Verdana; color:#f1f2e6;">Московская Федерация
                                      <br>Судей по плаванию</font></td>
                              </tr>
                              </tbody>
                          </table>
                      </a>
                      <div class="addr">ТЕЛ: +7 (985) 788-85-36<br><a
                              href="mailto:dnsborshev@gmail.com">dnsborshev@gmail.com</a></div>
                      <div class="social">
                          <ul>
                              <li class="flickr"><a class="social-item" target="_blank" href="http://vk.com/official_vfp"><img
                                      width="47" src="${pageContext.request.contextPath}/img/social/vk.png"></a></li>
                              <li class="flickr"><a class="social-item" target="_blank" href="https://t.me/official_vfp"><img
                                      width="47" src="${pageContext.request.contextPath}/img/social/tg.png"></a></li>
                              <li class="flickr"><a class="social-item" target="_blank" href="https://ok.ru/official.vfp"><img
                                      width="47" src="${pageContext.request.contextPath}/img/social/ok.png"></a></li>
                              <li class="flickr"><a class="social-item" target="_blank"
                                                    href="https://www.youtube.com/c/official_vfp"><img width="47"
                                                                                                       src="${pageContext.request.contextPath}/img/social/yt.png"></a>
                              </li>
                              <li class="flickr"><a class="social-item" target="_blank"
                                                    href="https://rutube.ru/channel/24808063/"><img width="47"
                                                                                                    src="${pageContext.request.contextPath}/img/social/rt.png"></a>
                              </li>
                          </ul>
                      </div>
                      <ul class="nav">
                          <li>
                              <a href="/data/list/menu_federacia.html">Новости</a>
                          </li>
                          <li>
                              <a href="/data/list/menu_professionalam.html">Судьям</a>
                          </li>
                          <li>
                              <a href="/data/list/menu_vseoplavanii.html">Магазин</a>
                          </li>
                          <li>
                              <a href="/data/menu/conacts/">Контакты</a>
                          </li>
                          <li>
                              <a href="${pageContext.request.contextPath}/login">Личный кабинет</a>
                          </li>
                      </ul>
                  </div>
              </div>
          </div>
      </div>
</body>
</html>
