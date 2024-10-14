package org.pgm.expro.vo;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardVO {
    private Long bno;
    private String title;
    private String content;
    private String writer;
    private LocalDate postdate;
    private boolean visitcount;
}
