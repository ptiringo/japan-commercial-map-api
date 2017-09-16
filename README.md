# 日本商業規模マップ API [![Build Status](https://travis-ci.org/ptiringo/japan-commercial-map-api.svg?branch=master)](https://travis-ci.org/ptiringo/japan-commercial-map-api)
## 本システムの目的
[経済産業省の平成26年商業統計](http://www.meti.go.jp/statistics/tyo/syougyo/result-2.html)の[立地環境特性別統計編（小売業）内の第 10 表](http://www.meti.go.jp/statistics/tyo/syougyo/result-2/h26/index-ricchidata.html)の情報を元に、日本国内における都市の小売の商業規模を取得するための API を作成する。

## API の利用方法
検討中

## 開発用メモ
### プロファイル
Gradle の -P オプションで spring.profiles.active を渡します。  
オプションを付与しない場合、`development`がデフォルトで使用されます。

例）`./gradlew -Pspring.profiles.active=production build`

| プロファイル | 用途   |
| ------------ | ------ |
| development  | 開発用 |
| production   | 本番   |

### ローカル
#### 実行
`./gradlew bootRun`

#### ビルド
`./gradlew build`

#### 依存性のバージョンアップがないかの確認
`./gradlew dependencyUpdates`

#### ローカルでの開発環境 (DB) の立ち上げ
`docker-compose up -d`

#### heroku local

```
./gradlew build
heroku local -e .env.local
```

#### Docker
##### イメージ作成
`./gradlew docker`

##### コンテナー作成
`./gradlew dockerRun`

### 開発ツール
| 名前                   | URL                            |
| ---------------------- | ------------------------------ |
| HAL Browser            | http://localhost:5000/api      |
| HAL Browser (Actuator) | http://localhost:5000/actuator |