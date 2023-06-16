package com.sutaruhin;

import lombok.AllArgsConstructor;
import lombok.Data;

/*@Data や @AllArgsConstructor は Lombok のアノテーションです。LombokはJavaの開発を効率化するライブラリです。
 * アノテーションを付けるだけでgetterやsetterなどのコードを自動生成してくれます。
 * @Data アノテーション：「getter/setter、toString、hashCode、equals」のメソッドを生成します。
 * @AllArgsConstructor アノテーション：すべてのフィールドを引数に持つコンストラクタを生成します。 */

@Data
@AllArgsConstructor
public class Member {
	private int id;
	private String name;
	private String gender;
	private int age;
}


