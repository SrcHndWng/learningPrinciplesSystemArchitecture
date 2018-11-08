# chapter8

CHAPTER8を写経、改変したもの。

Spring Bootにて実装。

## books

chapter7/books のドメインオブジェクトからレスポンスオブジェクトを生成する例。

ただし複数件のデータを返却するため、メソッド名を「fromBooks」に変更。

* 実行コマンド例

    ```
    curl localhost:8080/list
    ```