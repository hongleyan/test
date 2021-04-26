import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Testpo {
    private String id;
    private String amount;
    private String name;
}
