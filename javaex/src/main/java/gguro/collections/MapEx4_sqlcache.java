package gguro.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gguro.common.Testable;

public class MapEx4_sqlcache implements Testable {

	@Override
	public void test() {
		
		// "select * from emp where deptno in(10,20)";
		
		List<String> sqlparam = new ArrayList<String> ();
		sqlparam.add("10");
		sqlparam.add("20");
		
		
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		sb.append("select * from emp ");
		sb.append("where deptno in(");
		sb.append(sqlparam.get(0));
		sb.append(",");
		sb.append(sqlparam.get(1));
		sb.append(")");
		
		String sql1 = sb.toString();
		
		String resultSet1[] = {"A10", "B20", "C30" };
		
		Map<String, String[]> sqlCache = new HashMap<String, String[]>();
		sqlCache.put(sql1, resultSet1);
		
		String sql2 = "select * from emp where deptno in(10,20)";
		if(sqlCache.containsKey(sql2)) {
			//System.out.println(sqlCache.get(sql2).toString());
			System.out.println(Arrays.toString(sqlCache.get(sql2)));
		};
		
	}

}
