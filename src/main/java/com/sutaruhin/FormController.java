package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	/*@GetMapping("/") アノテーションは、「/form」のアドレスに対する「GETメソッド」を受け取る関数であることを示します。
	 * よってブラウザでURL http://localhost:8080/formを表示するとgetFormメソッドが実行されます。*/
	@GetMapping("/form")
	public String getForm(Model model) {

		model.addAttribute("msg", "値を入力してください。");

		return "form";
	}

	/*@PostMapping("/form") アノテーションは、「/form」のアドレスに対する「POST メソッド」を受け取る関数であることを示します。
	 * _form.html_の「送信」ボタンをクリックすると、フォームの内容がPOSTメソッドとしてサーバーに送信され、postFormメソッドが実行されます。
	 * @RequestParamアノテーションでは、フォームで送信された値を取得します。取得した値はString型の変数valに渡されます。*/
	@PostMapping("/form")
	public String postForm(@RequestParam("val") String val, Model model) {
		model.addAttribute("msg", "入力された値は「" + val + "「です。");
		return "form";
	}

}
