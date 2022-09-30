<?php    


class TestCasePHPSQL
{

    public function test1($aaa, $list)
    {

        $a = $b;

        $query = "SELECT " . $select . " FROM TEST WHERE TEST IN ('" . implode("','", $list->test_data) . "') ";

        $c = $d;

    }

    public function test2($list)
    {

        $a = $b;

        $query = "SELECT " . $select . " FROM TEST WHERE TEST IN ('" . implode("','", $list->test_data) . "') ";

        $c = $d;

    }

    public function test3($aaaa,$list,$bbb,$cccc)
    {

        $a = $b;

        $query = "SELECT " . " FROM TEST WHERE TEST IN ('" . implode("','", $list) . "') ";

        $c = $d;

    }

    public function test4($aaaa,$list,$bbb,$cccc)
    {

        $a = $b;

        $query = "SELECT " . "sss" . a($bbb);

        $c = $d;

    }

    public function test5($aaaa,$list,$bbb,$cccc)
    {

        $a = $b;

        $query = "select " . $bbb;

        $c = $d;

    }

    public function test6($aaaa,$list,$bbb,$cccc)
    {

        $a = $b;

        $copied = $bbb;

        $query = "SELECT " . $copied;

        $c = $d;

    }  

    public function test7($aaaa,$list,$bbb,$cccc)
    {

        $a = $b;

        $copied = $bbb;
        $copiedbis = $copied;

        $query = "SELECT " . $copiedbis;

        $c = $d;

    }   

    public function test8($aaa, $list)
    {

        $a = $b;

        $query = "SELECT " . $select . " FROM TEST WHERE TEST IN ('" . implode("','", $list.test_data) . "') ";

        $c = $d;

    }    


    public function test9($aaaa,$list,$bbb,$cccc)
    {

        $a = $b;

        $copied = $bbb->test;

        $query = "SELECT " . $copied;

        $c = $d;

    } 

    public function test10($aaaa,$list,$bbb,$cccc)
    {

        $a = $b;

        $copied = $bbb.test;

        $query = "SELECT " . $copied;

        $c = $d;

    }    

    public function test11($aaaa,$list,$bbb,$cccc)
    {

        $a = $b;

        $copied = $bbb.test;

        $query = "SELECT * FROM " . $copied;

        $c = $d;

    } 
     public function test12(string $type, string $name)
     {
    

        $a = $b;
        
        $query = "SELECT Id,Name FROM " . $aaa . " WHERE Name LIKE '{$name}%'";
        

    }

    public function test13(string $type, string $name)
     {
    

        $a = $b;
        
        $query = "SELECT Id,Name FROM " . $aaa . " WHERE Name LIKE '{$name->ssss}%'";
        

    }

    function test14(string $type, string $name)
     {
    

        $a = $name->ssss;
        
        $query = "SELECT Id,Name FROM " . $aaa . " WHERE Name LIKE '{$a}%'";
        

    }

    public function test15(string $type, string $name)
     {
    

        $a = $b;
        
        $query = "SELECT Id,Name FROM TEST WHERE Name LIKE '{$name}%'";
        

    }

    public function test16(string $type, string $name)
     {
    

        $a = $name;
        
        $query = "SELECT Id,Name FROM TEST WHERE Name LIKE '{$a}%'";
        

    }    

    public function test17(string $type, string $name)
     {
    

        $a = $b;
        
        executeQuery("SELECT Id,Name FROM TEST WHERE Name LIKE '{$name}%'");
        

    }


    public function test18(string $type, string $name)
     {
    

        $a = $name;
        
        executeQuery("SELECT Id,Name FROM TEST WHERE Name LIKE '{$a}%'");
        

    }    

    public function test19(string $type, string $name)
     {
        

        $hhhh = "aAAAA '{$name}%'";

        $a = $b;
        
        $query = "SELECT Id,Name FROM TEST WHERE Name LIKE '{$a}%'";
        

    }


    public function test20(string $type, string $name)
     {
    

        $a = $b;
        
        $gg = executeQuery("SELECT Id,Name FROM TEST WHERE Name LIKE '{$name}%'");
        

    }



 



    public static function test21($test, $name = 'public'): array
    {
        
        $sql = "SELECT name FROM test WHEN attr = " . $name;
        
    }

    public static function test22($test, $name = 'public'): array
    {

        $sql = "TEST" . $name . "TEST2";

    }






}

?>