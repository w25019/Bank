# 銀行管理システム (Bank Management System)

Javaで開発したコンソールベースの銀行管理システムです。
このプロジェクトでは、口座作成、入金、出金、送金、口座情報の確認などを行うことができます。

## 主な機能

* 新しい口座の作成
* 7桁の口座番号を自動生成
* 入金
* 出金
* 口座間送金
* 口座情報の表示
* システム終了

## 使用技術

* Java
* オブジェクト指向プログラミング (OOP)
* LinkedList
* BigDecimal
* Scanner

## ファイル構成

```text
Bank/
│
├── BankProgramming.java
├── Bank.java
├── Account.java
```

## 実行方法

### コンパイル

```bash
javac BankProgramming.java Bank.java Account.java
```

### 実行

```bash
java BankProgramming
```

## メニュー画面

```text
--- Bank Menu ---
1. View account details
2. Transfer money
3. Deposit
4. Withdraw
5. Open a new account
6. Exit
```

## 学習した内容

* クラスとオブジェクト
* コンストラクタ
* メソッド
* カプセル化
* 繰り返し処理
* 条件分岐
* ランダムな口座番号生成
* LinkedListの利用

## 今後追加したい機能

* ファイルまたはデータベースへの保存
* ログイン機能
* GUI版の開発
* 取引履歴
* 利息計算機能

## 作成者

Yoon Ei Phyo
