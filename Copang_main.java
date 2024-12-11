import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Copang_main {
    // 데이터베이스에서 데이터를 가져와 DefaultTableModel로 반환
    private static DefaultTableModel getDataFromDatabase(Connection conn, String query) {
        DefaultTableModel model = new DefaultTableModel();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // 메타데이터를 사용해 열 이름 추가
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            // 데이터 추가
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }

    public static void main(String[] args) {
        Connection conn = null;
        String USERNAME = "root"; // DBMS 접속 시 아이디
        String PASSWORD = "dign4298Z@"; // DBMS 접속 시 비밀번호
        String URL = "jdbc:mysql://localhost:3306/copang_main"; // DBMS 접속할 DB명

        try {
            // 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("연결 완료");

            // 데이터베이스에서 데이터 가져오기
            String query = "SELECT * FROM member";
            DefaultTableModel model = getDataFromDatabase(conn, query);

            // GUI 생성
            JFrame frame = new JFrame("회원 정보");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.setVisible(true);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("연결 해제");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
