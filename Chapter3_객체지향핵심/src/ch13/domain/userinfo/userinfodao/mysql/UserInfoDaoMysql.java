package ch13.domain.userinfo.userinfodao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.userinfodao.UserInfoDao;

public class UserInfoDaoMysql implements UserInfoDao{

	@Override
	public void create(UserInfo userInfo) {
		System.out.println("MYSQL create id: "+userInfo.getId());
	}

	@Override
	public void read(UserInfo userInfo) {
		System.out.println("MYSQL read id: "+userInfo.getId());
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("MYSQL delete id: "+userInfo.getId());		
	}

}
