package com.sutaruhin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NowController {

	@GetMapping("/now")
	public String getNow(Model model) {

		String now = LocalDateTime.now().format( DateTimeFormatter.ofPattern("HH:mm:ss") );

		/*Modelクラスはテンプレートにデータを受け渡すために利用するクラスです。
		 * ModelクラスのaddAttributeメソッドを使ってテンプレートに渡す値を設定します。第一引数がデータの名前で、第二引数がデータの値です。*/
		model.addAttribute("msg", "現在時刻：　" + now);

		return "now";
	}

}
