package dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {
    /**
     * テストID
     */
    private Long testId;
    /**
     * テストname
     */
    private String testName;
    /**
     * テストname
     */
    private List<TestSubDTO> testList;
}
