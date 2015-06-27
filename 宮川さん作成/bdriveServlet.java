package com.sample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * AWSの動作確認用サンプルコード
 *
 *  @author shiho.asa
 *  @version 1.0
 *
 */

@WebServlet("/connectDB.do")
public class bdriveServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public bdriveServlet() {
        super();
    }

    /**
     * クライアントからのGETを処理するメソッド
     *
     * @param req HTTPサーブレットリクエスト
     * @param res HTTPサーブレットレスポンス
     *
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // GETメソッドが呼ばれたときの処理
        doPost(req,res);
    }

    /**
     * クライアントからのPOSTを処理するメソッド
     *
     * @param req HTTPサーブレットリクエスト
     * @param res HTTPサーブレットレスポンス
     *
     */
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    	// リクエストの文字コード設定
        req.setCharacterEncoding("UTF-8");


        //HTTPセッションを取得する
        HttpSession session = req.getSession(true);


        // ModelクラスでDB接続を行う
        MemberModel tm = new MemberModel();
        session.setAttribute("testbean",tm.connectDB());


        // 結果表示jspへ画面遷移
        RequestDispatcher  dis = req.getRequestDispatcher("result.jsp");
        dis.forward(req, res);

    }

}