package ssafy.navi.dto.user;

import lombok.*;
import ssafy.navi.entity.user.Follow;

@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FollowingDto {

    private Long id;
    private UserDto toUser;

    // 엔티티 Dto로 변환
    public static FollowingDto convertToDto(Follow follow) {
        FollowingDto followDto = new FollowingDto();

        // set
        followDto.setId(follow.getId());
        followDto.setToUser(UserDto.convertToDto(follow.getToUser()));

        return followDto;
    }
}
