package dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestSubDTO {
    /**
     * テストID
     */
    private Long testId;
    /**
     * テストSUBID
     */
    private Long testSubId;
    /**
     * テストSUBNAME
     */
    private String testSubName;
}
