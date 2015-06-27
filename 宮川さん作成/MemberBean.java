package com.sample;

import java.util.Date;

public class MemberBean {

	// 社員ID
	private String memberid;

	// 名前
	private String membername;

	// コード
	private String authcode;

	// 電話番号
	private String telno;

	// 削除フラグ
	private String delflg;

	// 登録日時
	private Date insdate;

	// 更新日時
	private Date upddate;

	/**
	 * 社員IDの取得
	 *
	 * @return memberid
	 */
	public String getId() {
		return memberid;
	}

	/**
	 * 社員IDの設定
	 *
	 * @param memberid
	 */
	public void setId(String memberid) {
		this.memberid = memberid;
	}

	/**
	 * 名前の取得
	 *
	 * @return memberid
	 */
	public String getName() {
		return membername;
	}

	/**
	 * 名前の設定
	 *
	 * @param memberid
	 */
	public void setName(String membername) {
		this.membername = membername;
	}

	/**
	 * コードの取得
	 *
	 * @return memberid
	 */
	public String getAuthcode() {
		return authcode;
	}

	/**
	 * コードの設定
	 *
	 * @param memberid
	 */
	public void setAuthcode(String authcode) {
		this.authcode = authcode;
	}

	/**
	 * 電話番号の取得
	 *
	 * @return telno
	 */
	public String getTel() {
		return telno;
	}

	/**
	 * 電話番号の設定
	 *
	 * @param telno
	 */
	public void setTel(String telno) {
		this.telno = telno;
	}

	/**
	 * 削除フラグの取得
	 *
	 * @return delflg
	 */
	public String getDelflg() {
		return delflg;
	}

	/**
	 * 削除フラグの設定
	 *
	 * @param delflg
	 */
	public void setDelflg(String delflg) {
		this.delflg = delflg;
	}

	/**
	 * 登録日時の取得
	 *
	 * @return insdate
	 */
	public Date getInsdate() {
		return insdate;
	}

	/**
	 * 登録日時の設定
	 *
	 * @param insdate
	 */
	public void setInsdate(Date insdate) {
		this.insdate = insdate;
	}

	/**
	 * 更新日時の取得
	 *
	 * @return upddate
	 */
	public Date getUpddate() {
		return upddate;
	}

	/**
	 * 更新日時の設定
	 *
	 * @param upddate
	 */
	public void setUpddate(Date upddate) {
		this.upddate = upddate;
	}

}
