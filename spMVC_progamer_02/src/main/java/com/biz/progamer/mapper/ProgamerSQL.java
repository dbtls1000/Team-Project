package com.biz.progamer.mapper;

import org.apache.ibatis.jdbc.SQL;

public class ProgamerSQL {
	public String pg_select_sql() {
		SQL sql = new SQL() {{
			SET("@rownum:=0");
			SELECT("@rownum:=@rownum+1 as num,gamer.*");
			FROM("tbl_progamer gamer");
			LIMIT("10,10");
		}};
		
		return sql.toString();
				
	}
}
