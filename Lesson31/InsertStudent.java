import java.sql.*;

public class InsertStudent {

    public static void main(String[] args) {
        final String URL = "jdbc:mysql://localhost:3306/sampledb?useSSL=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASS = "xxx";
        String sql = "INSERT INTO student VALUES(6, '西川', 95)";

        Connection con = null;
        Statement stmt = null;

        try {
            // ドライバーのロード（最新のMySQLドライバーでは不要）
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ①DBに接続
            con = DriverManager.getConnection(URL, USER, PASS);

            // ②ステートメントを生成
            stmt = con.createStatement();

            // ③SQLを実行
            int count = stmt.executeUpdate(sql);
            System.out.println(count + "件更新しました");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // ④リソースを解放
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
