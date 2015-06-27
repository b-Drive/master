package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
*
* DB接続を行うModelです。
*
*  @author shiho.asa
*  @version 1.0
*
*/
public class TestModel {

	private final static String DRIVER = "com.mysql.jdbc.Driver";

	// 1.データベースの接続先情報を指定
    private final static String URI = "jdbc:mysql://testdb.xxx.rds.amazonaws.com:3306/testdb";

    // 2.データベースに接続するときのユーザ名とパスワードを指定
    private final static String DBUSER = "dbuser";
    private final static String PASSWORD = "password";


    // コンストラクタ
    public TestModel(){

    }

    /**
     * DBから値を取得するメソッド（JDBC）
     *     *
     * @return SQL実行結果
     *
     */
    public List<BookBean> connectDB(){

        // 戻り値
        List<BookBean> result = new ArrayList<BookBean>();

        // DB接続オブジェクト
        Connection con = null;

        try {

            // JDBCドライバのロード
            Class.forName(DRIVER);

            // データベースへの接続
            con = DriverManager.getConnection(URI, DBUSER, PASSWORD);
            Statement st = con.createStatement();

            // SQLの実行
            ResultSet rs = st.executeQuery("select id, name, price, authorname from bookview");

            // データベースの検索結果をBookBeanに格納する
            if (rs != null) {
                while (rs.next()) {

                    BookBean bb = new BookBean();
                        bb.setId(rs.getString("id"));
                        bb.setName(rs.getString("name"));
                        bb.setPrice(rs.getInt("price"));
                        bb.setAuthorname(rs.getString("authorname"));

                        result.add(bb);
                }
            }

            // データベース切断処理
            rs.close();
            st.close();
            con.close();

    } catch (Exception e) {
        // エラー処理

    }finally{

        // データベース切断処理
        try {
            // データベース切断処理
            con.close();

        }catch(Exception e){
            // エラー処理
        }
    }

        // データベースの検索結果が格納されたList<BookBean>を返す
        return result;

    }


}
