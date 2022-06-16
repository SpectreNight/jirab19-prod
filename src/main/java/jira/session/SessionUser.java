package jira.session;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class SessionUser {
    private Long id;
    private String username;

}
