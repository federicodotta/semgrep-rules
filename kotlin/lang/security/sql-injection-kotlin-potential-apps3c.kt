package a.b.c.d

class TestDao(private val db: Test) {

    suspend fun testFunc(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        db.query {
            TransactionManager.current().exec("SELECT " + _userId + "FROM DUAL")
            TransactionManager.current().exec("SELECT ".plus(_userId).plus("FROM DUAL"))
            val builder = StringBuilder()            
            TransactionManager.current().exec(builder.append("SELECT ").append(_userId).append("FROM DUAL"))

            TransactionManager.current().exec(
                """
                SELECT d AS date,
                       c as count
                FROM testTable
                WHERE user_id = '$_userId';
                """
            )

        }
        return result
    }    

    suspend fun testFunc2(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        db.query {
            TransactionManager.current().exec("SELECT " + _userId + "FROM DUAL")
            TransactionManager.current().exec("SELECT ".plus(_userId).plus("FROM DUAL"))
            val builder = StringBuilder()            
            TransactionManager.current().exec(builder.append("SELECT ").append(_userId).append("FROM DUAL"))

        }
        return result
    } 

    suspend fun testFunc3(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        val query = "SELECT ".plus(_userId).plus("FROM DUAL")

        db.query {
            TransactionManager.current().exec(query)

        }
        return result
    }    

    suspend fun testFunc4(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        val builder = StringBuilder()    
        val query = builder.append("SELECT ").append(_userId).append("FROM DUAL")

        db.query {
            TransactionManager.current().exec(query)

        }
        return result
    }   

    suspend fun testFunc5(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        val query = "SELECT " + _userId + "FROM DUAL"

        db.query {
            TransactionManager.current().exec(query)

        }
        return result
    }        

    suspend fun testFunc6(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        val copy = _userId

        val query = "SELECT * FROM DUAL WHERE user_id = '$copy'";

        db.query {
            TransactionManager.current().exec(copy)

        }
        return result
    } 

    suspend fun testFunc7(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        val copy = _userId
        val query = "SELECT ".plus(copy).plus("FROM DUAL")

        db.query {
            TransactionManager.current().exec(query)

        }
        return result
    }    

    suspend fun testFunc8(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        val builder = StringBuilder() 
        val copy = _userId   
        val query = builder.append("SELECT ").append(copy).append("FROM DUAL")

        db.query {
            TransactionManager.current().exec(query)

        }
        return result
    }   

    suspend fun testFunc9(
        _userId: UUID
    ): LinkedHashMap<String, Pair<Number, List<UUID>>> {
        
        val copy = _userId
        val query = "SELECT " + copy + "FROM DUAL"

        db.query {
            TransactionManager.current().exec(query)

        }
        return result
    }   


    // Lambda - Seems to be not supported for the moment in Kotlin (beta maturity level) 
    private val testVar1 = { field: String ->
        """
            UPDATE test
            SET $field = 2
            WHERE id = 2
        """.trimIndent()
    }            

    // Lambda - Seems to be not supported for the moment in Kotlin (beta maturity level)
    private val testVar2 = { field: String ->
        "UPDATE test SET $field = 2 WHERE id = 2".trimIndent()
    }   

    // Lambda - Seems to be not supported for the moment in Kotlin (beta maturity level)
    private val testVar3 = { field: String ->
        "UPDATE test SET " + field + " = 2 WHERE id = 2".trimIndent()
    }       

    // Lambda - Seems to be not supported for the moment in Kotlin (beta maturity level)
    private val testVar4 = { field: String ->
        "UPDATE test SET ".plus(field).plus(" = 2 WHERE id = 2".trimIndent())
    }       
    
    // Lambda - Seems to be not supported for the moment in Kotlin (beta maturity level)
    private val testVar5 = { field: String -> {
        val builder = StringBuilder()  
        builder.append("UPDATE test SET ").append(field).append(" = 2 WHERE id = 2")
    }}       
    
    /*
    // This lambda should be valid in Kotlin but causes errors in semgrep (parameters not supplied)
    private val testVar6 = { field: String ->
        """
            UPDATE test
            SET $field = $1
            WHERE id = $2
        """.trimIndent()
    }*/  


}
