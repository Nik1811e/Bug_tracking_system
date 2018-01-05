package userpage;

import static org.junit.Assert.assertNotEquals;

public class SelectUserInfoTest {

    @org.junit.Test
    public void selectUserIdFromLogin() {
        SelectUserInfo info = new SelectUserInfo();
        assertNotEquals(info.selectUserIdFromLogin("qqq"),null);
    }
}