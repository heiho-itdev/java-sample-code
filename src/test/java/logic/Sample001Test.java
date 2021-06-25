package logic;

import dataobject.TestDTO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Sample001Test {

    /**
     * オブジェクト作成なし
     */
    @Test
    public void sample001_create_no_object() {

        //テスト対象クラスのメソッドを実行
        List<TestDTO> testDTOList = new Sample001().getTestDTOList(0);

        assertNull(testDTOList);
    }
    /**
     * オブジェクト作成1個
     */
    @Test
    public void sample001_create_1_object() {

        //テスト対象クラスのメソッドを実行
        List<TestDTO> testDTOList = new Sample001().getTestDTOList(1);

        //期待値確認
        assertEquals(testDTOList.size(), 1);
        assertEquals(testDTOList.get(0).getTestSubList().size(), 3);
    }

    /**
     * オブジェクト作成2個
     */
    @Test
    public void sample001_create_2_object() {

        //テスト対象クラスのメソッドを実行
        List<TestDTO> testDTOList = new Sample001().getTestDTOList(2);

        //期待値確認
        assertEquals(testDTOList.size(), 2);
        assertEquals(testDTOList.get(0).getTestSubList().size(), 3);
        assertEquals(testDTOList.get(1).getTestSubList().size(), 3);
    }
}