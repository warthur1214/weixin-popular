package weixin.popular.api;

import org.junit.Assert;
import org.junit.Test;
import weixin.popular.bean.customservice.KFAccount;

public class CustomserviceAPITest {

	@Test
	public void testGetKfList() {
		String accessToken = "z-cIJr4MANCq64cxF9Fpjq9zZCfORYdbMHcPkC-XqnorkLkDFRm52O8Ci9kQh7nknAe8TOduxOPxkSgvmSfNc1fwRZz2yyfa5XNC7NWDHNj1veYpnhb5toIfh60S9NTsLHNfALDQMS";
		KFAccount account = CustomserviceAPI.getkflist(accessToken);

		Assert.assertNotEquals(account, null);
	}
}
