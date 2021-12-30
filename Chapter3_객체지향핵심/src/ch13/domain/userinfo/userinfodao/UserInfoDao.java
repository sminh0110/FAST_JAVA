package ch13.domain.userinfo.userinfodao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	void create(UserInfo userInfo);
	void read(UserInfo userInfo);
	void delete(UserInfo userInfo);
}
