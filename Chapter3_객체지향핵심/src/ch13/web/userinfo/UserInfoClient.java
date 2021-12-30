package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.userinfodao.UserInfoDao;
import ch13.domain.userinfo.userinfodao.mysql.UserInfoDaoMysql;
import ch13.domain.userinfo.userinfodao.oracle.UserInfoDaoOracle;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfoDao dao = null;
		if(dbType.equals("ORACLE")) {
			dao = new UserInfoDaoOracle();
		}
		else if(dbType.equals("MYSQL")) {
			dao = new UserInfoDaoMysql();
		}
		
		UserInfo userInfo = new UserInfo();
		dao.create(userInfo);
		dao.read(userInfo);
		dao.delete(userInfo);
	}
}
