package ch13.domain.userinfo.userinfodao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.userinfodao.UserInfoDao;

public class UserInfoDaoOracle implements UserInfoDao{
	@Override
	public void create(UserInfo userInfo) {
		System.out.println("Oracle create");
	}

	@Override
	public void read(UserInfo userInfo) {
		System.out.println("Oracle read");
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("Oracle delete");		
	}


}
