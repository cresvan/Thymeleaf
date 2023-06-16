package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

	@GetMapping("/msg")
	public String getMsg() {

		return "msg";
	}

}


/*Spring Bootは多言語化（i18n）に対応しており、ブラウザの言語設定に合わせてmessagesファイルを自動的に切り替えることが可能です。
 * 多言語化に対応するにはapplication.propertiesファイルに spring.messages.basename=messages を追記
 * 次に言語ごとのmessagesファイルを用意します。たとえば英語にも対応するには、messages_en.properties に以下を追記。
 * content.title=Thymeleaf Page!
 * content.message=message for sample page.
 * ブラウザがChromeであれば「設定 > 言語」で英語を選択することで表示内容が変わります。*/

