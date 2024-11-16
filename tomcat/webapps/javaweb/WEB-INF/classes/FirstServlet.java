// ４つのパッケージをインポート
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/first")     // マッピング名を指定
public class FirstServlet extends HttpServlet {   // HttpServletクラスを継承
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {      // doGet()をオーバーライド
    res.setContentType("text/html;charset=utf-8");  // コンテンツタイプを指定
    PrintWriter out = res.getWriter();              // PrintWriterを取得
    out.println("<html>");                          // PrintWriterで出力
    out.println("<head>");
    out.println("<title>はじめてのサーブレット</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>サーブレットを始めよう！</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}