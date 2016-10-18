# 平成28年度　ゲーム開発

## 1.実装機能＜Implementation Features＞
- [ ] 1280*720に画面サイズを固定
- [x] ゲームタイトル画面＜StartFrame＞
  - [x] タイトル表示
  - [x] ゲームスタートボタン
    - [x] ゲーム概要表示
      - [ ] ゲーム概要説明文の表示
      - [ ] イラスト1の表示
      - [ ] イラスト2の表示
      - [ ] イラスト3の表示
    - [x] 00秒経過後、名前入力画面表示（＜PlayerNameFrame＞　へ）
  - [x] ランキング表示ボタン
    - [x] ランキング画面表示（＜RankingFrame＞　へ）
- [x] 名前入力画面＜PlayerNameFrame＞
  - [x] 名前入力の説明文
  - [x] 名前入力のテキストフィールド
    - [x] 名前の取得＜（PlayerNameFrame.）name＞
  - [x] 決定ボタン
    - [x] 学科選択画面表示（＜DepartmentFrame＞　へ）
- [x] 学科選択画面＜DepartmentFramae＞
  - [ ] 学科選択用イラストの表示
  - [ ] 選択用の説明表示
    - [ ] 機械工学科の説明表示
    - [ ] 電気電子工学科の説明表示
    - [ ] 制御工学科の説明表示
    - [ ] 情報工学科の説明表示
    - [ ] 都市環境デザイン工学科の説明表示
  - [ ] 決定ボタン
    - [ ] 操作説明画面（チュートリアル）表示（＜TutorialFrame＞　へ）
- [ ] 操作説明画面（チュートリアル）＜TutorialFrame＞
  - [ ] 背景の表示
  - [ ] フィールドの表示
  - [ ] キャラクターの表示・プロパティの設定
  - [ ] キャラクターの移動
  - [ ] キャラクターのジャンプ
  - [ ] キャラクターの攻撃
  - [ ] キャラクターのスキルの実装
  - [ ] 敵の表示・プロパティの設定
  - [ ] 敵の移動
  - [ ] 敵の攻撃
  - [ ] 敵の透過処理
  - [ ] 敵の変数＜ene1,ene1_5,ene2,ene3,boss＞
  - [ ] スコア関連変数＜落単なし:full,単位数:tani,残り時間:limi,進卒ボーナス:next,ノーダメ:damage,コンボ:com,同時:douzi＞
  - [ ] ステージ画面の
- [ ] ステージ画面＜Stage（学科）Frame＞
  - [ ] 機械工学科ステージ＜StageMFrame＞
  - [ ] 電気電子工学科ステージ＜StageEFrame＞
  - [ ] 電子制御工学科ステージ＜StageSFrame＞
  - [ ] 情報工学科ステージ＜StageIFrame＞
    - [ ] Not Decided
  - [ ] 都市環境デザイン工学科＜StageCFrame＞
  - [ ] 結果画面（＜ResultFrame＞　へ）
- [ ] 結果画面＜ResultFrame＞
  - [ ] Not Decided
  - [ ] Not Decided
  - [ ] プレイヤーのデータを保存（txtまたは、csv形式で）
  - [ ] 00秒経過後、ランキング画面表示（＜RankingFrame＞　へ）
- [x] ランキング画面＜RankingFrame＞
  - [ ] 順位（1～7位）、プレイヤー名、スコア、卒留判定の表示
  - [ ] ランキングのデータを保存（txtまたは、csv形式で）
  - [ ] 00秒経過後、ゲームタイトル画面表示（＜StartFrame＞　へ）

***

## 2.開発環境＜Develop Environment＞
### 統合開発環境・エンジン
+ Eclipse NEON 4.6

### 言語＜Language＞
+ Java

### OS＜Operating System＞
+ Windows7
+ Windows10

### エディタ＜Editor＞
+ Eclipse搭載のエディタ

### コンパイラ＜Compiler＞
+ Java SE

### バージョン管理＜Version Management＞
+ GitHub
