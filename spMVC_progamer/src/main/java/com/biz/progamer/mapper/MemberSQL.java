package com.biz.progamer.mapper;

import org.apache.ibatis.jdbc.SQL;

public class MemberSQL {
	public String member_insert_sql() {
		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_member");
		sql.INTO_COLUMNS("m_userid").INTO_VALUES("#{m_userid,jdbcType=VARCHAR}");
		sql.INTO_COLUMNS("m_password").INTO_VALUES("#{m_password,jdbcType=VARCHAR}");
		sql.INTO_COLUMNS("m_name").INTO_VALUES("#{m_name,jdbcType=VARCHAR}");
		sql.INTO_COLUMNS("m_nick").INTO_VALUES("#{m_nick,jdbcType=VARCHAR}");
		sql.INTO_COLUMNS("m_email").INTO_VALUES("#{m_email,jdbcType=VARCHAR}");
		sql.INTO_COLUMNS("m_tel").INTO_VALUES("#{m_tel,jdbcType=VARCHAR}");
		sql.INTO_COLUMNS("m_role").INTO_VALUES("#{m_role,jdbcType=VARCHAR}");
		
		return sql.toString();
				
	}
	public String member_update_sql() {
		SQL sql = new SQL()
		.UPDATE("tbl_member")
		.SET("m_userid = #{m_userid,jdbcType=VARCHAR}")
		.SET("m_password = #{m_password,jdbcType=VARCHAR}")
		.SET("m_name = #{m_name,jdbcType=VARCHAR}")
		.SET("m_nick = #{m_nick,jdbcType=VARCHAR}")
		.SET("m_email = #{m_email,jdbcType=VARCHAR}")
		.SET("m_tel = #{m_tel,jdbcType=VARCHAR}")
		.SET("m_role = #{m_role,jdbcType=VARCHAR}");
		return sql.toString();
	}
}
