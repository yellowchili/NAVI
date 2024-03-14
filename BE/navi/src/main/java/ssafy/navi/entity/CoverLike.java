package ssafy.navi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CoverLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cover_like_pk")
    private Long id;
    
    //==외래키==//
    
    // 좋아요 한 게시물
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cover_pk")
    private Cover cover;

    // 좋아요 누른 사람
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_pk")
    private User user;

    @Builder
    public CoverLike (Long coverPk,User user){
        this.id=coverPk;
        this.user=user;
    }
}
