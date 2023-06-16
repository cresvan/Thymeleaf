package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller アノテーションは、このクラスがHTTPリクエストを受けつけるクラスであることを示します。
@Controller
public class IndexController {

	//@GetMapping("/") アノテーションは、URL http://localhost:8080/（「/」のアドレス）に対する「GETメソッド」を受け取る関数であることを示します。
	@GetMapping("/")
	public String getIndex() {

		/*indexメソッドの戻り値が「index」という文字列になっています。
		 * これはThymeleafを利用する場合、戻り値に合致するテンプレートファイルを検索して読み込み、レンダリングしてクライアントへ送信する仕組みとなっています。*/
		return "index";

	}

}
