package com.biz.progamer.mapper;

import org.apache.ibatis.jdbc.SQL;

public class BoardSQL {
	
	public String board_insert_sql() {
		SQL sql = new SQL() {{
			INSERT_INTO("tbl_board");
			INTO_COLUMNS("b_seq").INTO_VALUES("#{b_seq}");
			INTO_COLUMNS("b_main_seq").INTO_VALUES("#{b_main_seq,jdbcType=INTEGER}");
			INTO_COLUMNS("b_layer").INTO_VALUES("#{b_layer,jdbcType=INTEGER}");
			INTO_COLUMNS("b_date").INTO_VALUES("#{b_date,jdbcType=VARCHAR}");
			INTO_COLUMNS("b_time").INTO_VALUES("#{b_time,jdbcType=VARCHAR}");
			INTO_COLUMNS("b_auth").INTO_VALUES("#{b_auth,jdbcType=VARCHAR}");
			INTO_COLUMNS("b_title").INTO_VALUES("#{b_title,jdbcType=VARCHAR}");
			INTO_COLUMNS("b_content").INTO_VALUES("#{b_content,jdbcType=VARCHAR}");
			
		}};
		
		return sql.toString();
	}
	
	public String board_update_sql(){
		SQL sql = new SQL() {{
			UPDATE("tbl_board");
			SET("bbs_date = #{bbs_date}");
			SET("bbs_time = #{bbs_time}");
			SET("bbs_title = #{bbs_title}");
			SET("bbs_content = #{bbs_content}");
			SET("bbs_auth = #{bbs_auth}");
			WHERE("bbs_seq = #{bbs_seq}");
		}};
		return sql.toString();
	}
}
