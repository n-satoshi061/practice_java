import java.sql.*;

public class InsertStudent2 {
    public static void main(String[] args) {
	    final String URL = "jdbc:mysql://localhost:3306/sampledb?useSSL=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASS = "199561SAto#";
        String sql = "INSERT INTO student VALUES(?, ?, ?)";
        String[] names = {"藤原", "草野", "常田", "小橋"};
        int[] scores = {90, 85, 80, 75};

        Connection con = null;
        PreparedStatement ps = null;

        try {
            // ドライバーのロード（最新のMySQLドライバーでは不要）
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ①DBに接続
            con = DriverManager.getConnection(URL, USER, PASS);

            // ②ステートメントを生成
            ps = con.prepareStatement(sql);

            // ③SQLを実行
            for(int i = 0; i < names.length; i++) {
                ps.setInt(1, i + 7);
                ps.setString(2, names[i]);
                ps.setInt(3, scores[i]);
                ps.executeUpdate();
            }
            System.out.println(names.length + "件更新しました。");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // ④リソースを解放
            	if(ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

	}
}
