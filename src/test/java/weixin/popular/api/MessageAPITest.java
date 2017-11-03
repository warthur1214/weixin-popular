package weixin.popular.api;

import org.junit.Test;
import weixin.popular.bean.message.templatemessage.TemplateMessage;
import weixin.popular.bean.message.templatemessage.TemplateMessageItem;
import weixin.popular.bean.message.templatemessage.TemplateMessageResult;

import java.util.LinkedHashMap;

public class MessageAPITest {

	@Test
	public void TestMessageTemplateSend() {

		String accessToken = "uOxgGuGzQm0Upvw-lRAsvj4H51CbkCPC-8i-2MJgMo5mq5m78eyZeEsbPQz13D0x42xwsGvSTra-pHrMr0Y36pqsPKs7fPgpdJABWYKYslBKSyia0HYu7lTJpsvaXAq5ZDMhAHDUYH";

		// 使用模版消息 无限制
		TemplateMessage templateMessage = new TemplateMessage();
		templateMessage.setTouser("ovb5KwvJfK_gQEFDYZMdaPthbo3s");
		templateMessage.setTemplate_id("QSqlRuZgXTerFCe-C6OyBfdfeEKd4CvwR0K4Nk0yRRQ");
		templateMessage.setUrl(null);

		templateMessage.setData(new LinkedHashMap<String, TemplateMessageItem>() {
			private static final long serialVersionUID = -7344914538752437800L;

			{
				put("first", new TemplateMessageItem("预约单提醒", "#173177"));
				put("keyword1", new TemplateMessageItem("沪A12345", "#173177"));
				put("keyword2", new TemplateMessageItem("18516599223", "#173177"));
				put("keyword3", new TemplateMessageItem("2017-11-01 17:01:00", "#173177"));
				put("keyword4", new TemplateMessageItem("2017-11-01 17:01:00", "#173177"));
				put("keyword5", new TemplateMessageItem("维保预约单", "#173177"));
				put("remark", new TemplateMessageItem("你好，111111111", "#173177"));
			}
		});
		TemplateMessageResult result = MessageAPI.messageTemplateSend(accessToken, templateMessage);

	}
}
