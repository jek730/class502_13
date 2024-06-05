package member;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Board {
    private int seq;
    private String poester;
    private String subject;
    private String content;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}