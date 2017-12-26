package db.migration.postgresql

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration
import org.springframework.jdbc.core.JdbcTemplate

class V3__Update_downtown_locations : SpringJdbcMigration {

    override fun migrate(jdbcTemplate: JdbcTemplate) {
        jdbcTemplate.batchUpdate("""
                |update Downtown set latitude = ?, longitude = ?
                |  where prefecture_code = ? and code1 = ? and code2 = ?
                """.trimMargin(), listOf(
                arrayOf(35.278874, 139.670039, 14, 201, 1), // 中央地区
                arrayOf(35.671267, 139.764937, 13, 102, 13), // 銀座地域
                arrayOf(34.679018, 135.180669, 28, 110, 80), // ハーバーランド地区
                arrayOf(35.429836, 139.558741, 14, 110, 9), // オーロラシティ
                arrayOf(35.163670, 136.907380, 23, 106, 47), // 名古屋PARCO
                arrayOf(34.663151, 135.504078, 27, 128, 27), // なんさん通り
                arrayOf(33.589130, 130.398821, 40, 133, 27), // ソラリアプラザ商店会、ソラリアステージ商店会、VIOROテナント会、天神サザン通り会(天神二丁目付近）
                arrayOf(35.704825, 139.581128, 13, 203, 2), // 吉祥寺駅北口
                arrayOf(43.067609, 141.352720, 1, 101, 1), // 駅前通商店街・エスタ名店街
                arrayOf(35.649558, 139.912560, 12, 227, 10), // 京葉線新浦安駅周辺集積地区
                arrayOf(35.171177, 136.883928, 23, 105, 27), // 名駅一丁目商業集積地区
                arrayOf(34.645896, 135.513968, 27, 119, 33), // 近鉄百貨店とその周辺（あべのハルカス）
                arrayOf(35.578167, 139.558203, 14, 117, 11), // たまプラーザ東急ＳＣ、たまプラーザテラス
                arrayOf(35.858448, 139.655842, 11, 107, 60), // コルソ商店街（浦和コルソ）
                arrayOf(35.904774, 139.622022, 11, 103, 86), // 大宮スカイビル商店会
                arrayOf(35.972944, 139.590764, 11, 219, 32), // 埼玉県上尾市仲町一丁目
                arrayOf(36.094349, 136.251143, 18, 201, 62), // 大和田町ロードサイド商業集積地区（福井県）
                arrayOf(35.553628, 139.417372, 14, 153, 77), // 古淵地区（商店会等を除く）
                arrayOf(35.842147, 139.855925, 11, 237, 22), // 三郷インター複合商業地区
                arrayOf(34.665441, 135.519624, 27, 109, 18), // 近鉄百貨店及び上本町駅南商店会
                arrayOf(35.532466, 139.435789, 14, 153, 78), // 相模大野駅周辺地区（商店会等を除く）
                arrayOf(43.009338, 144.407111, 1, 661, 1) // セチリ太商業集積地区（釧路町）
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
//                arrayOf(, , ,), //
        ))
    }
}