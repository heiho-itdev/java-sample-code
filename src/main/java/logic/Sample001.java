package logic;

import dataobject.TestDTO;
import dataobject.TestSubDTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample001 {

    static final String DEF_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";

    /**
     * 階層ありのオブジェクトぐるぐるポンって作って返すやつ
     * @param count 何個つくる？
     * @return List<TestDTO>
     */
    public List<TestDTO> getTestDTOList(int count) {

        //0ならnull返す
        if (count < 1) return null;

        //pk生成
        long testId = 0L;
        //count分オブジェクト生成
        return Stream.generate(() -> {
            TestDTO dto = new TestDTO(
                    testId + 1L,
                    "testName".concat(getNow()),
                    null);
            //pk生成
            long testSubId = 0L;
            //とりあえず3個オブジェクト生成
            dto.setTestSubList(
                    Stream.generate(() -> new TestSubDTO(
                            dto.getTestId(),
                            testSubId + 1L,
                            "testSubName".concat(getNow()))).limit(3).collect(Collectors.toList())
            );
            return dto;
        }).limit(count).collect(Collectors.toList());
    }

    /**
     * 現在日時かえすやつ
     * @return  String(yyyy/MM/dd HH:mm:ss)
     */
    private String getNow() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DEF_TIME_FORMAT));
    }
}
