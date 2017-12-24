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
                arrayOf(35.649558, 139.912560, 12, 227, 10) // 京葉線新浦安駅周辺集積地区
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