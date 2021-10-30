package ar.edu.unlam.kmm.ejemplosqldelight.db

import com.squareup.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}