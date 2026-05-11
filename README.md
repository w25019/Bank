
# 🏦 Bank Management System

## 📝 概要

Javaで開発したコンソールベースの銀行管理システムです。
口座作成、入金、出金、送金、口座情報表示などの基本的な銀行機能を実装しました。

## 🛠 技術スタック

* Java
* OOP（オブジェクト指向プログラミング）
* LinkedList
* BigDecimal

## 💡 主な機能

* 7桁の口座番号を自動生成
* 新規口座作成
* 入金 / 出金
* 口座間送金
* 口座情報表示
* システム終了機能

## 🎯 工夫した点

* 重複しない口座番号を自動生成
* BigDecimalを利用して金額計算の精度を向上
* OOPを意識してクラスごとに役割を分割
* メニュー形式で直感的に操作できるよう設計

## 📸 Screenshots

<table>
  <tr>
    <td align="center"><b>Opening New Account</b></td>
    <td align="center"><b>View Account Details</b></td>
  </tr>
  <tr>
    <td valign="top" align="center" style="height:300px;">
      <img src="./Open a new acc.png" style="max-width:100%; max-height:300px;">
    </td>
    <td valign="top" align="center" style="height:300px;">
      <img src="./view account details.png" style="max-width:100%; max-height:300px;">
    </td>
  </tr>
  <tr>
    <td align="center"><b>Deposit</b></td>
    <td align="center"><b>Withdraw</b></td>
  </tr>
  <tr>
    <td valign="top" align="center" style="height:300px;">
      <img src="./deposit.png" style="max-width:100%; max-height:300px;">
    </td>
    <td valign="top" align="center" style="height:300px;">
      <img src="./withdraw.png" style="max-width:100%; max-height:300px;">
    </td>
  </tr>
    <tr>
    <td align="center"><b>Tansfer</b></td>
    <td align="center"><b>Checking After Transferring</b></td>
  </tr>
  <tr>
    <td valign="top" align="center" style="height:300px;">
      <img src="./transfer.png" style="max-width:100%; max-height:300px;">
    </td>
    <td valign="top" align="center" style="height:300px;">
      <img src="./after transfer.png" style="max-width:100%; max-height:300px;">
    </td>
  </tr>
    <tr>
    <td align="center"><b>Incorrect withdraw</b></td>
      <td align="center"><b>Exit</b></td>
  </tr>
  <tr>
    <td valign="top" align="center" style="height:300px;">
      <img src="./unavailable withdraw.png" style="max-width:100%; max-height:300px;">
    </td>
     <td valign="top" align="center" style="height:300px;">
      <img src="./exit.png" style="max-width:100%; max-height:300px;">
    </td>
  </tr>
</table>

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
