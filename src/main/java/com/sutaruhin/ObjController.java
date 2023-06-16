package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObjController {

	@GetMapping("/obj")
	public String getObj(Model model) {

		Member member = new Member(1, "taro", "男性", 27);

		model.addAttribute("member", member);

		return "obj";
	}

}

/*getObj メソッドでは、Memberクラスのオブジェクトを作成してModelに登録しています。
 * Spring Bootではコントローラーからビューへ値を渡す場合、Spring Frameworkの_Model_クラス以外に_ModelAndView_クラスを利用する方法もあります。
 * _Model_クラスの場合、オブジェクトにデータの値のみ格納してViewの情報はメソッドの戻り値として指定します。
 * それに対して_ModelAndView_クラスの場合、オブジェクトにデータの値とビューの情報をまとめて格納してオブジェクト自身をメソッドの戻り値として指定します。
 * 両方ともできることは同じですが、実装方法が違います。本コースでは_Model_クラスを使用します。実際のプロジェクトでも、どちらの書き方にするかルールを決めて統一した方が良いでしょう。
 */


