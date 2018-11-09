# learningPrinciplesSystemArchitecture

[現場で役立つシステム設計の原則〜変更を楽で安全にするオブジェクト指向の実践技法](https://gihyo.jp/book/2017/978-4-7741-9087-7)

こちらの学習のために写経、改変したもの。

CHAPTER毎に以下のフォルダに格納してある。

## chapter1

CHAPTER1を写経、改変したもの。

### VariableForPurpose

「目的ごとに変数を用意する」～「メソッドは短く、クラスは小さく」を写経、改変したもの。

### Quantity

「正しい数量を扱うための独自クラスを定義する」を写経、改変したもの。

## chapter2

CHAPTER2を写経、改変したもの。

Spring Bootにて実装。

### enum

「Javaの列挙型を使えばもっとかんたん」を写経、改変したもの。

### stateSample

「状態の遷移のルールをわかりやすく記述する」を写経、改変したもの。

状態(State)パターンに相当。

## chapter4

CHAPTER4を写経、改変したもの。

Spring Bootにて実装。

### duedate

「期日（DueDate）パターン」を写経、改変したもの。

## chapter5

CHAPTER5を写経、改変したもの。

Spring Bootにて実装。

### sampleDdd

預金引き出しのサンプルソースを写経、改変したもの。

* 実行コマンド例

    ```
    curl localhost:8080/withdraw?money=3000
    ```

## chapter7

CHAPTER7を写経、改変したもの。

Spring Bootにて実装。

### books

「画面（視覚表現）とソフトウェア（論理構造）を関連付ける」を写経、改変したもの。

コンソールに本の一覧を表示。

## chapter8

CHAPTER8を写経、改変したもの。

Spring Bootにて実装。

### books

chapter7/books のドメインオブジェクトからレスポンスオブジェクトを生成する例。

ただし複数件のデータを返却するため、メソッド名を「fromBooks」に変更。

* 実行コマンド例

    ```
    curl localhost:8080/books
    ```