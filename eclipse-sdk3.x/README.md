# eclipse-sdk3.x のJARをローカルリポジトリに登録

このプロジェクトは、Eclipse SDK 3.x の plugins フォルダに含まれるJARファイルを
Mavenのローカルリポジトリに取り込みをサポートするためものです。

Eclipse 4.x 世代からは、eclipse.org により Mavenセントラル・リポジトリにJARファイルが登録されるようになりましたがそれ以前(2018年以前) は自分で関連JARファイルを取り寄せる形になります。

都度その操作を行うのは面倒なので、こちらで提供する `build.gradle`ファイルを利用して
自分のマシンの ローカル・リポジトリに 関連JARを登録してしまいましょう。

## 古い Eclipse SDKの入手

[eclipse project archived downloads ](https://archive.eclipse.org/eclipse/downloads/)
にアクセスして、Build Name を頼りに対象バージョンの Eclipse SDK の zip ファイルを入手しましょう。

作者の手元で試したのは `eclipse-SDK-3.4.2-win32-x86_64.zip` です。

RCPバイナリ.zip でも同様なファイル構成なので動作するかもしれません。

## build.gradleの修正と実行

`build.gradle`ファイルの先頭部に `eclipsePluginsDir` でプラグインフォルダの場所を調整している個所がありますので
そのパスを修正して gradle の　`installEclipseArtifacts` タスクを動かしてください。

```cmd
..\gradlew.bat installEclipseArtifacts
```

JARがうまく検出されれば、それぞれのJARをどの Artifacts名で登録したか示してくれます。


