package com.sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import WEB-INF.classes.com.sample.MemberBean;


public class MemberModel {

	private final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	private final static String URI = "jdbc:sqlserver://bdrivetest.ckkvxm1mmuxy.ap-northeast-1.rds.amazonaws.com:1433;database=b-drive;"
										+ "integratedSecurity=false;user=buser;password=busertest";

	// コンストラクタ
    public MemberModel(){

    }

	public List<MemberBean> connectDB() {

        // DB接続オブジェクト
        Connection con = null;
        // 戻り値
        List<MemberBean> result = new ArrayList<MemberBean>();

		try {
			Driver d = (Driver) Class.forName(DRIVER).newInstance();
			String connUrl = URI;
			con = d.connect(connUrl, new Properties());

			String SQL = "SELECT * FROM T_MEMBER ORDER BY MEMBER_ID";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);

			if (rs != null) {
				while (rs.next()) {
					MemberBean mb = new MemberBean();
					mb.setId(rs.getString("memberid"));
					mb.setName(rs.getString("membername"));
					mb.setAuthcode(rs.getString("authcode"));
					mb.setTel(rs.getString("telno"));
					mb.setDelflg(rs.getString("delflg"));
					mb.setInsdate(rs.getDate("insdate"));
					mb.setUpddate(rs.getDate("upddate"));
					//System.out.println( rs.getString("MEMBER_ID")
					//	+ ", " + rs.getString("MEMBER_NAME"));

					result.add(mb);
				}
			}

			rs.close();
			stmt.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally{

	        // データベース切断処理
	        try {
	            // データベース切断処理
	            con.close();

	        }catch(Exception e){
	            // エラー処理
	        }
	    }

	return result;

	}

}
